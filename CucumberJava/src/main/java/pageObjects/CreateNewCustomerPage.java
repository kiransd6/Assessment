package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewCustomerPage {

	public WebDriver driver;

	public CreateNewCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	private By firstNameInput = By.xpath("//input[@id='firstname']");
	private By lastNameInput = By.xpath("//input[@id='lastname']");
	
	private By emailInput = By.xpath("//input[@id='email_address']");
	private By passwordInput = By.xpath("//input[@id='password']");
	private By confirmPasswordInput = By.xpath("//input[@id='password-confirmation']");

	private By createAnAccountBtn = By
			.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]");

	private By accountLbl = By.xpath("//span[text()='My Account']");

	public void fillInPersonalImformation() {
		driver.findElement(firstNameInput).sendKeys("Sai");
		driver.findElement(lastNameInput).sendKeys("lastname");
	}

	public void fillInSignInmformation() {
		driver.findElement(emailInput).sendKeys("scahin405@gmail.com");
		driver.findElement(lastNameInput).sendKeys("lastname");
		driver.findElement(passwordInput).sendKeys("Sachin@143");
		driver.findElement(confirmPasswordInput).sendKeys("Sachin@143");
	}

	public void clickOnCreateAnAccountBtn() {
		driver.findElement(createAnAccountBtn).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(20000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(accountLbl));
	}

	public By getFirstName() {
		return firstNameInput;
	}

}
