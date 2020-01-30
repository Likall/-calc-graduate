package pers.ll.gacs.easyexcel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pers.ll.gacs.po.Course;
import pers.ll.gacs.service.CourseService;

import java.util.ArrayList;
import java.util.List;

public abstract class CourseReadListener extends AnalysisEventListener<Course> {

    private CourseService courseService;

    private static final Logger LOGGER = LoggerFactory.getLogger(CourseReadListener.class);
    private static final int MAX_COUNT = 3000;
    private List<Course> list = new ArrayList<>();

    public CourseReadListener(CourseService courseService) {
        this.courseService = courseService;
    }

    /**
     * 这个每一条数据解析都会来调用
     *
     * @param data
     *            one row value. Is is same as {@link AnalysisContext#readRowHolder()}
     * @param context
     */
    @Override
    public void invoke(Course data, AnalysisContext context) {
        LOGGER.info("解析到一条数据:{}", JSON.toJSONString(data));
        list.add(data);
        onResult(list, false);
    }

    /**
     * 所有数据解析完成了 都会来调用
     *
     * @param context
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        // 这里也要保存数据，确保最后遗留的数据也存储到数据库
        LOGGER.info("所有数据解析完成！");
        onResult(list, true);
    }

    public abstract void onResult(List<Course> list, boolean finish);
}
