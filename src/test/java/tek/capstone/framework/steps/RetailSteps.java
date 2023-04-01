package tek.capstone.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class RetailSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
		logger.info("user is on retail website");
		logger.info("Actual Title " + actualTitle + " Equals " + " ExpectedTitle " + expectedTitle);
	}

	@Given("login as tek user to retail app with username {string} and password {string}")
	public void loginAsTekUserToRetailAppWithUserNameAndPassword(String userNameValue, String passwordValue)
			throws InterruptedException {

	}

	@Then("assert application title {string}")
	public void assertApplicationTitle(String expectedTitle) {

	}

}
