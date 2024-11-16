package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;
import pageObjects.CreateNewCustomerPage;
import pageObjects.MagentoHomePage;
import utils.TestContextSetup;

public class CreateNewCustomerPageStepDefinition {

	public WebDriver driver;
	public TestContextSetup testContextSetup;
	public MagentoHomePage magentoHomePage;
	public CreateNewCustomerPage createNewCustomerPage;

	public CreateNewCustomerPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		magentoHomePage = testContextSetup.pageObjectManager.getMagentoHomePage();
		createNewCustomerPage = testContextSetup.pageObjectManager.getNewCreateCustomerPage();
	}

	@When("the user fills in the personal information and signin informaiton details")
	public void userFillsInPersonalInformation() {
		createNewCustomerPage.fillInPersonalImformation();
		createNewCustomerPage.fillInSignInmformation();
	}

	@When("User clicks on create an account button")
	public void userClicksOnCreateAccountButton() {
		createNewCustomerPage.clickOnCreateAnAccountBtn();
	}

}
