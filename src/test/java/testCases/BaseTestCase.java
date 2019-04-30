package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;

import utilities.Helper;


public class BaseTestCase {

	public static WebDriver driver;

	@BeforeSuite
	@org.testng.annotations.Parameters ({"Browser"})

	public void StartDriver(@Optional("Chrome") String BrowserName) {
		if (BrowserName.equalsIgnoreCase("Chrome")) {

			String ChromePath = System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",ChromePath);
			driver = new ChromeDriver();
		}

		else if (BrowserName.equalsIgnoreCase("FireFox")) {
			String FireFoxPath = System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver",FireFoxPath);
			driver = new FirefoxDriver();
		}


		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://demo.nopcommerce.com/");
	}

	@AfterSuite(enabled = false)
	public void CLoseDriver() {

		driver.close();
	}
	// After each Method, ONLY IF the method is failed take a screenshot and put it in Screenshot file
	@AfterMethod

	public void ScreenShotOnFaluire (ITestResult Result) 
	{
		if (Result.getStatus() == ITestResult.FAILURE) 
		{
			System.out.println("Failed!");
			System.out.println("Taking ScreenShot...");
			Helper.CaptureScreenShot(driver, Result.getName());
		} 

	}

}
