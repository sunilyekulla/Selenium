package package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

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
			
			String data0 = sheet1.getRow(1).getCell(0).getStringCellValue();
			System.out.println("Data from excel is " + data0);
			
			String data1 = sheet1.getRow(1).getCell(1).getStringCellValue();
			System.out.println("Data from excel is " + data1);
			
			wb.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
