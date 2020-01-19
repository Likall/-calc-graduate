package pers.ll.gacs.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.ll.gacs.po.Demand_1;
import pers.ll.gacs.po.Demand_1Example;

public interface Demand_1Mapper {
    int countByExample(Demand_1Example example);

    int deleteByExample(Demand_1Example example);

    int insert(Demand_1 record);

    int insertSelective(Demand_1 record);

    List<Demand_1> selectByExample(Demand_1Example example);

    int updateByExampleSelective(@Param("record") Demand_1 record, @Param("example") Demand_1Example example);

    int updateByExample(@Param("record") Demand_1 record, @Param("example") Demand_1Example example);
}