package testcases;



import org.testng.annotations.Test;

import wrappers.ProjectSpecficWrapper;

public class CreateLead extends ProjectSpecficWrapper{
	
	@Test
	public void createLead() throws Exception{
		clickByLink("Leads1");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName","TCS");
		enterById("createLeadForm_firstName", "Gopi");
		enterById("createLeadForm_lastName", "P");		
		enterById("createLeadForm_primaryEmail1", "gopinath@testleaf.com");
		enterById("createLeadForm_primaryPhoneNumber", "9597704568");
		clickByClassName("smallSubmit");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}









