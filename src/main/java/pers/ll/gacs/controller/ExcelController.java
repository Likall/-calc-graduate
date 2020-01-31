package pers.ll.gacs.controller;

import com.alibaba.excel.EasyExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import pers.ll.gacs.common.Const;
import pers.ll.gacs.common.Result;
import pers.ll.gacs.easyexcel.CourseReadListener;
import pers.ll.gacs.easyexcel.DemandListener;
import pers.ll.gacs.po.Course;
import pers.ll.gacs.po.Demand_1;
import pers.ll.gacs.service.CourseService;
import pers.ll.gacs.utils.easyexcel.DemoData;
import pers.ll.gacs.utils.easyexcel.DemoDataListener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "excel")
public class ExcelController extends BaseController {

    @Autowired
    CourseService courseService;

    /**
     * 毕业要求数据上传
     *
     * @param file
     * @return
     * @throws IOException
     */
    @PostMapping(value = "/demand")
    public Result demandUpload(@RequestParam("file") MultipartFile file) throws IOException {
        if (ObjectUtils.isEmpty(file)) {
            return Result.fail_500("文件不能为空");
        }
        Result result = Result.fail_500("上传失败");
        List<Demand_1> list = new ArrayList<>();
        EasyExcel.read(file.getInputStream(), new DemandListener() {
            @Override
            protected void onResult(List<Demand_1> demand1List, boolean finished) {
                if (finished) {
                    result.setCode(Const.HttpStatusCode.HttpStatus_200);
                    result.setMsg("毕业要求基础数据上传成功");
                    result.setData(list);
                } else {
                    list.addAll(demand1List);
                }

            }
        }).sheet().doRead();
        return result;
    }

    /**
     * 课程信息数据上传
     *
     * @param file
     * @return
     * @throws Exception
     */
    @PostMapping(value = "/course")
    public Result courseUpload(@RequestParam("file") MultipartFile file) throws Exception {
        if (ObjectUtils.isEmpty(file)) {
            return Result.fail_500("文件不能为空");
        }
        Result result = Result.fail_500("上传失败");
        EasyExcel.read(file.getInputStream(), Course.class, new CourseReadListener(courseService) {
            @Override
            public void onResult(List<Course> list) {
                result.setCode(Const.HttpStatusCode.HttpStatus_200);
                result.setMsg("课程信息上传成功");
                result.setData(list);
            }
        }).sheet().doRead();
        return result;
    }

    @PostMapping(value = "/test")
    public Result testUpload(@RequestParam("file") MultipartFile file) throws Exception {
        if (ObjectUtils.isEmpty(file)) {
            return Result.fail_500("文件不能为空");
        }
        Result result = Result.fail_500("上传失败");
        List<DemoData> data = new ArrayList<>();
        EasyExcel.read(file.getInputStream(), DemoData.class, new DemoDataListener() {
            @Override
            public void onResult(List<DemoData> list, boolean finish) {
                if (finish) {
                    result.setCode(Const.HttpStatusCode.HttpStatus_200);
                    result.setMsg("上传成功");
                    result.setData(data);
                } else {
                    data.addAll(list);
                }
            }
        }).sheet().doRead();
        return result;
    }

}
