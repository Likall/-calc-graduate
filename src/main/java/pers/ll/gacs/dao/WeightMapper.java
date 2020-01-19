package pers.ll.gacs.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.ll.gacs.po.Weight;
import pers.ll.gacs.po.WeightExample;

public interface WeightMapper {
    int countByExample(WeightExample example);

    int deleteByExample(WeightExample example);

    int deleteByPrimaryKey(String weightId);

    int insert(Weight record);

    int insertSelective(Weight record);

    List<Weight> selectByExample(WeightExample example);

    Weight selectByPrimaryKey(String weightId);

    int updateByExampleSelective(@Param("record") Weight record, @Param("example") WeightExample example);

    int updateByExample(@Param("record") Weight record, @Param("example") WeightExample example);

    int updateByPrimaryKeySelective(Weight record);

    int updateByPrimaryKey(Weight record);
}