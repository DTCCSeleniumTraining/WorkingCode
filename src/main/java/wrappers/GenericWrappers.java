package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GenericWrappers implements Wrappers {
	int i = 1;
	RemoteWebDriver driver;
	public void invokeApp(String browser, String url)  {
		try {
			if (browser.equalsIgnoreCase("chrome")) {			
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if(browser.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			} else {
				System.setProperty("webdriver.edge.driver", "./drivers/edgedriver.exe");
				driver = new EdgeDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("Browser "+browser+" Launched Successfully");
		} catch (WebDriverException e) {
			e.getCause();
			throw new RuntimeException("WebDriverException");
		}catch (Exception e) {
			System.err.println("Exception");
		} finally {
			takeSnap();
		}
	}


	public void enterById(String idValue, String data) throws Exception {
		driver.findElementById(idValue).clear();
		driver.findElementById(idValue).sendKeys(data);
		System.out.println("Element id Value "+idValue+"Entered with the data "+data);
	}

	public void enterByName(String nameValue, String data) throws Exception {


	}

	@Override
	public void enterByXpath(String xpathValue, String data) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean verifyTitle(String title) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickById(String id) throws Exception {
		// TODO Auto-generated method stub

	}


	public void clickByClassName(String classVal) throws Exception {
		driver.findElementByClassName(classVal).click();
		System.out.println("Element "+classVal+" Is Clicked");

	}

	@Override
	public void clickByName(String name) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickByLink(String name) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickByLinkNoSnap(String name) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickByXpath(String xpathVal) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickByXpathNoSnap(String xpathVal) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void selectVisibileTextById(String id, String value) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectIndexById(String id, int value) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToParentWindow() {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToLastWindow() {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void takeSnap() {
		File src= driver.getScreenshotAs(OutputType.FILE);
		File dsc = new File("./snaps/image"+i+".jpg");
		try {
			FileUtils.copyFile(src, dsc);
		} catch (Exception e) {
			System.err.println("Exception");
		}
		finally {
			i++;
		}
	}

	
	public void closeBrowser() {
		driver.close();
	}


	public void closeAllBrowsers() {
		driver.quit();
	}

}
