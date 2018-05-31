package package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelsheet {

	public static void main(String[] args)  {
		
			try {
				// TODO Auto-generated method stub
				File src = new File("E:\\SELENIUM\\Sunil\\Testdata.xlsx");
				FileInputStream fis = new FileInputStream(src);
				
				//Create workbook
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				//HSSFWorkbook wb1= new HSSFWorkbook(fis);
				
				//Create worksheet
				XSSFSheet sheet1 = wb.getSheetAt(0);//means it takes first tab in sheet
				
				
				sheet1.getRow(0).createCell(3).setCellValue("megha");
				sheet1.getRow(1).createCell(3).setCellValue("webdriver1");
				
				FileOutputStream fos = new FileOutputStream(src);
				wb.write(fos);
				wb.close();
			}
			 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}			

}


