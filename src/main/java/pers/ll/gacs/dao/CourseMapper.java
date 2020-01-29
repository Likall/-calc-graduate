package pers.ll.gacs.dao;


import org.springframework.stereotype.Repository;
import pers.ll.gacs.po.Course;

import java.util.List;
import java.util.Map;

@Repository
public interface CourseMapper {
    // 插入所有课程信息
    int insertAllCourse(Course course);

    List<Map<String,Object>> queryAllCourse();

    int updateCourseByCourseId(Course course);

    int deleteCourseByCourseId(String id);
}