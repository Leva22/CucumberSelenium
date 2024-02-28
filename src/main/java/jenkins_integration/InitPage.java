package jenkins_integration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InitPage extends initAbstractComponents {

	public WebDriver driver = null;
	// Elements factory.
	@FindBy(id = "userEmail")
	WebElement userEmail;

	@FindBy(id = "userPassword")
	WebElement password;

	@FindBy(id = "login")
	WebElement submit;

	@FindBy(css = "[class*='flyInOut']")
	WebElement wrongMessageText;

	// Constructor with parameters.
	public InitPage(WebDriver driver) {
		super(driver);
		this.driver = driver;

		// Driver initialization.
		PageFactory.initElements(driver, this);
	}

	public Object getErrorMessage() {
		waitingForElemenToAppear(wrongMessageText);
		return wrongMessageText.getText();
	}

	public void goToWebPage() {
		driver.get("https://rahulshettyacademy.com/client");
	}

	/**
	 * This method handles the loggin steps.
	 * 
	 * @param email
	 * @param emailPws
	 * 
	 */
	public void loginToApp(String email, String emailPws) {
		userEmail.sendKeys(email);
		this.password.sendKeys(emailPws);
		// Clicking on Login in.
		submit.click();
	}

}
