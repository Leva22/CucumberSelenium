package jenkins_integration;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import page_obj_model_Testng.LandingPage;

public class ErrorValidations extends Base_browser {

	@Test
	public void errorVal() {
		String productName = "ZARA COAT 3";
		// *[@id="toast-container"]/div/div
		By wrongMessageText = By.xpath("//*[@id=\"toast-container\"]/div/div");

		// Initializing browser.
		configBase();

		// Go to Home Page.
		LandingPage homePage = launchLandingPage();


		// "anshika@gmail.com")
		// Iamking@000
		// Login in to the app.
		String wrongPassw = "wrongPass";
		homePage.loginToApp("anshika@gmail.com", wrongPassw);

		AssertJUnit.assertEquals("Incorrect email or password.", homePage.getErrorMessage());

	}

}
