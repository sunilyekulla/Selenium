package package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src = new File("E:\\SELENIUM\\Sunil\\Testdata.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		//Create workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//HSSFWorkbook wb1= new HSSFWorkbook(fis);
		
		//Create worksheet
		XSSFSheet sheet1 = wb.getSheetAt(0);//means it takes first tab in sheet
		
		//If we have more no.of rows and coloumns to read
		int rowcount = sheet1.getLastRowNum();
		System.out.println("Total no.of rows " + rowcount);
		
		for(int i=0;i<rowcount;i++) 
		{
			String data0 = sheet1.getRow(i).getCell(1).getStringCellValue();
			//System.out.println("Test data from excel " + data0);
			System.out.println("Test data from row "+i+" is "+ data0);
		}
		wb.close();

	}

}
