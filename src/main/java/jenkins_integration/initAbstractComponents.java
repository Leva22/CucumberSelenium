package jenkins_integration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class is used to place all common code to re-use it and avoid
 * duplications.
 */
public class initAbstractComponents {
	private WebDriver driver = null;
	private WebDriverWait wait = null;

	@FindBy(css = "[routerlink*='cart']")
	private WebElement cartMenu;

	public initAbstractComponents(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	}

	/**
	 * Method to wait for an element to appear.
	 * 
	 * @param finby
	 */
	public void waitingForElemenToAppear(By finby) {
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(finby));
	}

	/**
	 * Method to wait for an element to appear.
	 * 
	 * @param finby
	 */
	public void waitingForElemenToAppear(WebElement webelement) {
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(webelement));
	}

	/**
	 * Method to wait for an element to Desappear
	 * 
	 * @param webelement
	 */
	public void waitingForElementToDesAppear(WebElement webelement) {
		wait.until(ExpectedConditions.invisibilityOf(webelement));
	}

	public void goToCartMenu() {

		cartMenu.click();
	}
}
