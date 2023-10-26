package testCase.sendBulkAndSchedule;

import org.testng.Reporter;
import org.testng.annotations.Test;

import util.sendBulkAndSchedule.BaseClass;
import webElement.sendBulkAndSchedule.SalesforceWebElementReports;

public class TC002_VerifyReportsBulkSend {
	@Test
	public void tC002_VerifyReportsBulkSend() {
		SalesforceWebElementReports sendBulk;
		
		try {
			BaseClass.launchBrowser("SalesforceDriver");
			sendBulk = new SalesforceWebElementReports();
			Reporter.log("Browser has been launched");
			
			sendBulk.navigateToReports();
			
			sendBulk.selectFolderName();
			Thread.sleep(2000);
			sendBulk.selectFolderName();
			sendBulk.selectFolderNameItem();
			
			sendBulk.reportName();
			Thread.sleep(2000);
			sendBulk.reportName();
			sendBulk.reportNameItem();
			
			sendBulk.phoneField();
			sendBulk.phoneFieldItem();
			
			sendBulk.templateField();
			sendBulk.templateFieldItem();
			
			sendBulk.chooseReportNext();
			sendBulk.sendBulkMessage();
			sendBulk.isOkButtonClicked();
		} catch (InterruptedException e) {
			Reporter.log("Unable to Launch Browser :: "+e.getMessage());
			e.printStackTrace();
		}
	}
}
