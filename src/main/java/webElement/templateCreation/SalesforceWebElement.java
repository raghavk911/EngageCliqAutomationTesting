package webElement.templateCreation;

import org.openqa.selenium.WebElement;

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
	@FindBy(xpath="//input[@id='input-137']")
	public WebElement nameTextBox;
	
	// Description Text Box
	@FindBy(xpath="//input[@id='input-139']")
	public WebElement descTextBox;
	
	// Target Object Text Box
	@FindBy(xpath="//input[@id='input-141']")
	public WebElement tarObjTextBox;
	
	// Next Button
	@FindBy(xpath="//button[normalize-space()='Next']")
	public WebElement nextNewTempBtn;
	
	// Select Contact in dropdown combobox
	@FindBy(xpath="//span[normalize-space()='Contact']")
	public WebElement selectComboboxValue;
	//@FindBy(xpath="//button[@id='combobox-button-418']/span[@class='slds-truncate'][normalize-space(text()='First Name')]")
	//button[@id='combobox-button-418']/span[@class='slds-truncate'][normalize-space(text()='First Name')]
	
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
	
	// Select Attribute Name text field value
	//@FindBy(xpath="//lightning-base-combobox-item[@id='combobox-button-444-11-444']//span[@class='slds-media__body']//span[@title='First Name']")
	//button[@id='combobox-button-412']//span[@class='slds-truncate'][normalize-space()='First Name']

	//@FindBy(xpath="//button[@id='combobox-button-412']//span[@class='slds-truncate'][normalize-space()='First Name']")
	@FindBy(xpath="(//span[@class='slds-truncate'][normalize-space()='Last Name'])[1]")
	public WebElement attributeNameValue;
	
	// Insert Attribute Button
	@FindBy(xpath="//button[normalize-space()='Insert Attribute']")
	public WebElement insertAttBtn;
	
	// Select TextArea of WhatsApp Template
	@FindBy(xpath="//div[@class='slds-rich-text-area__content slds-grow slds-text-color-weak standin']")
	public WebElement textBoxWATmp;
	
	
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
	
	
	public void selectAttributeName(){
		try {
			attributeNameValue.click();
			Reporter.log("Contact Name field Selected");
		} catch (Exception e) {
			Reporter.log("Unable to select Contact field ::"+e.getMessage());
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
			nameTextBox.sendKeys("Test Name");
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
			selectComboboxValue.click();
			Reporter.log("Dropdown combobox value is being selected");
		} catch (Exception e) {
			Reporter.log("Unable to select dropdown combobox value ::"+e.getMessage());
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
}


