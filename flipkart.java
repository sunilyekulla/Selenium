package package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Projects\\Introduction\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		//for(String handle : driver.getWindowHandles()) {
		 //    driver.switchTo().window(handle);
		  // }
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("fast");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		List<WebElement> watches = driver.findElements(By.xpath("//div[@class='_3liAhj _1R0K0g']"));
		System.out.println("Total no.of watches->" + watches.size());
		for(int i=0;i<watches.size();i++) {
			System.out.println(watches.get(i).getText());
		}
		
	}	
		public  void items() {
			try {
				File src = new File("E:\\SELENIUM\\Sunil\\List.xlsx");
				FileInputStream fis = new FileInputStream(src);
				
				//Create workbook
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				//HSSFWorkbook wb1= new HSSFWorkbook(fis);
				
				//Create worksheet
				XSSFSheet sheet1 = wb.getSheetAt(0);//means it takes first tab in sheet
				
				//int list = watches.size();
				//for (int i=0;i<watches.size();i++)
					
				 sheet1.getRow(0).createCell(0).setCellValue("Sunil");//watches.get(i).getText()
				
				FileOutputStream fos = new FileOutputStream(src);
				wb.write(fos);
				wb.close();
				
				// TODO Auto-generated method stub
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}


