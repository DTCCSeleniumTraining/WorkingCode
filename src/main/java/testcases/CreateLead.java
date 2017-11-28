package testcases;



import org.testng.annotations.Test;

import wrappers.ProjectSpecficWrapper;

public class CreateLead extends ProjectSpecficWrapper{
	
	@Test(successPercentage=1)
	public void createLead() throws Exception{
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName","TCS");
		enterById("createLeadForm_firstName", "Gopi");
		enterById("createLeadForm_lastName", "P");		
		enterById("createLeadForm_primaryEmail", "gopinath@testleaf.com");
		enterById("createLeadForm_primaryPhoneNumber", "9597704568");
		clickByClassName("smallSubmit1");
	}
}









