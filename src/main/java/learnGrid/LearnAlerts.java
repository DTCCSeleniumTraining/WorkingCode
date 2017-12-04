package learnGrid;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LearnAlerts {
	
	@Test
	public void testAlert() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("loginbutton").click();
		Alert a1= driver.switchTo().alert();
		String alertText = a1.getText();
		System.out.println(alertText);
		a1.accept();
		driver.findElementById("usernameId").sendKeys("abc");
	}

}
