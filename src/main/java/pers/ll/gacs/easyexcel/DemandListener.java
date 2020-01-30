package pers.ll.gacs.easyexcel;


import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pers.ll.gacs.po.Demand_1;
import pers.ll.gacs.po.Demand_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * 毕业要求一级二级excel解析及数据处理监听器
 */
public abstract class DemandListener extends AnalysisEventListener<Map<Integer, String>> {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemandListener.class);
    /**
     * 每隔5条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 5;
    private List<Map<Integer, String>> list = new ArrayList<Map<Integer, String>>();
    private List<Demand_1> demand1List = new ArrayList<>();
    private String demand1Id = "";
    private Demand_1 demand1;

    @Override
    public void invoke(Map<Integer, String> data, AnalysisContext context) {
        LOGGER.info("解析到一条数据:{}", JSON.toJSONString(data));
        demand1Id = "";
        demand1List.clear();
        demand1 = new Demand_1();
        List<Demand_2> demand2List = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : data.entrySet()) {
            // 每一行即为一个map,其中第一条数据解析为一级毕业要求，其后均为其所属二级毕业要求，设置主外键关系
            if (entry.getKey() == 0) {
                demand1Id = UUID.randomUUID().toString();
                demand1.setDemand1Id(demand1Id);
                demand1.setName(entry.getValue());
                demand1List.add(demand1);
            } else {
                Demand_2 demand2 = new Demand_2();
                demand2.setDemand2Id(UUID.randomUUID().toString());
                demand2.setDemand1Id(demand1Id);
                demand2.setName(entry.getValue());
                demand2List.add(demand2);
                demand1.setDemand2List(demand2List);
            }
        }
        list.add(data);
        onResult(demand1List, false);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        saveData();
        LOGGER.info("所有数据解析完成！");
        onResult(demand1List, true);
    }

    @Override
    public void invokeHead(Map<Integer, CellData> headMap, AnalysisContext context) {
        LOGGER.info("得到CellData:{}", JSON.toJSONString(headMap));
    }

    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        LOGGER.info("得到headMap:{}", JSON.toJSONString(headMap));
    }

    @Override
    public void onException(Exception exception, AnalysisContext context) throws Exception {
        LOGGER.info("读取出错", exception);
    }

    /**
     * 加上存储数据库
     */
    private void saveData() {
        LOGGER.info("{}条数据，开始存储数据库！", list.size());
        LOGGER.info("存储数据库成功！");
    }

    protected abstract void onResult(List<Demand_1> demand1List, boolean finished);
}
