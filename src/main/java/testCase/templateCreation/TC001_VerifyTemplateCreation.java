package testCase.templateCreation;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;

import org.testng.annotations.Test;

import util.templateCreation.BaseClass;
import webElement.templateCreation.SalesforceWebElement;

public class TC001_VerifyTemplateCreation {
	SalesforceWebElement tempCreate;
	@Test
	public void tC001_VerifyTemplateCreation(){
		try {
			BaseClass.launchBrowser("SalesforceDriver");
			tempCreate = new SalesforceWebElement();
			tempCreate.isNewButtonClicked();
			
			BaseClass.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			tempCreate.isNameTextBoxClicked();
			tempCreate.enterNameText();
			
			BaseClass.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			tempCreate.isDescriptionTextBoxClicked();
			tempCreate.enterDescriptionText();
			
			BaseClass.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			tempCreate.isTargetObjTextBoxClicked();
			tempCreate.enterTargetObjectText();
			
			//BaseClass.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			tempCreate.isCombobxValueSelected();
			
			//BaseClass.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			tempCreate.isNextNewTempBtnClicked();
			
			//BaseClass.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			tempCreate.isWhatsAppChannelAdded();
			
			//BaseClass.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			tempCreate.isTempleteTypeClicked();
			tempCreate.selectTemplateType();
			
			//BaseClass.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			tempCreate.isAttributeNameFieldClicked();
			tempCreate.selectAttributeName();

		} catch (InterruptedException e) {
			Reporter.log("Browser is not launched ::"+e.getMessage());
			e.printStackTrace();
		}
	}
}
