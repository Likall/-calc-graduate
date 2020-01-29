package pers.ll.gacs.utils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ExcelUtils {

    /**
     * 这个inputStream文件可以来源于本地文件的流，
     *  也可以来源与上传上来的文件的流，也就是MultipartFile的流，
     *  使用getInputStream()方法进行获取。
     */
    /**
     * 然后再读取文件的时候，应该excel文件的后缀名在不同的版本中对应的解析类不一样
     * 要对fileName进行后缀的解析
     */
    public static void readExcelFile(InputStream inputStream, String fileName) {
        Workbook workbook = null;
        try {
            //判断什么类型文件
            if (fileName.endsWith(".xls")) {
                workbook = new HSSFWorkbook(inputStream);
            } else if (fileName.endsWith(".xlsx")) {
                workbook = new XSSFWorkbook(inputStream);
            } else {
                System.out.println("文件类型有误");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (workbook != null) {
            //获取所有的工作表的的数量
            int numOfSheet = workbook.getNumberOfSheets();
            System.out.println(numOfSheet + "--->numOfSheet");
            //遍历表
            for (int i = 0; i < numOfSheet; i++) {
                //获取一个sheet也就是一个工作本。
                Sheet sheet = workbook.getSheetAt(i);
                if (sheet == null) {
                    System.out.println("文件内容为空");
                    continue;
                }
                //获取一个sheet有多少Row
                int lastRowNum = sheet.getLastRowNum();
                if (lastRowNum == 0) continue;
                Row row;
                for (int j = 1; j <= lastRowNum; j++) {
                    row = sheet.getRow(j);
                    if (row == null) {
                        continue;
                    }
                    //获取一个Row有多少Cell
                    short lastCellNum = row.getLastCellNum();
                    for (int k = 0; k <= lastCellNum; k++) {
                        if (row.getCell(k) == null) {
                            continue;
                        }
                        row.getCell(k).setCellType(CellType.STRING);
                        String res = row.getCell(k).getStringCellValue().trim();
                        //打印出cell(单元格的内容)
                        System.out.println(res);
                    }

                }
            }
        } else {
            System.out.println("文件为空");
        }
    }

    /**
     * 写入excel文件
     */
    public static void writeExcel(OutputStream outputStream) {
        Workbook wb = new SXSSFWorkbook(100);
        //创建一个工作本
        Sheet sheet = wb.createSheet("sheet");

        //通过一个sheet创建一个Row
        Row row = sheet.createRow(0);

        for (int i = 0; i < 10; i++) {
            //通过row创建一个cell
            Cell cell = row.createCell(i);
            cell.setCellValue("这是第" + i + "个cell");
        }
        try {
            wb.write(outputStream);
            wb.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
