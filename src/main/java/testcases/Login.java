package testcases;

import org.junit.Test;

import wrappers.GenericWrappers;

public class Login extends GenericWrappers{
	@Test
	public void login() throws Exception{
		invokeApp("chrome", "http:/leaftaps.com/opentaps");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
	}
}
