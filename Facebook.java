package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

		// Create a instance of ChromeOptions class

		ChromeOptions options = new ChromeOptions();

		// Add chrome switch to disable notification - "--disable-notifications"

		options.addArguments("--disable-notifications");
		// Set path for driver exe

		System.setProperty("webdriver.chrome.driver", "E:\\Projects\\Introduction\\Drivers\\chromedriver.exe");

		// Pass ChromeOptions instance to ChromeDriver Constructor

		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9492801899");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sunil5253");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='userNav']/ul/li/a/div")).click();
		driver.findElement(By.xpath("//ul[@class=\"_6_7 clearfix\"]/li[3]/a")).click();
		List<WebElement> friends=driver.findElements(By.xpath("//div[@class='fsl fwb fcb']"));
		System.out.println("Total friends-->"+ friends.size());
		for(int i=0;i<friends.size();i++) {
			System.out.println(friends.get(i).getText());
		}

		// TODO Auto-generated method stub

	}

}
