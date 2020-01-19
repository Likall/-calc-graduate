package pers.ll.gacs.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.ll.gacs.po.Demand_2;
import pers.ll.gacs.po.Demand_2Example;

public interface Demand_2Mapper {
    int countByExample(Demand_2Example example);

    int deleteByExample(Demand_2Example example);

    int deleteByPrimaryKey(String demand2Id);

    int insert(Demand_2 record);

    int insertSelective(Demand_2 record);

    List<Demand_2> selectByExample(Demand_2Example example);

    Demand_2 selectByPrimaryKey(String demand2Id);

    int updateByExampleSelective(@Param("record") Demand_2 record, @Param("example") Demand_2Example example);

    int updateByExample(@Param("record") Demand_2 record, @Param("example") Demand_2Example example);

    int updateByPrimaryKeySelective(Demand_2 record);

    int updateByPrimaryKey(Demand_2 record);
}