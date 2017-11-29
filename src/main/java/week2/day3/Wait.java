package week2.day3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Wait {
	
	@Test
	public void learnWaits() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> sweets = driver.findElementsByXPath("//button[text()='✕']");
		if(sweets.size() > 0) {
			sweets.get(0).click();
			Thread.sleep(5000);
		}
		driver.findElementByXPath("//span[text()='Electronics']").click();
		WebElement apple = driver.findElementByXPath("//span[text()='Apple']");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(apple));
		apple.click();
		
		
		
		
		
		
		
		
		
		
	}

}
