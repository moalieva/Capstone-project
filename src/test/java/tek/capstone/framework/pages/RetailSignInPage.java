package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
		// we are implementing PageFactory class to initialize the UI Elements
		// using initElements method of PageFactory class
		// this method accepts two parameters, first one is driver and second is this 
		// keyword which refers to variable of this class in this case
		// we are referring to UI elements that will store in this class. 
	}
	@FindBy (xpath = "//h1[text()='Sign in']")
	public WebElement signInPageLogo;
	
	@FindBy (id = "email")
	public WebElement emailField;
	
	@FindBy (id = "password")
	public WebElement passwordField;
	
	@FindBy (xpath = "//button[text()='Login']")
	public WebElement loginPageButton;
	
	@FindBy (linkText = "Create New Account")
	public WebElement createNewAccountButton;
	
	@FindBy (id = "newCompanyAccount")
	public WebElement wantToSellSomethingLink;
	
	@FindBy (css = "#nameInput")
	public WebElement signUpNameField;
	
	@FindBy (css = "#emailInput")
	public WebElement signUpEmailField;
	
	@FindBy (css = "#passwordInput")
	public WebElement signUpPasswordField;
	
	@FindBy (css = "#confirmPasswordInput")
	public WebElement signUpConfirmPasswordField;
	
	@FindBy (css = "#signupBtn")
	public WebElement signUpButton;
	
	@FindBy(xpath = "//img[@id='profileImage']")
	public WebElement profileImage;

	@FindBy(id = "//a[@id='newAccountBtn']")
	public WebElement newAccountButton;
	

}
