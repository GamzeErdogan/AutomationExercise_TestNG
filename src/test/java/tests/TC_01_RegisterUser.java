package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OE_LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import com.github.javafaker.Faker;

public class TC_01_RegisterUser {
    /*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'New User Signup!' is visible
6. Enter name and email address
7. Click 'Signup' button
8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
9. Fill details: Title, Name, Email, Password, Date of birth
10. Select checkbox 'Sign up for our newsletter!'
11. Select checkbox 'Receive special offers from our partners!'
12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
13. Click 'Create Account button'
14. Verify that 'ACCOUNT CREATED!' is visible
15. Click 'Continue' button
16. Verify that 'Logged in as username' is visible
17. Click 'Delete Account' button
18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
     */
    @Test
    public void register_user() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("url_otomationexercise"));
        //3. Verify that home page is visible successfully
        OE_LoginPage otomationExercisePage = new OE_LoginPage();
        Assert.assertTrue(otomationExercisePage.logo_homepage.isDisplayed());
        //4. Click on 'Signup / Login' button
        otomationExercisePage.signup_login_navbar.click();
        //5. Verify 'New User Signup!' is visible
        Assert.assertTrue(otomationExercisePage.newUserSignupText.isDisplayed());
        //6. Enter name and email address
        Faker faker = new Faker();
        otomationExercisePage.nameBox.sendKeys(faker.name().username());
        otomationExercisePage.e_mailBox.sendKeys(faker.internet().emailAddress());
        //7. Click 'Signup' button
        otomationExercisePage.signUpButton.submit();
        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        Assert.assertTrue(otomationExercisePage.enterAccountInformationText.isDisplayed());
        //9. Fill details: Title, Name, Email, Password, Date of birth
        //10. Select checkbox 'Sign up for our newsletter!'
        //11. Select checkbox 'Receive special offers from our partners!'
        Actions actions = new Actions(Driver.getDriver());
        actions.click(otomationExercisePage.radioButton_genderMRS)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys("7")
                .sendKeys(Keys.TAB)
                .sendKeys("March")
                .sendKeys(Keys.TAB)
                .sendKeys("1980")
                .sendKeys(Keys.TAB)
                .click()
                .sendKeys(Keys.TAB)
                .click()
                .sendKeys(Keys.TAB).perform();
        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        actions.click(otomationExercisePage.firstNameInput)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys("Efficy")
                .sendKeys(Keys.TAB)
                .sendKeys("12 Street")
                .sendKeys(Keys.TAB)
                .sendKeys("Germany Boulevard")
                .sendKeys(Keys.TAB)
                .sendKeys("Singapora")
                .sendKeys(Keys.TAB)
                .sendKeys("abc")
                .sendKeys(Keys.TAB)
                .sendKeys("City")
                .sendKeys(Keys.TAB)
                .sendKeys("91000")
                .sendKeys(Keys.TAB)
                .sendKeys("123455").perform();
        //13. Click 'Create Account button'
        otomationExercisePage.createCountButton.submit();
        //14. Verify that 'ACCOUNT CREATED!' is visible
        Assert.assertTrue(otomationExercisePage.accountCreatedText.isDisplayed());
        //15. Click 'Continue' button
        otomationExercisePage.continueButton.click();
        //16. Verify that 'Logged in as username' is visible
        Assert.assertTrue(otomationExercisePage.loggedInAsUsername.isDisplayed());
        //17. Click 'Delete Account' button
        otomationExercisePage.deleteAccount_navbar.click();
        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        Assert.assertTrue(otomationExercisePage.accountDeletedText.isDisplayed());
        otomationExercisePage.continueButtonDeletePage.click();

        Driver.closeDriver();
    }
}
