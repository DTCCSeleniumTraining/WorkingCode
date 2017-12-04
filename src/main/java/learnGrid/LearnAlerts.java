package learnGrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LearnAlerts {
	
	@Test
	public void testAlert() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		RemoteWebDriver driver = new RemoteWebDriver(
				new URL("http://TunaFTI:70aebd9e-932f-47c0-8951-602a9211605f@ondemand.saucelabs.com:80/wd/hub"), dc);
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("loginbutton").click();
		Thread.sleep(10000);
		Alert a1= driver.switchTo().alert();
		String alertText = a1.getText();
		System.out.println(alertText);
		a1.accept();
		driver.findElementById("usernameId").sendKeys("abc");
	}

}
