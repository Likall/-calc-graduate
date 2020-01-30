package pers.ll.gacs.controller;

import com.alibaba.excel.EasyExcel;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pers.ll.gacs.common.Const;
import pers.ll.gacs.common.Result;
import pers.ll.gacs.po.Demand_1;
import pers.ll.gacs.utils.ExcelUtils;
import pers.ll.gacs.utils.easyexcel.DemoDAO;
import pers.ll.gacs.utils.easyexcel.DemoData;
import pers.ll.gacs.utils.easyexcel.DemoDataListener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "excel")
public class ExcelController extends BaseController{

    @PostMapping(value = "/upload")
    public Result upload(@RequestParam("file") MultipartFile file) {
        if (ObjectUtils.isEmpty(file)) {
            return Result.fail_500("文件不能为空");
        }
        InputStreamReader isr = null;
        BufferedReader br = null;
        try {
            logger.info("fileName" + file.getOriginalFilename());
            ExcelUtils.readExcelFile(file.getInputStream(), file.getOriginalFilename());
            isr = new InputStreamReader(file.getInputStream());
            br = new BufferedReader(isr);
            String line;
            List<List<String>> strs = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                strs.add(Arrays.asList(line.split(",")));
            }
            System.out.println(strs);
        } catch (IOException e) {
            e.printStackTrace();
            logger.info("上传失败" + e.getMessage());
            return Result.fail_500("上传失败" + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (isr != null) {
                    isr.close();
                }
                logger.info("111上传成功");
                return Result.ok("上传成功");
            } catch (IOException e) {
                e.printStackTrace();
                logger.info("2上传失败");
                return Result.fail_500("上传失败" + e.getMessage());
            }
        }
    }

    @PostMapping(value = "/easy")
    public Result easyUpload(@RequestParam("file") MultipartFile file) throws IOException{
        if (ObjectUtils.isEmpty(file)) {
            return Result.fail_500("文件不能为空");
        }
        EasyExcel.read(file.getInputStream(), DemoData.class, new DemoDataListener(new DemoDAO())).sheet().doRead();
        return Result.ok("模板文件上传成功");
    }

    /**
     * 毕业要求模板上传
     * @param file
     * @return
     * @throws IOException
     */
    @PostMapping(value = "/demand")
    public Result demandUpload(@RequestParam("file") MultipartFile file) throws IOException{
        if (ObjectUtils.isEmpty(file)) {
            return Result.fail_500("文件不能为空");
        }
        Result result = Result.fail_500("上传失败");
        EasyExcel.read(file.getInputStream(), new DemandListener() {
            @Override
            protected void onResult(List<Demand_1> demand1List) {
                result.setCode(Const.HttpStatusCode.HttpStatus_200);
                result.setMsg("毕业要求模板上传成功");
                result.setData(demand1List);
            }
        }).sheet().doRead();
        return result;
    }

}
