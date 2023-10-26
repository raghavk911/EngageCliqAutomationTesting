package webElement.sendBulkAndSchedule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import util.sendBulkAndSchedule.BaseClass;

public class SalesforceWebElementReports {
	
	public SalesforceWebElementReports() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	//Select folder dropdown
	@FindBy(xpath="//span[normalize-space()='Select Folder']")
	public WebElement selectFolder;

	//Select folder dropdown item
	@FindBy(xpath="//span[@title='Automation Test']")
	public WebElement selectFolderItem;
	
	//Select Report dropdown
	@FindBy(xpath="//span[normalize-space()='Select Report']")
	public WebElement selectReport;
	
	//Select Report dropdown Item
	@FindBy(xpath="/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div/div/app_flexipage-lwc-app-flexipage/app_flexipage-lwc-app-flexipage-decorator/slot/app_flexipage-lwc-app-flexipage-internal/forcegenerated-adg-rollup_component___force-generated__flexipage_-app-page___-report_-page/forcegenerated-flexipage_report_page__js/flexipage-lwc-default-app-home-template/div/div/slot/flexipage-component2/slot/c-report-selection/lightning-card/article/div[2]/slot/div/lightning-layout/slot/lightning-layout-item/slot/div[3]/lightning-combobox/div/div/lightning-base-combobox/div/div/div[2]/lightning-base-combobox-item/span[2]/span")
	public WebElement reportItem;
	
	//Select phone field dropdown 
	@FindBy(xpath="/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div/div/app_flexipage-lwc-app-flexipage/app_flexipage-lwc-app-flexipage-decorator/slot/app_flexipage-lwc-app-flexipage-internal/forcegenerated-adg-rollup_component___force-generated__flexipage_-app-page___-report_-page/forcegenerated-flexipage_report_page__js/flexipage-lwc-default-app-home-template/div/div/slot/flexipage-component2/slot/c-report-selection/lightning-card/article/div[2]/slot/div/lightning-layout/slot/lightning-layout-item/slot/div[5]/lightning-combobox/div/div/lightning-base-combobox/div/div/div[1]/button/span")
	public WebElement phoneField;
	
	//Select phone field dropdown Item
	@FindBy(xpath="//span[@title='Asst. Phone']")
	public WebElement phoneFieldItem;
	
	//Select template field dropdown
	@FindBy(xpath="//span[normalize-space()='Select Template']")
	public WebElement templateField;
	
	//Select template field dropdown Item
	@FindBy(xpath="//span[@title='test_bot']")
	public WebElement templateFieldItem;
	
	//Choose report next button
	@FindBy(xpath="//button[normalize-space()='Next']")
	public WebElement chooseNextBtn;
	
	//Send Bulk Message button 
	@FindBy(xpath="//div[@class='slds-grid slds-wrap']//button[@type='button'][normalize-space()='Send Message']")
	public WebElement sendBulkMessage;
	
	//Ok button on popup
	@FindBy(xpath="//button[normalize-space()='OK']")
	public WebElement okButton;
	
	public void navigateToReports() {
		try {
			BaseClass.driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			BaseClass.driver.navigate().to("https://deciphercom2-dev-ed.develop.lightning.force.com/lightning/n/Report_Page");
			Reporter.log("Navigated to reports");
		} catch (Exception e) {
			Reporter.log("Unable navigate to reports :: "+e.getMessage());
			e.printStackTrace();
		}
	}

	public void selectFolderName() {
		try {
			WebElement ele = new WebDriverWait(BaseClass.driver, 60).until(ExpectedConditions.visibilityOf(selectFolder));
			ele.click();
			//selectFolder.click();
			Reporter.log("Folder dropdown is selected");
		} catch (Exception e) {
			Reporter.log("Unable to select folder dropdown :: "+e.getMessage());
			e.printStackTrace();
		}
	}

	public void selectFolderNameItem() {
		try {
			selectFolderItem.click();
			Reporter.log("Folder name is selected sucessfully");
		} catch (Exception e) {
			Reporter.log("Unable to selcet folder name :: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void reportName() {
		try {
			selectReport.click();
			Reporter.log("Select report is being clicked");
		} catch (Exception e) {
			Reporter.log("Unable to click Select report :: "+e.getMessage());
			e.printStackTrace();
		}		
	}
	
	public void reportNameItem() {
		try {
			reportItem.click();
			Reporter.log("Report Name is selected");
		} catch (Exception e) {
			Reporter.log("Unable to select Report Item :: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void phoneField() {
		try {
			phoneField.click();
			Reporter.log("Phone field is being clicked");
		} catch (Exception e) {
			Reporter.log("Unable to select phone field :: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void phoneFieldItem() {
		try {
			phoneFieldItem.click();
			Reporter.log("Phone field is selected");
		} catch (Exception e) {
			Reporter.log("Unable to select phone field Item :: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void templateField() {
		try {
			templateField.click();
			Reporter.log("Template field is being clicked");
		} catch (Exception e) {
			Reporter.log("Unable to select Template field :: "+e.getMessage());
			e.printStackTrace();
		}
	}
	public void templateFieldItem() {
		try {
			templateFieldItem.click();
			Reporter.log("Template field is selected");
		} catch (Exception e) {
			Reporter.log("Unable to select Template field Item :: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void chooseReportNext() {
		try {
			chooseNextBtn.click();
			Reporter.log("Next button is being clicked");
		} catch (Exception e) {
			Reporter.log("Unable to click Next button :: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void sendBulkMessage() {
		try {
			sendBulkMessage.click();
			Reporter.log("Send Bulk Message button is being clicked");
		} catch (Exception e) {
			Reporter.log("Unable to click Send Bulk Message button :: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void isOkButtonClicked(){
		try {
			okButton.click();
			Reporter.log("Ok button is being clicked");
		} catch (Exception e) {
			Reporter.log("Unable to click Ok button :: "+e.getMessage());
			e.printStackTrace();
		}
	}
}
