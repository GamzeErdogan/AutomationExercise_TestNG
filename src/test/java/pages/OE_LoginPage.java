package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OE_LoginPage {
    public OE_LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //********HOME_PAGE*****************
    @FindBy(xpath = "//div[@class='logo pull-left']")
    public WebElement logo_homepage;
    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public  WebElement signup_login_navbar;
    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement newUserSignupText;
    @FindBy(xpath = "//*[@data-qa='signup-name']")
    public WebElement nameBox;
    @FindBy(xpath = "//*[@data-qa='signup-email']")
    public WebElement e_mailBox;
    @FindBy(xpath = "//*[@data-qa='signup-button']")
    public WebElement signUpButton;
    @FindBy(xpath = "//*[@data-qa='login-email']")
    public WebElement loginEmailBox;
    @FindBy(xpath = "//*[@data-qa='login-password']")
    public WebElement loginPasswordBox;
    @FindBy(xpath = "//*[@data-qa='login-button']")
    public WebElement loginSubmitButton;
    @FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
    public WebElement emailPasswordIncorrectErrorText;

    //**********SIGN_UP_PAGE****************
    @FindBy(xpath = "(//h2[@class='title text-center'])[1]")
    public WebElement enterAccountInformationText;
    @FindBy(xpath = "//input[@id='id_gender2']")
    public WebElement radioButton_genderMRS;
    @FindBy(xpath = "//*[@data-qa='first_name']")
    public WebElement firstNameInput;
    @FindBy(xpath = "//h2[text()='Login to your account']")
    public WebElement loginToYourAccountText;

    //******ACCOUNT_CREATED_PAGES********
    @FindBy(xpath = "//*[@data-qa='account-created']")
    public WebElement accountCreatedText;
    @FindBy(xpath = "//*[@data-qa='continue-button']")
    public WebElement continueButton;

    @FindBy(xpath = "//i[@class='fa fa-user']")
    public WebElement loggedInAsUsername;
    @FindBy(xpath = "//i[@class='fa fa-trash-o']")
    public WebElement deleteAccount_navbar;
    @FindBy(xpath = "//*[@data-qa='create-account']")
    public WebElement createCountButton;

    //******ACCOUNT_DELETED_PAGES********
    @FindBy(xpath = "//*[@data-qa='account-deleted']")
    public WebElement accountDeletedText;
    @FindBy(xpath = "//*[@data-qa='continue-button']")
    public WebElement continueButtonDeletePage;



}
