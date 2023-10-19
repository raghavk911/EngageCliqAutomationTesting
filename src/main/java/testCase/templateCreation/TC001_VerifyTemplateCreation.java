package testCase.templateCreation;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.Test;

import util.templateCreation.BaseClass;
import webElement.templateCreation.SalesforceWebElement;

public class TC001_VerifyTemplateCreation {
	SalesforceWebElement tempCreate;
	@Test
	public void tC001_VerifyTemplateCreation() throws InterruptedException{
		try {
			BaseClass.launchBrowser("SalesforceDriver");
			tempCreate = new SalesforceWebElement();

			BaseClass.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			tempCreate.isNewButtonClicked();

			Thread.sleep(5000);
			tempCreate.isNameTextBoxClicked();
			tempCreate.enterNameText();


			BaseClass.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			tempCreate.isDescriptionTextBoxClicked();
			tempCreate.enterDescriptionText();

			BaseClass.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			tempCreate.isTargetObjTextBoxClicked();
			tempCreate.enterTargetObjectText();

			tempCreate.isCombobxValueSelected();

			tempCreate.isNextNewTempBtnClicked();

			tempCreate.isWhatsAppChannelAdded();

			tempCreate.isTempleteTypeClicked();
			tempCreate.selectTemplateType();

			tempCreate.isAttributeNameFieldClicked();
			tempCreate.selectAttributeName();
			tempCreate.isInsertAttributeButtonClicked();

			tempCreate.isNextWATemplateBtnClicked();
			tempCreate.isTextRadioButtonClicked();
			tempCreate.enterTextWATemplate();
			tempCreate.enterFooterText();
			tempCreate.isNextWAHeaderButtonClicked();

			tempCreate.isWAIntTempRadioButtonClicked();
			tempCreate.selectLabelTextField();
			tempCreate.enterTextInLabelTextField();
			tempCreate.isFinishButtonClicked();
		}catch(Exception e) {
			Reporter.log("Chrome is not launched"+e.getMessage());
			e.getStackTrace();
		}
	}
}
