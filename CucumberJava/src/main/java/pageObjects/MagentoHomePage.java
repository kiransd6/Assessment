package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MagentoHomePage {

	public WebDriver driver;
	public CreateNewCustomerPage createNewCustomerPage;

	public MagentoHomePage(WebDriver driver) {
		this.driver = driver;
		createNewCustomerPage = new CreateNewCustomerPage(driver);
	}

	private By createAnAccountLnk = By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']");

	public void clickOnCreateAnAccountLnk() {
		driver.findElement(createAnAccountLnk).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(20000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(createNewCustomerPage.getFirstName()));
	}

}
