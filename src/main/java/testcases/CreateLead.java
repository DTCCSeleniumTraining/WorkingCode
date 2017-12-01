package testcases;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import wrappers.LearnDataProvider;
import wrappers.ProjectSpecficWrapper;

public class CreateLead extends ProjectSpecficWrapper{
	@BeforeClass
	public void setData() {
		fileName = "CreatedExcel";
	}
	
	//@Test(successPercentage=1)
	@Test(dataProvider="fetchdata")
	public void createLead(String cName,String fName,String lName) throws Exception{
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName",cName);
		enterById("createLeadForm_firstName", fName);
		enterById("createLeadForm_lastName", lName);		
		//enterById("createLeadForm_primaryEmail", email);
		enterById("createLeadForm_primaryPhoneNumber", "234567");
		clickByClassName("smallSubmit");
	}
	
	
}









