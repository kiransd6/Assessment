package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public WebDriver driver;
	public MagentoHomePage magentoHomePage;
	public CreateNewCustomerPage createNewCustomerPage;
	public LandingPage landingPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public MagentoHomePage getMagentoHomePage() {
		magentoHomePage = new MagentoHomePage(driver);
		return magentoHomePage;
	}

	public CreateNewCustomerPage getNewCreateCustomerPage() {
		createNewCustomerPage = new CreateNewCustomerPage(driver);
		return createNewCustomerPage;
	}

	public LandingPage getLandingPage() {
		landingPage = new LandingPage(driver);
		return landingPage;
	}
}
