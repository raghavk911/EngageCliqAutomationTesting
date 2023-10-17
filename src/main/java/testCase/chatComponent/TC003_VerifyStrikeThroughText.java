package testCase.chatComponent;

import java.util.concurrent.TimeUnit;


import org.testng.Reporter;
import org.testng.annotations.Test;

import util.chatComponent.BaseClass;
import webElement.chatComponent.SalesforceWebElement;

public class TC003_VerifyStrikeThroughText {
	@Test
	public void tC003_VerifyStrikeThroughText() {
		SalesforceWebElement sf;	
		try {
			BaseClass.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			sf = new SalesforceWebElement();

			sf.isTestBoxClicked();
			sf.isStrikeThroughButtonClicked();
			sf.enterText();
			sf.phoneFieldIsClicked();
			sf.dropDownPhoneField();
			sf.sendButtonIsClicked();
		} catch (Exception e) {
			System.out.println("Browser is not launched");
			Reporter.log("Browser is not launched");
		}
	}

}
