package wrappers;

public class ProjectSpecficWrapper extends GenericWrappers{
	
	public void login() throws Exception {
		invokeApp("chrome", "http:/leaftaps.com/opentaps");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
	}

}
