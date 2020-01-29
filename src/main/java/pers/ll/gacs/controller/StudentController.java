package pers.ll.gacs.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import pers.ll.gacs.common.Result;
import pers.ll.gacs.po.Course;
import pers.ll.gacs.service.IStudentService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController extends BaseController{

    @Autowired(required = false)
    IStudentService iStudentService;

    /*
     * 上传用户信息
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
            logger.info(strs);
            int i;
            boolean flag = false;
            logger.info("上传成功");
            return Result.ok("上传成功");
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
}
