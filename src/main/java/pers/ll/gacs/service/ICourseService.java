package pers.ll.gacs.service;

import pers.ll.gacs.po.Course;

import java.util.List;
import java.util.Map;

public interface ICourseService {
    boolean insertAllCourse(Course course);

    Map<String,Object> getAllCourse(int page, int pageSize);

    boolean updateCourseById(Course course);

    boolean deleteCourseById(Course course);

    void save(List<Course> courseList);
}
