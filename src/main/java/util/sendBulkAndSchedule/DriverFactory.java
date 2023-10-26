package util.sendBulkAndSchedule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public static WebDriver driver = null;
	public static WebDriver getBrowser(String webDriverObject) throws InterruptedException {
		
		if(webDriverObject =="SalesforceDriver") {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://login.salesforce.com/?locale=in");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("automationTesting@decipher.com");
			driver.findElement(By.id("password")).sendKeys("decipher@100");
			driver.findElement(By.id("Login")).click();
		}
		return driver;
	}
	
}
