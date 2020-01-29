package pers.ll.gacs.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.ll.gacs.dao.CourseMapper;
import pers.ll.gacs.po.Course;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CourseService implements ICourseService {
    @Autowired
    private CourseMapper courseMapper;

    @Override
    public boolean insertAllCourse(Course course) {
        return courseMapper.insertAllCourse(course) > 0;
    }

    @Override
    public Map<String,Object> getAllCourse(int page, int pageSize) {
        Map<String,Object> resultMap = new HashMap<>();
        PageHelper.startPage(page, pageSize);//第一条开始取数，取三条数据
        List<Map<String,Object>> list = courseMapper.queryAllCourse();
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<Map<String,Object>>(list);
        resultMap.put("count",pageInfo.getTotal());//获得总数
        resultMap.put("data",list);
        return resultMap;
    }

    @Override
    public boolean updateCourseById(Course course) {
        boolean isSuccess = courseMapper.updateCourseByCourseId(course) > 0;
        return isSuccess;
    }

    @Override
    public boolean deleteCourseById(Course course) {
        return courseMapper.deleteCourseByCourseId(course.getCourseId()) > 0;
    }
}
