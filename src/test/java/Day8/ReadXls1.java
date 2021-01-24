package Day8;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.File;
import java.io.FileNotFoundException;

public class ReadXls1 {

    public static void main(String[] args) throws FileNotFoundException {

        /**
         * xls -- hssf - horrible spreadsheet
         *
         * xlsx --- xssf - Xml spreadsheet format
         */

        String rpath= System.getProperty("user.dir")+ File.separator+"TestData"+File.separator+"TestDataFile.xls";

        File file;
//        FileInputStream fis = new FileInputStream(rpath);
        HSSFWorkbook wb = new HSSFWorkbook();
       Sheet sh = wb.getSheet("List");

            int rowNum = sh.getLastRowNum();
               System.out.println("Ttal Rows"+rowNum);

       DataFormatter df = new DataFormatter();
       String val1 = df.formatCellValue(sh.getRow(1).getCell(0));
       System.out.println(val1);


    }




}
