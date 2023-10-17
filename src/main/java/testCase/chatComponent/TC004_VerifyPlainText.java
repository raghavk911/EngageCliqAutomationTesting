package testCase.chatComponent;

import org.testng.Reporter;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import util.chatComponent.BaseClass;
import webElement.chatComponent.SalesforceWebElement;

public class TC004_VerifyPlainText {
	@Test
	public void tC004_VerifyPlainText() {
		SalesforceWebElement sf; 
		
		try {
			sf = new SalesforceWebElement();
			
			sf.isTestBoxClicked();
			sf.enterText();
			sf.phoneFieldIsClicked();
			sf.dropDownPhoneField();
			sf.sendButtonIsClicked();
		} catch (Exception e) {
			try {
				Reporter.log(e.getMessage());
				BaseClass.getScreenShot("Salesforce", "SFLogin","salesforceLogIn");
			} catch (Exception e2) {
				Reporter.log("Unable to getScreenShot ::"+e.getMessage());
			}
			
		}
	}
	
	@AfterTest
	public void quiteBrowser() throws InterruptedException {
		Thread.sleep(10000);
		BaseClass.driver.quit();
	}
}