package package1;

import lib.ConfigReadexcel;

public class ReadExcel2 {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			
		try { 
			    ConfigReadexcel excel;
				excel = new ConfigReadexcel("E:\\SELENIUM\\Sunil\\Testdata.xlsx");
				System.out.println(excel.getData(2, 0, 0));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			

	
	}
}


