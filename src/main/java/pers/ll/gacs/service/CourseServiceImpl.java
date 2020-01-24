package pers.ll.gacs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.ll.gacs.dao.CourseMapper;
import pers.ll.gacs.po.Course;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;

    @Override
    public boolean insertAllCourse(Course course) {
        return courseMapper.insertAllCourse(course) > 0;
    }
}
