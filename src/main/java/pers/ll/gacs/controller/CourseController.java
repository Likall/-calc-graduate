package pers.ll.gacs.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pers.ll.gacs.common.Result;
import pers.ll.gacs.po.Course;
import pers.ll.gacs.po.PageInfoPo;
import pers.ll.gacs.service.ICourseService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

@RestController
@RequestMapping(value = "/course")
public class CourseController extends BaseController {

    @Autowired
    ICourseService ICourseService;

    /*
     * 上传课程信息
     * */
    @RequestMapping(value = "/uploadfile", method = RequestMethod.POST)
    public Result uploadCsvFile(@RequestParam("file") MultipartFile file) {
        // 将csv文件内容转成bean
        if (ObjectUtils.isEmpty(file)){
            return Result.fail_500("文件不能为空");
        }
            InputStreamReader isr = null;
            BufferedReader br = null;
            try {
                isr = new InputStreamReader(file.getInputStream());
                br = new BufferedReader(isr);
                String line = null;
                List<List<String>> strs = new ArrayList<List<String>>();
                while ((line = br.readLine()) != null) {
                    strs.add(Arrays.asList(line.split(",")));
                }
                System.out.println(strs);
                int i;
                boolean flag = false;
                for (i = 0; i < strs.size(); i++){
                    Course course = new Course();
//                  插入学生信息,从第二条信息开始插入
                    if (i > 0){
                        course.setCourseId(strs.get(i).get(0));
                        course.setCourseName(strs.get(i).get(1));
                        course.setCourseCredit(strs.get(i).get(2));
                        course.setCourseTerm(strs.get(i).get(3));
                        course.setCourseTotalGrade(strs.get(i).get(4));
                        course.setCourseAverage(Double.parseDouble(strs.get(i).get(5)));
                        if (ICourseService.insertAllCourse(course)){
                            flag = true;
                        }else {
                            flag = false;
                        }
                    }
                }
                if (flag){
                    logger.info("上传成功");
                    return Result.ok("上传成功");
                }
            } catch (IOException e){
                e.printStackTrace();
                logger.info("上传失败"+e.getMessage());
                return Result.fail_500("上传失败"+e.getMessage());
            } finally {
                try {
                    if (br != null){
                        br.close();
                    }
                    if (isr != null){
                        isr.close();
                    }
                    logger.info("111上传成功");
                    return Result.ok("上传成功");
                } catch (IOException e) {
                    e.printStackTrace();
                    logger.info("2上传失败");
                    return Result.fail_500("上传失败"+e.getMessage());
                }
        }
    }

    /*
     * 获取课程信息
     * */
    @RequestMapping(value = "/getAllCourse", method = RequestMethod.POST)
    public Result getAllCourseList(PageInfoPo pageInfo){
        try {
            System.out.println(pageInfo.getPage());
            System.out.println(pageInfo.getPageSize());
            Map<String,Object> resultMap = ICourseService.getAllCourse(pageInfo.getPage(), pageInfo.getPageSize());
            return Result.ok(resultMap);
        } catch (Exception e){
            e.printStackTrace();
            return Result.fail_500(e.getMessage());
        }

    }

    /*
    * 更新课程信息
    * */
    @RequestMapping(value = "/updateCourse", method = RequestMethod.POST)
    public Result updataCourseInfo(@RequestBody  Course course){
        System.out.println(course);
        try {
            if(ICourseService.updateCourseById(course)){
                return Result.ok("修改课程信息成功");
            }else{
                return Result.fail_500("修改课程信息失败");
            }
        } catch(Exception e){
            return Result.fail_500(e.getMessage());
        }
    }

    /*
     * 删除某门课程
     * */
    @RequestMapping(value = "/deleteCourse", method = RequestMethod.POST)
    public Result deleteCourseInfo(@RequestBody Course course){
        System.out.println(course);
        try {
            if (ICourseService.deleteCourseById(course)){
                return Result.ok("删除成功");
            }else{
                return Result.fail_500("删除失败");
            }
        } catch (Exception e){
            e.printStackTrace();
            return Result.fail_500(e.getMessage());
        }
    }
}
