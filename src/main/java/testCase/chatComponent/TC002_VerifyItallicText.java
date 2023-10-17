package testCase.chatComponent;

import java.util.concurrent.TimeUnit;


import org.testng.annotations.Test;

import util.chatComponent.BaseClass;
import webElement.chatComponent.SalesforceWebElement;

public class TC002_VerifyItallicText {
	@Test
	public void tC002_VerifyItallicText(){
		SalesforceWebElement sf;
		
		try {
			BaseClass.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			sf = new SalesforceWebElement();

			sf.isTestBoxClicked();
			sf.isItallicButtonClicked();
			sf.enterText();
			sf.phoneFieldIsClicked();
			sf.dropDownPhoneField();
			sf.sendButtonIsClicked();
		} catch (Exception e) {
			System.out.println("Browser is not launched");
		}
	}

}
