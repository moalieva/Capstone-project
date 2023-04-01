package tek.capstone.framework.steps;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allElement);
		logger.info("user clicked on all element");
	}

	@And("User verifies cart icon is present")
	public void userVerifiesCartIconIsPresent() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().cart));
		logger.info("cart icon is present");
		slowDown();
	}

	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> shopByDepartment = dataTable.asLists(String.class);
		for (int i = 0; i < shopByDepartment.get(0).size(); i++) {
			Assert.assertTrue(isElementDisplayed(
					getDriver().findElement(By.xpath("//span[test()='" + shopByDepartment.get(0).get(i) + "']"))));
			logger.info(shopByDepartment.get(0).get(i) + "is present");

		}
	}

	@And("User on {string}")
	public void userOnElectronics(String department) {
		List<WebElement> dep = factory.homePage().sidebar;
		for (WebElement element : dep) {
			if (element.getText().equals(department)) {
				element.click();
				break;
			}
		}
	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		List<List<String>> departmentOptions = dataTable.asLists(String.class);
		List<WebElement> dep = factory.homePage().sidebar;
		for (int i = 0; i < departmentOptions.get(0).size(); i++) {
			for (WebElement element : dep) {

				if (element.getText().equals(departmentOptions.get(0).get(i))) {

					Assert.assertTrue(element.isDisplayed());
					logger.info(element.getText() + "is present");
				}
			}
		}

	}

	@When("User change the category to {string}")
	public void userChangeTheCategory(String value) {
		selectByVisibleText(factory.homePage().allDepartment, value);
		logger.info(value + "was selected from the drop down");
	}

	@When("User search for an item {string}")
	public void userSearchForAnItem(String value) {
		sendText(factory.homePage().searchInputField, value);
		logger.info("user entered " + value);

	}

	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchButton);
		logger.info("user clicked on search button");

	}

	@When("User click on item")
	public void userClickOnItem() {
		waitTillPresence(factory.homePage().productNameItem);
		click(factory.homePage().productNameItem);
		logger.info("user clicked on item");

	}

	@When("User select quantity {string}")
	public void userSelectQuantity(String qty) {

		selectByVisibleText(factory.homePage().Qty2, qty);
		logger.info("user selected quantity" + qty);

	}

	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.homePage().addToCartButton);
		logger.info("user clicked on add to cart");
	}

	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String expectedQuantity) {
		Assert.assertEquals(expectedQuantity, factory.homePage().cartQuantity.getText());

		logger.info(expectedQuantity + "is displayed");

	}

	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.homePage().cart);
		logger.info("user clicked on cart");
	}

	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.homePage().proceedToCheckout);
		logger.info("user clicked on proceedToCheckoutBtn");
	}

	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
		click(factory.homePage().addAddressBtn);
		logger.info("user clicked on addressLink");
	}

	@Then("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
		click(factory.homePage().addPaymentBtn);
		logger.info("user clicked on addPaymentBtn");

	}

	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		waitTillClickable(factory.homePage().placeOrderBtn);
		click(factory.homePage().placeOrderBtn);
		logger.info("user clicked on placeOrderBtn");
	}
}
