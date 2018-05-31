package package1;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class Practice1 {
	
	WebDriver driver;
	JavascriptExecutor jse;
	
	public void ebay() {
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\\\Projects\\\\Introduction\\\\Drivers\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.get("https://www.ebay.com/");
			tshirts();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void tshirts() throws InterruptedException {
		
		try {
			driver.findElement(By.xpath("//a[text()=\"register\"]")).click();
			driver.findElement(By.id("firstname")).sendKeys("Sunil");
			driver.findElement(By.id("lastname")).sendKeys("k");
			driver.findElement(By.id("email")).sendKeys("i111053@nwytg.com");
			driver.findElement(By.id("PASSWORD")).sendKeys("sunil5253");
			driver.findElement(By.xpath("//input[@class=\"btn btn-prim\"]")).click();
			driver.findElement(By.id("gh-ac")).sendKeys("t shirts");
			driver.findElement(By.id("gh-ac")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
			
			jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0,900)");
			
			driver.findElement(By.xpath("//img[@src=\"https://i.ebayimg.com/thumbs/images/m/mMBXKcpOYmLK8DPgqoWI2Fg/s-l225.jpg\"]")).click();
			driver.findElement(By.xpath("//select[@name=\"Color\"]")).click();
			driver.findElement(By.xpath("//*[text()=\"Gray\"]")).click();
			driver.findElement(By.xpath("//select[@name=\"Asian size\"]")).click();
			driver.findElement(By.xpath("//*[text()=\"M\"]")).click();
			driver.findElement(By.id("atcRedesignId_btn")).click();

			for(String sunil : driver.getWindowHandles()) {
				driver.switchTo().window(sunil);
			}
			
			driver.findElement(By.xpath("//a[@class=\"btn btn-prim vi-VR-btnWdth-XL \"]")).click();
			//driver.findElement(By.id("userid")).sendKeys("ediel.xavion@0live.org");
			//driver.findElement(By.id("pass")).sendKeys("sunil5253");
			//driver.findElement(By.id("sgnBt")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Practice1 myObj = new Practice1();
		myObj.ebay();
		

	}

}
