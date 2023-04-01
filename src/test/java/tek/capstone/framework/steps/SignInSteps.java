package tek.capstone.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signInButton);
		logger.info("User clicked on Sign in Option");

	}

	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passwordValue) {
		sendText(factory.signInPage().emailField, emailValue);
		sendText(factory.signInPage().passwordField, passwordValue);
		logger.info("user entered email " + emailValue + "and password " + passwordValue);

	}

	@And("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginPageButton);
		logger.info("user clicked on login button");

	}

	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
		logger.info("User logged in into account");

	}

	@And("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().createNewAccountButton);
		logger.info("user click on create new account button");

	}

	@And("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> signUpInformation = dataTable.asMaps(String.class, String.class);
		sendText(factory.signInPage().signUpNameField, signUpInformation.get(0).get("name"));
		sendText(factory.signInPage().signUpEmailField, signUpInformation.get(0).get("email"));
		sendText(factory.signInPage().signUpPasswordField, signUpInformation.get(0).get("password"));
		sendText(factory.signInPage().signUpConfirmPasswordField, signUpInformation.get(0).get("confirmPassword"));
		logger.info("user filled sign up information");
	}

	@And("User click on SignUp button")
	public void userClickOnSignUpButton111() {
		click(factory.signInPage().signUpButton);
		logger.info("user click on sign up button");

	}

	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage11() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().profileImage));
		logger.info("user is logged into account page");

	}
}
