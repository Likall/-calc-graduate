package pers.ll.gacs.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pers.ll.gacs.common.Result;

import java.io.File;
import java.util.logging.Logger;

/**
 *
 */
@RestController
@RequestMapping(value = "/file")
public class FileController extends BaseController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public Result uploadFace(@RequestParam("file") MultipartFile file) {
        //getName : 获取表单中文件组件的名字
        //getOriginalFilename : 获取上传文件的原名
//        if (id == null) {
//            return Result.fail_500("不能为空");
//        }
        System.out.println(file);
        if (file == null) {
            return Result.fail_500("文件不能为空");
        }
        try {
//            logger.info(stuId);
//            face.setStuId(stuId);
            String type = file.getContentType();
            String name = file.getOriginalFilename();
            long size = file.getSize();
//            Logger.getLogger(TAG).info("type:" + type + "\n name:" + name + "\n size:" + ConvertUtils.byte2FitMemorySize(size));
            //图片上传成功后，将图片的地址写到数据库
            String filePath = "D:\\\\personal\\\\graduate_project\\\\fileOfCalc";//保存图片的路径
            //获取原始图片的拓展名
            String originalFilename = file.getOriginalFilename();
            //            //新的文件名字
            //            String newFileName = UUID.randomUUID()+originalFilename;
            //            //封装上传文件位置的全路径
            File targetFile = new File(filePath, originalFilename);
            if (targetFile.exists()) {
                targetFile.delete();
            }
            //把本地文件上传到封装上传文件位置的全路径
            file.transferTo(targetFile);
            return Result.fail_500("1212");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return Result.fail_500("上传失败"+e.getMessage());
        }
    }
}
