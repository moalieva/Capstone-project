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

public class RetailAccountSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().account);
		logger.info("User clicked on Account");
	}

	@When("User update Name {string} and phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String PhoneValue) {
		clearTextUsingSendKeys(factory.accountPage().nameInputField);
		sendText(factory.accountPage().nameInputField, nameValue);
		clearTextUsingSendKeys(factory.accountPage().phoneInputField);
		sendText(factory.accountPage().phoneInputField, PhoneValue);
		logger.info("User updated name and phone");
	}

	@And("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().updateButton);
		logger.info("User clicked on Update button");

	}

	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().personalInformationUpdateMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInformationUpdateMessage));
		logger.info("user Profile Information Updated");

	}

	@And("User enter below information")
	public void userEnterBelowInformation(DataTable data) {
		List<Map<String, String>> signUpData = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPassInput, signUpData.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPassInput, signUpData.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPassInput, signUpData.get(0).get("confirmPassword"));

		logger.info("user add the previous password,the new password and confirm the new password");
	}

	@And("User click on Change Password button")
	public void userClickOnChangePasswordBtn() {
		click(factory.accountPage().credentialsSubmitBtn);
		logger.info("user clicked on Change Password button");

	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed1(String expectedMessage) {
		if (expectedMessage.contains("Password")) {
			waitTillPresence(factory.accountPage().PasswordUpdatedSuccessfullyMessage);
			Assert.assertEquals(expectedMessage, factory.accountPage().PasswordUpdatedSuccessfullyMessage.getText());
			logger.info(expectedMessage + "is displayed");
		} else if (expectedMessage.contains("Payment Method added")) {

			waitTillPresence(factory.accountPage().paymentMethodAddedSucesfullyMessage);
			Assert.assertEquals(expectedMessage, factory.accountPage().paymentMethodAddedSucesfullyMessage.getText());
			logger.info(expectedMessage + "is displayed");

		} else if (expectedMessage.contains("Address Added Successfully")) {

			waitTillPresence(factory.accountPage().AddressAddedSuccesfully);
			Assert.assertEquals(expectedMessage, factory.accountPage().AddressAddedSuccesfully.getText());
			logger.info(expectedMessage + "is displayed");
		} else if (expectedMessage.contains("Address Updatde Successfully")) {

			waitTillPresence(factory.accountPage().AddressUpdatedSuccesfully);
			Assert.assertEquals(expectedMessage, factory.accountPage().AddressUpdatedSuccesfully.getText());
			logger.info(expectedMessage + "is displayed");
		} else if (expectedMessage.contains("Order Placed, Thanks")) {

			waitTillPresence(factory.homePage().orderPlacedMessage);
			Assert.assertEquals(expectedMessage, factory.homePage().orderPlacedMessage.getText());
			logger.info(expectedMessage + "is displayed");
		}

	}

	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().addPyamentMethodLink);
		logger.info("user clicked on add a payment method Link");

	}

	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>> paymentInformation = dataTable.asMaps(String.class, String.class);

		sendText(factory.accountPage().cardNumberInput, paymentInformation.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCardInput, paymentInformation.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationYearInput, paymentInformation.get(0).get("expirationYear"));
		selectByVisibleText(factory.accountPage().expirationMonthInput,
				paymentInformation.get(0).get("expirationMonth"));

		sendText(factory.accountPage().securityCodeInput, paymentInformation.get(0).get("securityCode"));
		logger.info("User entered requied card information");

	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().addYourCardButton);
		logger.info("User clicked on Add your card button");

	}

	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().clickOnCard);

		click(factory.accountPage().cardEditButton);
		logger.info("User clicked on Edit Button");
	}

	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> paymentInformation = dataTable.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().cardNumberInput);
		sendText(factory.accountPage().cardNumberInput, paymentInformation.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.accountPage().nameOnCardInput);

		sendText(factory.accountPage().nameOnCardInput, paymentInformation.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationYearInput, paymentInformation.get(0).get("expirationYear"));
		selectByVisibleText(factory.accountPage().expirationMonthInput,
				paymentInformation.get(0).get("expirationMonth"));
		clearTextUsingSendKeys(factory.accountPage().securityCodeInput);
		sendText(factory.accountPage().securityCodeInput, paymentInformation.get(0).get("securityCode"));
		logger.info("User entered requied card information");

	}

	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().updateYourCardButton);
		logger.info("User clicked on Update your card button");
	}

	@Then("a message should be displayed 'Payment Method updated Successfully'")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
		waitTillPresence(factory.accountPage().paymentMethodAddedSucesfullyMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().PaymentMethodupdatedSuccesfully));
		logger.info("Payment card Has successfully Updated");

	}

	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().clickOnCard);
		waitTillPresence(factory.accountPage().cardremoveButton);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().cardremoveButton));

		logger.info("User clicked on remove button");

	}

	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		logger.info("User clicked on remove payment detail");
	}

	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().newAccountAddress);
		logger.info("Use clicked on add address option");
	}

	@And("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {

		List<Map<String, String>> addressInformation = dataTable.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().countryDropdown);
		selectByVisibleText(factory.accountPage().countryDropdown, addressInformation.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountPage().fullNameInput);
		sendText(factory.accountPage().fullNameInput, addressInformation.get(0).get("fullName"));
		slowDown();
		clearTextUsingSendKeys(factory.accountPage().phoneNumberInput);
		sendText(factory.accountPage().phoneNumberInput, addressInformation.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.accountPage().streetInput);
		sendText(factory.accountPage().streetInput, addressInformation.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountPage().apartmentInput);
		sendText(factory.accountPage().apartmentInput, addressInformation.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().cityInput);
		sendText(factory.accountPage().cityInput, addressInformation.get(0).get("city"));
		clearTextUsingSendKeys(factory.accountPage().stateInput);
		selectByVisibleText(factory.accountPage().stateInput, addressInformation.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountPage().zipCodeInput);
		sendText(factory.accountPage().zipCodeInput, addressInformation.get(0).get("zipCode"));

		logger.info("User entered requied address information");

	}

	@And("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().AddYourAddressBtn);
		logger.info("User clicked on Add your Address button");
		slowDown();
	}

	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().editButton);
		waitTillPresence(factory.accountPage().editButton);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().editButton));
		logger.info("user clicked on edit button");
	}

	@When("User edit address form with below information")
	public void userEditAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> editaddressInformation = dataTable.asMaps(String.class, String.class);

		selectByVisibleText(factory.accountPage().countryDropdown, editaddressInformation.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountPage().fullNameInput);
		sendText(factory.accountPage().fullNameInput, editaddressInformation.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountPage().phoneNumberInput);
		sendText(factory.accountPage().phoneNumberInput, editaddressInformation.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.accountPage().streetInput);
		sendText(factory.accountPage().streetInput, editaddressInformation.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountPage().apartmentInput);
		sendText(factory.accountPage().apartmentInput, editaddressInformation.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().cityInput);
		sendText(factory.accountPage().cityInput, editaddressInformation.get(0).get("city"));
		selectByVisibleText(factory.accountPage().stateInput, editaddressInformation.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountPage().zipCodeInput);
		sendText(factory.accountPage().zipCodeInput, editaddressInformation.get(0).get("zipCode"));

		logger.info("User entered requied address information");
		slowDown();
	}

	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountPage().addAddressUpdate);

		logger.info("user clicked on Update Address");

	}

	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().removeBtn);
		waitTillPresence(factory.accountPage().removeBtn);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().removeBtn));
		logger.info("user clicked on remove button");

	}

	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		try {
			Assert.assertFalse(isElementDisplayed(factory.accountPage().removeBtn));
			logger.info("Address detail removed");
		} catch (AssertionError e) {
			logger.info(e.getMessage());

		}

	}
}
