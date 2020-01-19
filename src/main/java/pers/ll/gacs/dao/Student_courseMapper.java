package pers.ll.gacs.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.ll.gacs.po.Student_course;
import pers.ll.gacs.po.Student_courseExample;

public interface Student_courseMapper {
    int countByExample(Student_courseExample example);

    int deleteByExample(Student_courseExample example);

    int insert(Student_course record);

    int insertSelective(Student_course record);

    List<Student_course> selectByExample(Student_courseExample example);

    int updateByExampleSelective(@Param("record") Student_course record, @Param("example") Student_courseExample example);

    int updateByExample(@Param("record") Student_course record, @Param("example") Student_courseExample example);
}