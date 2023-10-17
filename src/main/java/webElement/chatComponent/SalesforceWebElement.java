package webElement.chatComponent;

import org.openqa.selenium.WebElement;



import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import util.chatComponent.BaseClass;

/**
 * @TestClass           SalesforceWebElement
 * @author              Raghavendra Kadam
 * @description         This class performs WebElement creation and WebElement function activity.
 *                      It includes WebElement creation and browser automation methods activity.
 * @createddate         09-Oct-2023
 * * @modificationlog
 */
public class SalesforceWebElement {

	public SalesforceWebElement() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	@FindBy(xpath="//button[@title='Bold']//lightning-primitive-icon//*[name()='svg']")
	public WebElement boldButton;
	
	@FindBy(xpath="//button[@title='Italic']//lightning-primitive-icon//*[name()='svg']")
	public WebElement itallicButton;
	
	@FindBy(xpath="//button[@title='Strikethrough']//lightning-primitive-icon//*[name()='svg']")
	public WebElement strikeThroughButton;
	
	
	// for the send message button 
	@FindBy(xpath="//button[normalize-space()='Send']")
	public WebElement sendButton;
	
	
	
	// for the phone combobox
	@FindBy(xpath="//span[normalize-space()='Select phone number']")
	public WebElement phoneNumCombobox;
	
	@FindBy(xpath="//button[@id='combobox-button-87']")
	public WebElement phoneDropDown;

	@FindBy(xpath="//lightning-base-combobox-item[@id='combobox-button-87-0-87']//span[@class='slds-media__body']//span")
	public WebElement assttPhone;
	
	
	
	// for the text area
	@FindBy(xpath="//div[@class='slds-rich-text-area__content slds-grow slds-text-color-weak standin']")
	public WebElement textBox;
	
	@FindBy(xpath="//div[@role='textbox']//p") 
	public WebElement enterTextPlaceholder;

	
	/**
	   * @description           This method clicks on bold button in LWC component
	   * @methodname            isBoldButtonClicked
	   * @author                Raghavendra Kadam
	   * @params                None
	   * @return                void
	   */
	public void isBoldButtonClicked()
	{
		try {
			boldButton.click();
			Reporter.log("Bold button is being clicked successfully");
		} catch (Exception e) {
			Reporter.log("Unable to click bold button ::"+ e.getMessage());
			
		}
	
	}
	
	/**
	   * @description           This method clicks on itallic button in LWC component
	   * @methodname            isItallicButtonClicked
	   * @author                Raghavendra Kadam
	   * @params                None
	   * @return                void
	   */
	public void isItallicButtonClicked()
	{
		try {
			itallicButton.click();
			Reporter.log("Itallic button is being clicked successfully");
		} catch (Exception e) {
			Reporter.log("Unable to click itallic Button ::"+ e.getMessage());
			
		}
	
	}
	
	/**
	   * @description           This method clicks on strikethorugh button in LWC component
	   * @methodname            isStrikeThroughButtonClicked
	   * @author                Raghavendra Kadam
	   * @params                None
	   * @return                void
	   */
	public void isStrikeThroughButtonClicked()
	{
		try {
			strikeThroughButton.click();
			Reporter.log("StrikeThrough button is being clicked successfully");
		} catch (Exception e) {
			Reporter.log("Unable to click strikethrough button ::"+ e.getMessage());
			
		}
	
	}
	
	/**
	 * @description           This method clicks on text box in LWC component
	   * @methodname            isTestBoxClicked
	   * @author                Raghavendra Kadam
	   * @params                None
	   * @return                void
	   */
	public void isTestBoxClicked(){
		try {
			textBox.click();
			Reporter.log("Clicked on text box successfully");
		} catch (Exception e) {
			Reporter.log("Unable to click Text Box ::"+ e.getMessage());
			
		}
	}
	
	/**
	   * @description           Enters text into the text area in the LWC component
	   * @methodname            enterText
	   * @author                Raghavendra Kadam
	   * @params                None
	   * @return                void
	   */
	public void enterText()	{
		try {
			
			enterTextPlaceholder.sendKeys("Test");
			Reporter.log("Enter text successfully");
			
		} catch (Exception e) {
			Reporter.log("Unable to enter text"+ e.getMessage());
			
		}
	}
	

	/**
	   * @description           Click the dropdown combobox in the LWC component
	   * @methodname            phoneFieldIsClicked
	   * @author                Raghavendra Kadam
	   * @params                None
	   * @return                void
	   */
	public void phoneFieldIsClicked() {
		try {
			phoneNumCombobox.click();
			Reporter.log("Phone Field is being selected");
		} catch (Exception e) {
			Reporter.log("Unable to select phone field ::"+e.getMessage());
			e.printStackTrace();
		}
	}
	
	/**
	   * @description           Select text in the dropdown list of combobox in LWC component
	   * @methodname            dropDownPhoneField
	   * @author                Raghavendra Kadam
	   * @params                None
	   * @return                void
	   */
	public void dropDownPhoneField() {
		try {
			assttPhone.click();
			Reporter.log("Asst Phone is being clicked"); 
		} catch (Exception e) {
			Reporter.log("Unable to select Asst Phone ::"+e.getMessage());
			e.printStackTrace();
		}
	}
	
	/**
	   * @description           Clicks send message button of the LWC component
	   * @methodname            sendButtonIsClicked
	   * @author                Raghavendra Kadam
	   * @params                None
	   * @return                void
	   */
	public void sendButtonIsClicked() {
		try {
			sendButton.click();
			Reporter.log("Send button is being clicked");
		} catch (Exception e) {
			Reporter.log("Unable to click send button ::"+e.getMessage());
			e.printStackTrace();
		}
	}
}