package pers.ll.gacs.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.ll.gacs.po.Demand_grade;
import pers.ll.gacs.po.Demand_gradeExample;

public interface Demand_gradeMapper {
    int countByExample(Demand_gradeExample example);

    int deleteByExample(Demand_gradeExample example);

    int deleteByPrimaryKey(String demandGradeId);

    int insert(Demand_grade record);

    int insertSelective(Demand_grade record);

    List<Demand_grade> selectByExample(Demand_gradeExample example);

    Demand_grade selectByPrimaryKey(String demandGradeId);

    int updateByExampleSelective(@Param("record") Demand_grade record, @Param("example") Demand_gradeExample example);

    int updateByExample(@Param("record") Demand_grade record, @Param("example") Demand_gradeExample example);

    int updateByPrimaryKeySelective(Demand_grade record);

    int updateByPrimaryKey(Demand_grade record);
}