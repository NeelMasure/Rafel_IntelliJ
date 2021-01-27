package Day8;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadXls1 {

    public static void main(String[] args) throws IOException {

        /**
         * xls -- hssf - horrible spreadsheet
         *
         * xlsx --- xssf - Xml spreadsheet format
         */

        String rpath = System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "TestDataFile.xls";

        File file;
        FileInputStream fis = new FileInputStream(rpath);
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        Sheet sh = wb.getSheet("List");

        int rowNum = sh.getLastRowNum();
        System.out.println("Ttal Rows" + rowNum);

        for (int i = 0; i <= rowNum; i++) {
            DataFormatter df = new DataFormatter();
            String name = df.formatCellValue(sh.getRow(i).getCell(0));
            String mob = df.formatCellValue(sh.getRow(i).getCell(1));
            System.out.println(name + " ----" + mob);


        }

    }

}
