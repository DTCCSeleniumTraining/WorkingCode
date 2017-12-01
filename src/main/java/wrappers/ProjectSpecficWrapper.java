package wrappers;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week2.day5.LearnExcel;

public class ProjectSpecficWrapper extends GenericWrappers{
	public String fileName= "";
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
	@DataProvider(name="fetchdata")
	public String[][] getData() throws InvalidFormatException, IOException {
		LearnExcel readData = new LearnExcel();
		return readData.readExcel(fileName);		
		
	}
}
