package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OE_LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_02_LoginUserWithCorrectInfo {
    /*
    1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'Login to your account' is visible
6. Enter correct email address and password
7. Click 'login' button
8. Verify that 'Logged in as username' is visible
9. Click 'Delete Account' button
10. Verify that 'ACCOUNT DELETED!' is visible
     */
   @Test
    public void loginWithCorrectMailAndPassword(){
       // 1. Launch browser
       //2. Navigate to url 'http://automationexercise.com'
       Driver.getDriver().get(ConfigReader.getProperty("url_otomationexercise"));
       //3. Verify that home page is visible successfully
       String expectedUrl = "https://www.automationexercise.com/";
       String actualUrl = Driver.getDriver().getCurrentUrl();
       Assert.assertEquals(actualUrl,expectedUrl);
       //4. Click on 'Signup / Login' button
       OE_LoginPage otomationexerciseLP = new OE_LoginPage();
       otomationexerciseLP.signup_login_navbar.click();
       //5. Verify 'Login to your account' is visible
       Assert.assertTrue(otomationexerciseLP.loginToYourAccountText.isDisplayed());
       //6. Enter correct email address and password
      otomationexerciseLP.loginEmailBox.sendKeys(ConfigReader.getProperty("e_mail"));
      otomationexerciseLP.loginPasswordBox.sendKeys(ConfigReader.getProperty("password"));
      //7. Click 'login' button
      otomationexerciseLP.loginSubmitButton.click();
      //8. Verify that 'Logged in as username' is visible
      Assert.assertTrue(otomationexerciseLP.loggedInAsUsername.isDisplayed());
      //9. Click 'Delete Account' button
       Driver.closeDriver();
   }
}
