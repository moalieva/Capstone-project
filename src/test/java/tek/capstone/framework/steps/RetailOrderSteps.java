package tek.capstone.framework.steps;

import org.junit.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	POMFactory factory = new POMFactory();


@When("User click on Orders section")
public void userClickOnOrdersSection() {
	 click(factory.homePage().ordersOption);
	    logger.info("user clicked on orders section");
}
@When("User click on first order in list")
public void userClickOnFirstOrderInList() {
	click(factory.orderPage().firstOrderItem);
    logger.info("user clicked on first Order in list");
}
@When("User click on Cancel The Order button")
public void userClickOnCancelTheOrderButton() {
	click(factory.orderPage().cancelButton);
    logger.info("user clicked on Cancel the order button");
}
@When("User select the cancelation Reason {string}")
public void userSelectTheCancelationReason(String reason) {
	selectByVisibleText(factory.orderPage().cancelationReasonDropdown,reason);
	  logger.info("user clicked on CancelationReason");
    
}
@When("User click on Cancel Order button")
public void userClickOnCancelOrderButton() {
	click(factory.orderPage().cancelOrderButton);
    logger.info("user clicked on Cancel order button");
}
@Then("a cancelation message should be displayed {string}")
public void aCancelationMessageShouldBeDisplayed(String expectedMessage) {
	
if (expectedMessage.contains("Your Oreder Has Been Cancelled")){
	Assert.assertEquals(expectedMessage, factory.orderPage().yourOrderHasbeenCancelledMessage.getText());
	logger.info("a cancelation messg displayed" + expectedMessage);	
} else if (expectedMessage.contains("Return was succesfull")) {
	Assert.assertEquals(expectedMessage, factory.orderPage().returnWasSuccessfullMessage.getText());
	logger.info("a cancelation messg displayed" + expectedMessage); 
}

@When("User click on Return Items button")
public void userClickOnReturnItemsButton() {
	slowDown();
	click(factory.orderPage().returnItemButton);
    logger.info("user clicked on Return Items button");
}
@When("User select the Return Reason {string}")
public void userSelectTheReturnReason(String reason) {
	selectByVisibleText(factory.orderPage().cancelationReasonDropdown,reason);
	  logger.info("user selected the cancelation Reason" + reason);
	
}
@When("User select the drop off service {string}")
public void userSelectTheDropOffService(String dropOffLocation) {
	selectByVisibleText(factory.orderPage().dropOffDropDown,dropOffLocation);

	  logger.info("user selected the cancelation Reason" + dropOffLocation);
	
}
@When("User click on Return Order button")
public void userClickOnReturnOrderButton() {
   click(factory.orderPage().cancelOrderButton);
   logger.info("user click on Return Order Button");
}

@When("User click on Review button")
public void userClickOnReviewButton() {
	 click(factory.orderPage().reviewButton);
	   logger.info("user click on review Button");
}

@When("User write Review headline  {string} and {string}")
public void userWriteReviewHeadlineAnd(String headline, String body) {
  sendText(factory.orderPage().reviewHeadlineInput,headline);
  sendText(factory.orderPage().reviewDescriptionInput,body);
  logger.info("user wrote  review on product");
}
@When("User click Add your Review button")
public void userClickAddYourReviewButton() {
	click(factory.orderPage().reviewSubmitButton);
	   logger.info("user clicked add your review Button");
}
@Then("a review message should be displayed {string}")
public void aReviewMessageShouldBeDisplayed(String expected) {
	waitTillPresence(factory.orderPage().yourReviewWasAddedSuccessfullyMessage);
	Assert.assertEquals(factory.orderPage().yourReviewWasAddedSuccessfullyMessage.getText(),expected);
	logger.info("a review messg displayed" + expected);	
}
}



