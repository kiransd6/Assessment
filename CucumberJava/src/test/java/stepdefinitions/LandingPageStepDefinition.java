package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinition {

	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	public TestContextSetup testContextSetup;
	public LandingPage landingPage;

	public LandingPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.landingPage = testContextSetup.pageObjectManager.getLandingPage();
	}

	@Given("User is on the magento Landing Page")
	public void user_is_on_magento_Landing_Page() {
		Assert.assertTrue(landingPage.getTitleLandingOage().contains("Home Page"));
	}

}
