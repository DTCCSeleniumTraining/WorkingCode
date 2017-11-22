package week1.day2;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindelements {

	@Test
	public void learnFindelements() throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://legacy.crystalcruises.com/Calendar.aspx");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> allElements= driver.findElementsByLinkText("Get-a-Quote");
		int elementsCount= allElements.size();
		allElements.get(1).click();
		System.out.println(elementsCount);
		
		File src= driver.getScreenshotAs(OutputType.FILE);
		File dsc = new File("./snaps/image.jpg");
		FileUtils.copyFile(src, dsc);
		
		
		
		
		
		

	}

}
