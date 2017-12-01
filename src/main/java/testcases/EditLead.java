package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import wrappers.ProjectSpecficWrapper;


public class EditLead extends ProjectSpecficWrapper {	
	@BeforeClass
	public void setData() {
		fileName = "editeLead";
	}
	
	@Test(dataProvider="fetchdata")
	public void editLead(String fName,String industry) throws Exception{
		clickByLink("Leads");
		clickByLink("Find Leads");
		enterByXpath("(//input[@name='firstName'])[3]", fName);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(3000);
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		verifyTitle("View Lead | opentaps CRM");
		clickByXpath("//a[contains(text(),'Edit')]");
		selectVisibileTextById("updateLeadForm_industryEnumId", industry);
		clickByXpath("//input[@class='smallSubmit']");
	}
}
