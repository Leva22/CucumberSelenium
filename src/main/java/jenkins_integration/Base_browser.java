package jenkins_integration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

import controlles.BrowsersController;
import page_obj_model_Testng.LandingPage;

public class Base_browser {

	protected WebDriver driver = null;
	protected LandingPage homePage = null;

	// public static void main(String[] args) {
	// configBase();
	// }

	public void configBase() {

		// ChromeOptions options = new ChromeOptions();

		/**
		 * The argumet headless help to excecute chrome on backgruund for jenkinks
		 * excecution.
		 */

		// options.addArguments("headless");

		driver = new ChromeDriver();
		// driver.manage().window().maximize();
		// Establishing implicit timing.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public LandingPage launchLandingPage() {
		// Creating the main page Object.

		homePage = new LandingPage(driver);
		// Go to. Page.
		homePage.goToWebPage();
		return homePage;
	}

	/**
	 * Method to take an screenshot
	 */
	public String takeScreenshot(String testCaseName) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenShotPath = "";
		try {
			FileUtils.copyFile(src, new File("./resources/" + "report" + testCaseName + ".png"));
			screenShotPath = "./resources/" + "report" + testCaseName + ".png";

		} catch (IOException e) {
			e.printStackTrace();
		}
		return screenShotPath;

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}