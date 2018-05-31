package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class shopclues {
	WebDriver driver;
	
	public void jeans() {
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\Projects\\Introduction\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.shopclues.com/");
			newone();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void newone() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"nav_4\"]")).click();
		Thread.sleep(3000);
		for(String sunil : driver.getWindowHandles()) {
			driver.switchTo().window(sunil);
		}
		
		driver.findElement(By.xpath("//*[text()=\"Jeans\"]")).click();
		Thread.sleep(2000);
		
		for(String sunil : driver.getWindowHandles()) {
			driver.switchTo().window(sunil);
		}
		
		driver.findElement(By.xpath("//label[contains(text(),'Rs. 399 and Below')]")).click();
		Thread.sleep(2000);
		for(String sunil : driver.getWindowHandles()) {
			driver.switchTo().window(sunil);
		}
		driver.findElement(By.xpath("//*[@title=\"Radhe Enterprises- Men's Blue Denim Jeans\"]")).click();
		Thread.sleep(2000);
		for(String sunil : driver.getWindowHandles()) {
			driver.switchTo().window(sunil);
		}
		driver.findElement(By.xpath("//span[@class='variant' and @id='3364276']")).click();
		driver.findElement(By.xpath("//span[@id='5566043' and @value='Dark Blue']")).click();
		driver.findElement(By.xpath("//button[@data-formid='137083745' and @id='add_cart']")).click();
		//for(String sunil : driver.getWindowHandles()) {
		//	driver.switchTo().window(sunil);
		//}
		Actions a =new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@href=\"https://secure.shopclues.com/atom/acart/getcart\" and @class=\"cart_ic\"]")));
		a.click();
		a.perform();
		driver.findElement(By.xpath("//a[@href=\"https://secure.shopclues.com/atom/acart/getcart\" and @class='btn orange-white btn_effect']")).click();
		//driver.findElement(By.xpath("//a[@href=\"https://secure.shopclues.com/atom/acart/getcart\" and @class=\"cart_ic\"]")).click();
		driver.findElement(By.xpath("//input[@min='110000']")).sendKeys("411028");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		driver.findElement(By.xpath("//*[text()='Place Order']")).click();
	}

	public static void main(String[] args) {
		shopclues myObj = new shopclues();
		myObj.jeans();
		// TODO Auto-generated method stub

	}

}
