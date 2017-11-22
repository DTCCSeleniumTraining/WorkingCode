package week1.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnVerication {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String username = driver.findElementByXPath("//*[@id=\'login\']/p[1]/label").getText();
		System.out.println(username);
		WebElement userName = driver.findElementById("username");
		userName.clear();
		userName.sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		System.out.println(driver.getCurrentUrl());
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown = new Select(source);
		dropdown.selectByVisibleText("Employee");
		Thread.sleep(3000);
		dropdown.selectByIndex(0);
		Thread.sleep(3000);
		dropdown.selectByValue("LEAD_OTHER");
		List<WebElement> srcOption = dropdown.getOptions();
		for (WebElement eachElement : srcOption) {
			System.out.println(eachElement.getText());
		}
		int src = srcOption.size();
		System.out.println(src);
		dropdown.selectByIndex(src-1);
		
		
		
		
		
		
		
		
		

	}

}
