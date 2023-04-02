package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RetailAccountPage {

	PageFactory.initElements(getDriver(), this);
}

	@FindBy(id="//input[@id='nameInput']")
	public WebElement nameInputField);

	@FindBy(id = "personalPhoneInput")
	public WebElement phoneInputField;

	@FindBy(id = "emailInput")
	public WebElement emailInputField;

	@FindBy(xpath = "//button[text()='Update']")
	public WebElement updateButton;

	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInformationUpdateMessage;

	@FindBy(id = "previousPasswordInput")
	public WebElement previousPassInput;

	@FindBy(id = "newPasswordInput")
	public WebElement newPassInput;

	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPassInput;

	@FindBy(id = "credentialsSubmitBtn")
	public WebElement credentialsSubmitBtn;

	@FindBy(xpath = "//div[text()=\"Password Updated Successfully\"]")
	public WebElement PasswordUpdatedSuccessfullyMessage;

	@FindBy(xpath = "//p[text()='Add a payment method']")
	public WebElement addPyamentMethodLink;

	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberInput;

	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCardInput;

	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonthInput;

	@FindBy(id = "expirationYearInput")
	public WebElement expirationYearInput;

	@FindBy(id = "securityCodeInput")
	public WebElement securityCodeInput;

	@FindBy(xpath = "//p[@class='account__payment-sub-title']")
	public WebElement clickOnCard;

	@FindBy(id = "paymentSubmitBtn")
	public WebElement addYourCardButton;

	@FindBy(xpath = "//div[text()=\'Payment Method added sucessfully']")
	public WebElement paymentMethodAddedSucesfullyMessage;

	@FindBy(xpath = "//div[@class='account_payment-sub']/p")
	public List<WebElement> cardEndingNumber;

	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement cardEditButton;

	@FindBy(xpath = "//button[text()='Update Your Card']")
	public WebElement updateYourCardButton;

	@FindBy(xpath = "//div[text()=\'Payment Method updated Succesfully']")
	public WebElement PaymentMethodupdatedSuccesfully;

	@FindBy(xpath = "//button[text()='remove']")
	public WebElement cardremoveButton;

	@FindBy(xpath = "//div[@class='account__address-new']")
	public WebElement newAccountAddress;

	@FindBy(xpath = "//select[@class='account__address-new-dropdown']")
	public WebElement countryDropdown;

	@FindBy(id = "fullNameInput")
	public WebElement fullNameInput;

	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumberInput;

	@FindBy(id = "streetInput")
	public WebElement streetInput;

	@FindBy(id = "apartmentInput")
	public WebElement apartmentInput;

	@FindBy(id = "cityInput")
	public WebElement cityInput;

	@FindBy(xpath = "//select[@name='state']")
	public WebElement stateInput;

	@FindBy(id = "zipCodeInput")
	public WebElement zipCodeInput;

	@FindBy(id = "addressBtn")
	public WebElement AddYourAddressBtn;

	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement AddressAddedSuccesfully;

	@FindBy(xpath = "//button[@class='account__address-btn']")
	public WebElement editButton;

	@FindBy(id = "addressBtn")
	public WebElement addAddressUpdate;

	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement AddressUpdatedSuccesfully;

	@FindBy(xpath = "//button[text()='Remove']")
	public WebElement removeBtn;

}
