package pers.ll.gacs.dao;


import org.springframework.stereotype.Repository;
import pers.ll.gacs.po.Course;

@Repository
public interface CourseMapper {
    // 插入所有课程信息
    int insertAllCourse(Course course);
}