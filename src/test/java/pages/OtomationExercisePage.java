package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OtomationExercisePage {
    public OtomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
