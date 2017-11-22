package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Login {

	public static void main(String[] args) {

		// launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();

		// System.setProperty("webdriver.edge.driver",
		// "./drivers/MicrosoftWebDriver.exe");
		// WebDriver driver = new EdgeDriver();

		// System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		// FirefoxDriver driver = new FirefoxDriver();

		// load URL
		driver.get("http://leaftaps.com/opentaps");

		// Browser maximize
		driver.manage().window().maximize();

		// enter username
		driver.findElementById("username").sendKeys("DemoSalesManager");

		// Enter Password
		driver.findElementById("password").sendKeys("crmsfa");

		// click login
		driver.findElementByClassName("decorativeSubmit").click();

		// close all Browsers
		driver.quit();

	}

}
