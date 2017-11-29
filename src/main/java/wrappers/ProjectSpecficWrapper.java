package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecficWrapper extends GenericWrappers{
	@Parameters({"browserName","URL","userName","password"})
	@BeforeMethod
	public void login(String bName,String url,String uName,String pwt) throws Exception {
		invokeApp(bName, url);
		enterById("username", uName);
		enterById("password", pwt);
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
	}
	
	@AfterMethod(alwaysRun = true)
	public void closeApp() {
		closeAllBrowsers();
	}
}
