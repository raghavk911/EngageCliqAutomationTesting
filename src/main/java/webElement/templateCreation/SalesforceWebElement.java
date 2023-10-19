package webElement.templateCreation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import util.templateCreation.*;

/**
 * @TestClass           SalesforceWebElement
 * @author              Raghavendra Kadam
 * @description         This class performs WebElement creation and WebElement function activity.
 *                      It includes WebElement creation and browser automation methods activity.
 * @createddate         13-Oct-2023
 * * @modificationlog
 */
public class SalesforceWebElement {

	public SalesforceWebElement() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	// New Button
	@FindBy(xpath="//div[@title='New']")
	public WebElement newButton;
		
	// Name Text Box
	//@FindBy(xpath="//input[@class='slds-input']")
	@FindBy(xpath="/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div/div/div/c-create-template/lightning-modal-body/div/slot/div/div[2]/div[2]/span/lightning-input[1]/lightning-primitive-input-simple/div/div/input")
	public WebElement nameTextBox;
	
	// Description Text Box
	@FindBy(xpath="/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div/div/div/c-create-template/lightning-modal-body/div/slot/div/div[2]/div[2]/span/lightning-input[2]/lightning-primitive-input-simple/div/div/input")
	//@FindBy(xpath="input[@id='input-64']")
	public WebElement descTextBox;
	
	// Target Object Text Box
	@FindBy(xpath="/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div/div/div/c-create-template/lightning-modal-body/div/slot/div/div[2]/div[2]/span/lightning-input[3]/lightning-primitive-input-simple/div/div/input")
	public WebElement tarObjTextBox;
	
	// Next Button
	@FindBy(xpath="//button[normalize-space()='Next']")
	public WebElement nextNewTempBtn;
	
	// Select Contact in dropdown combobox
	@FindBy(xpath="/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div/div/div/c-create-template/lightning-modal-body/div/slot/div/div[2]/div[2]/span/div/div[2]/div/lightning-formatted-rich-text/span")
	public WebElement selectComboboxObj;

	// Select Whatsapp as communication channel
	@FindBy(xpath="//a[normalize-space()='Add']")
	public WebElement whatsAppCommChannel;
	
	// Select Template Type
	@FindBy(xpath="//span[normalize-space()='Select Template Type']")
	public WebElement tmptype;
	
	// Select Template Type
	@FindBy(xpath="//span[@title='User Initiative']")
	public WebElement uITempVal;
	
	// Select Attribute Name
	@FindBy(xpath="//span[normalize-space()='Source Attribute']")
	public WebElement attributeName;
	
	//Select attribute Name
	@FindBy(xpath="//span[@title='Asst. Phone']")
	public WebElement attrName;
	
	// Insert Attribute Button
	@FindBy(xpath="//button[normalize-space()='Insert Attribute']")
	public WebElement insertAttBtn;
	
	// Select TextArea of WhatsApp Template
	@FindBy(xpath="//div[@class='slds-rich-text-area__content slds-grow slds-text-color-weak standin']")
	public WebElement textBoxWATmp;
	
	// Click WhatsApp Template next button
	@FindBy(xpath="(//button[normalize-space()='Next'])[1]")
	public WebElement nextBtnWATmp;
	
	// Click Text Radio button 
	@FindBy(xpath="/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/c-create-whats-app-template/lightning-modal-body/div/slot/div/div[2]/div[1]/div[1]/div/lightning-radio-group/fieldset/div/span[2]/label/span[1]")
	public WebElement txtRadioBtn;

	// Send text in enter text field on WhatsApp Template  
	@FindBy(xpath="/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/c-create-whats-app-template/lightning-modal-body/div/slot/div/div[2]/div[1]/div[2]/div/lightning-input/lightning-primitive-input-simple/div/div/input")
	public WebElement enterTxtWaTmp;
	
	// Send text in footer text field on WhatsApp Template  
	@FindBy(xpath="/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/c-create-whats-app-template/lightning-modal-body/div/slot/div/div[2]/div[2]/lightning-input/lightning-primitive-input-simple/div/div/input")
	public WebElement enterFootTxt;
	
	// Click on next header button  
	@FindBy(xpath="//button[normalize-space()='Next']")
	public WebElement clickHeaderBtn;
	
	// Click on radio button as button interactive type  
	@FindBy(xpath="/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/c-create-whats-app-template/lightning-modal-body/div/slot/div/div[2]/div/div[1]/div/lightning-radio-group/fieldset/div/span[2]/label/span[1]")
	public WebElement buttonRadBtn;
	
	// Click on label text field
	@FindBy(xpath="/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/c-create-whats-app-template/lightning-modal-body/div/slot/div/div[2]/div/div[2]/div/lightning-input/lightning-primitive-input-simple/div/div/input")
	public WebElement selectLabeltxt;
	
	// Click on finish button 
	@FindBy(xpath="//button[normalize-space()='Finish']")
	public WebElement finishBtn;
	
	/**
	 * @description           This method clicks on the Template Type Dropdown combobox
	 * @methodname            isTempleteTypeClicked
	 * @author                Raghavendra Kadam
	 * @params                None
	 * @return                void
	 */
	public void isTempleteTypeClicked() {
		try {
			tmptype.click();
			Reporter.log("Template Type textbox is being clicked sucessfully");
		} catch (Exception e) {
			Reporter.log("Unable to click Template Type ::"+e.getMessage());
			e.printStackTrace();
		}

	}
	
	/**
	 * @description           This method select Template Type dropdown combobox value
	 * @methodname            selectTemplateType
	 * @author                Raghavendra Kadam
	 * @params                None
	 * @return                void
	 */
	public void selectTemplateType() {
		try {
			uITempVal.click();
			Reporter.log("User Initiative Template is being Selected");
		} catch (Exception e) {
			Reporter.log("Unable to select UI template ::"+e.getMessage());
			e.printStackTrace();
		}

	}
	
	/**
	 * @description           This method clicks on Attribute Name dropdown 
	 * @methodname            isAttributeNameFieldClicked
	 * @author                Raghavendra Kadam
	 * @params                None
	 * @return                void
	 */
	public void isAttributeNameFieldClicked(){
		
		try {
			attributeName.click();
			Reporter.log("Attribute Name field is being clicked");
		} catch (Exception e) {
			Reporter.log("Unable to click Attribute Name field ::"+e.getMessage());
			e.printStackTrace();
		}
	}
	
	/**
	 * @description           This method select Template Type dropdown combobox value
	 * @methodname            selectTemplateType
	 * @author                Raghavendra Kadam
	 * @params                None
	 * @return                void
	 */
	public void selectAttributeName() {
		try {
			attrName.click();
			Reporter.log("Asst. Phone is being Selected");
		} catch (Exception e) {
			Reporter.log("Unable to Asst. Phone ::"+e.getMessage());
			e.printStackTrace();
		}

	}

	
	/**
	 * @description           This method clicks on New button
	 * @methodname            isNewButtonClicked
	 * @author                Raghavendra Kadam
	 * @params                None
	 * @return                void
	 */
	public void isNewButtonClicked()
	{
		try {
			newButton.click();
			Reporter.log("New button is being clicked successfully");
		} catch (Exception e) {
			Reporter.log("Unable to click New button ::"+ e.getMessage());
			
		}

	}
	
	/**
	 * @description           This method clicks on the name textbox
	 * @methodname            isNameTextBoxClicked
	 * @author                Raghavendra Kadam
	 * @params                None
	 * @return                void
	 */
	public void isNameTextBoxClicked() {
		try {
			nameTextBox.click();
			Reporter.log("Name textbox is being clicked sucessfully");
		} catch (Exception e) {
			Reporter.log("Unable to click Name textbox ::"+e.getMessage());
			e.printStackTrace();
		}

	}
	
	/**
	 * @description           This method enter name in the name textbox
	 * @methodname            enterNameText
	 * @author                Raghavendra Kadam
	 * @params                None
	 * @return                void
	 */
	public void enterNameText() {
		try {
			nameTextBox.sendKeys("Test1");
			Reporter.log("Text is send");
		} catch (Exception e) {
			Reporter.log("Unable to send Text ::"+e.getMessage());
			e.printStackTrace();
		}

	}
	
	/**
	 * @description           This method clicks on the Description textbox
	 * @methodname            isDescriptionTextBoxClicked
	 * @author                Raghavendra Kadam
	 * @params                None
	 * @return                void
	 */
	public void isDescriptionTextBoxClicked() {
		try {
			descTextBox.click();
			Reporter.log("Description textbox is being clicked sucessfully");
		} catch (Exception e) {
			Reporter.log("Unable to click Description textbox ::"+e.getMessage());
			e.printStackTrace();
		}

	}
	
	/**
	 * @description           This method enter description in the name textbox
	 * @methodname            enterDescriptionText
	 * @author                Raghavendra Kadam
	 * @params                None
	 * @return                void
	 */
	public void enterDescriptionText() {
		try {
			descTextBox.sendKeys("Test Description");
			Reporter.log("Description text is send");
		} catch (Exception e) {
			Reporter.log("Unable to send description Text ::"+e.getMessage());
			e.printStackTrace();
		}

	}

	/**
	 * @description           This method clicks on the Target Object textbox
	 * @methodname            isTargetObjTextBoxClicked
	 * @author                Raghavendra Kadam
	 * @params                None
	 * @return                void
	 */
	public void isTargetObjTextBoxClicked() {
		try {
			tarObjTextBox.click();
			Reporter.log("Target Object textbox is being clicked sucessfully");
		} catch (Exception e) {
			Reporter.log("Unable to click Target Object textbox ::"+e.getMessage());
			e.printStackTrace();
		}

	}
	
	/**
	 * @description           This method enter Object Name in the textbox
	 * @methodname            enterTargetObjectText
	 * @author                Raghavendra Kadam
	 * @params                None
	 * @return                void
	 */
	public void enterTargetObjectText() {
		try {
			tarObjTextBox.sendKeys("Contact");
			Reporter.log("Target Object text is send");
		} catch (Exception e) {
			Reporter.log("Unable to send Target Object Text ::"+e.getMessage());
			e.printStackTrace();
		}

	}
	
	/**
	 * @description           This method clicks Next button on New Template page
	 * @methodname            isNextNewTempBtnClicked
	 * @author                Raghavendra Kadam
	 * @params                None
	 * @return                void
	 */
	public void isNextNewTempBtnClicked() {
		try {
			nextNewTempBtn.click();
			Reporter.log("Next New Template is being clicked");
		} catch (Exception e) {
			Reporter.log("Unable to click Next New Template button ::"+e.getMessage());
			e.printStackTrace();
		}
	}
	
	/**
	 * @description           This select combobox value from dropdown
	 * @methodname            isCombobxValueSelected
	 * @author                Raghavendra Kadam
	 * @params                None
	 * @return                void
	 */
	public void isCombobxValueSelected() {
		try {
			selectComboboxObj.click();
			Reporter.log("Dropdown combobox object is being selected");
		} catch (Exception e) {
			Reporter.log("Unable to select dropdown combobox object ::"+e.getMessage());
			e.printStackTrace();
		}
	}
	
	/**
	 * @description           This method select communication channel as whatsapp 
	 * @methodname            isWhatsAppChannelAdded
	 * @author                Raghavendra Kadam
	 * @params                None
	 * @return                void
	 */
	public void isWhatsAppChannelAdded(){
		try {
			whatsAppCommChannel.click();
			Reporter.log("Add button on WhatSapp communication channel is being clicked");
		} catch (Exception e) {
			Reporter.log("Unable to select WhatsApp as communication channel ::"+e.getMessage());
			e.printStackTrace();
		}
	}	

	public void isInsertAttributeButtonClicked() {
		try {
			insertAttBtn.click();
			Reporter.log("Insert Attribute button is being clicked");
		} catch (Exception e) {
			Reporter.log("Unable to click Insert Attribute button :: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void isNextWATemplateBtnClicked() {
		try {
			nextBtnWATmp.click();
			Reporter.log("Next button is being clicked");
		} catch (Exception e) {
			Reporter.log("Unable to click next button :: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void isTextRadioButtonClicked() {
		try {
			txtRadioBtn.click();
			Reporter.log("Text radio button is being clicked");
		} catch (Exception e) {
			Reporter.log("Unable to click Text radio button :: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void enterTextWATemplate(){
		try {
			enterTxtWaTmp.sendKeys("Test Text");
			Reporter.log("Send text is successfull in WhatsApp enter text field");
		} catch (Exception e) {
			Reporter.log("Unable to send text in WhatsApp enter Text :: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void enterFooterText() {
		try {
			enterFootTxt.sendKeys("Test Footer");
			Reporter.log("Send footer text is successful");
		}catch (Exception e) {
			Reporter.log("Unable to send text in footer :: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void isNextWAHeaderButtonClicked() {
		try {
			clickHeaderBtn.click();
			Reporter.log("Next Header button is being clicked");
		} catch (Exception e) {
			Reporter.log("Unable to click next header button :: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void isWAIntTempRadioButtonClicked() {
		try {
			buttonRadBtn.click();
			Reporter.log("Button as interactive type radio button is being clicked");
		} catch (Exception e) {
			Reporter.log("Unable to click Button as interactive type :: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void selectLabelTextField() {
		try {
			selectLabeltxt.click();
			Reporter.log("Select label text field is being clicked");
		} catch (Exception e) {
			Reporter.log("Unable to click select label text field :: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void enterTextInLabelTextField() {
		try {
			selectLabeltxt.sendKeys("Test Label");
			Reporter.log("Enter text in label text field is successful");
		} catch (Exception e) {
			Reporter.log("Unable to enter text in label text :: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void isFinishButtonClicked() {
		try {
			finishBtn.click();
			Reporter.log("Finish button is being clicked");
		} catch (Exception e) {
			Reporter.log("Unable to click finish button :: "+e.getMessage());
			e.printStackTrace();
		}
	}
}


