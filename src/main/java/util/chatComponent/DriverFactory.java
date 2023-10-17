package util.chatComponent;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.navigate().to("https://deciphercom2-dev-ed.develop.lightning.force.com/lightning/r/Contact/0035g000014S24lAAC/view");
			
			Thread.sleep(5000);

			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,250)");
		}
		return driver;

	}
	
}

