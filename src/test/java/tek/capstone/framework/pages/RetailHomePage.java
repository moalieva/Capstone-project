package tek.capstone.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//span[text()='All']")
	public WebElement allElement;

	@FindBy(id = "signinLink")
	public WebElement signIn;

	@FindBy(id = "accountLink")
	public WebElement account;

	@FindBy(xpath = "//select[@class='search__select']")
	public WebElement search;

	@FindBy(xpath = "//div[class='sidebar_content-item']/span")
	public List<WebElement> sidebar;

	@FindBy(id = "search")
	public WebElement allDepartment;

	@FindBy(id = "searchInput")
	public WebElement searchInputField;

	@FindBy(id = "searchBtn")
	public WebElement searchButton;

	@FindBy(xpath = "//p[@class='products__name']")
	public WebElement productNameItem;

	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement Qty2;

	@FindBy(id = "addToCartBtn")
	public WebElement addToCartButton;

	@FindBy(id = "cartQuantity")
	public WebElement cartQuantity;

	@FindBy(id = "contentHeader")
	public WebElement ShopByDepartmentList;

	@FindBy(xpath = "//div[@class='model_content h-screen w-80']")
	public WebElement SubPageOfShoppingList;

	@FindBy(id = "cartBtn")
	public WebElement cart;

	@FindBy(id = "proceedBtn")
	public WebElement proceedToCheckout;

	@FindBy(id = "addAddressBtn")
	public WebElement addAddressBtn;

	@FindBy(id = "addPaymentBtn")
	public WebElement addPaymentBtn;

	@FindBy(id = "placeOrderBtn")
	public WebElement placeOrderBtn;

	@FindBy(xpath = "//p[text()='Order Placed, Thanks']")
	public WebElement orderPlacedMessage;

	@FindBy(id = "orderLink")
	public WebElement ordersOption;

	@FindBy(id = "//a[@id='signinLink']")
	public WebElement signInButton;

	@FindBy(id="//a[@id='accountLink']")
	public WebElement accountOption;

	
	public WebElement tekSchoolLogo;
	
	

}