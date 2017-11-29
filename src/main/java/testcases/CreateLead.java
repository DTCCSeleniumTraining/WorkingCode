package testcases;



import org.testng.annotations.Test;

import wrappers.LearnDataProvider;
import wrappers.ProjectSpecficWrapper;

public class CreateLead extends ProjectSpecficWrapper{
	
	//@Test(successPercentage=1)
	@Test(dataProvider="fetchdata",dataProviderClass=LearnDataProvider.class)
	public void createLead(String cName,String fName,String lName,String email) throws Exception{
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName",cName);
		enterById("createLeadForm_firstName", fName);
		enterById("createLeadForm_lastName", lName);		
		enterById("createLeadForm_primaryEmail", email);
		enterById("createLeadForm_primaryPhoneNumber", "234567");
		clickByClassName("smallSubmit");
	}
	
	
}









