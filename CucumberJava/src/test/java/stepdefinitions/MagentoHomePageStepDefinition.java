package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;
import pageObjects.MagentoHomePage;
import utils.TestContextSetup;

public class MagentoHomePageStepDefinition {

	public WebDriver driver;
	public TestContextSetup testContextSetup;
	public MagentoHomePage magentoHomePage;

	public MagentoHomePageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		magentoHomePage = testContextSetup.pageObjectManager.getMagentoHomePage();
	}

	@When("the user is on the create an Account page")
	public void clickOnCreateAnAcountPage() {
		magentoHomePage.clickOnCreateAnAccountLnk();
	}

}
