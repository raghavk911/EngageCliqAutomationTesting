package testCase.chatComponent;

import org.testng.annotations.Test;


import util.chatComponent.BaseClass;
import webElement.chatComponent.SalesforceWebElement;

public class TC001_VerifyBoldText {
	@Test
	public void tc001_VerifyBoldText(){
		SalesforceWebElement sf;
		
		try {
			BaseClass.launchBrowser("SalesforceDriver");
			sf = new SalesforceWebElement();
		    
			sf.isTestBoxClicked();
			sf.isBoldButtonClicked();
			sf.enterText();
			sf.phoneFieldIsClicked();
			sf.dropDownPhoneField();
			sf.sendButtonIsClicked();
		} catch (Exception e) {
			System.out.println("Browser is not launched");
		}
	}

}
