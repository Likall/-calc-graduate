package pers.ll.gacs;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class importCsv {

    public static List<String> importCsvs(File file) throws IOException {
        List<String> dataList = new ArrayList<String>();//数据
        BufferedReader bufferedReader = null;
        bufferedReader = new BufferedReader(new FileReader(file));
        String line = "";
        while ((line = bufferedReader.readLine())!=null){

            dataList.add(line);

        }
        if (bufferedReader != null){
            try {
                bufferedReader.close();
                bufferedReader = null;
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        return dataList;
    }


    /**  * CSV文件导入测试  */
    public static void main(String[] args) throws IOException {

        /**  * CSV文件导出测试  */
        {
            List<String> datas = importCsv.importCsvs(new File("C:/Users/lika/Downloads/The original data (2).csv"));
            if ( datas != null && !datas.isEmpty()) {
                for (String data : datas) {
                    System.out.println(data);
                }
            }
        }
    }
}
