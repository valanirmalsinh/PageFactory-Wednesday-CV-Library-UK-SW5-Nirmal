package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utilities.Utility;

public class ResultPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement result;

    public void verifyTheResults(String actual,String expected,String text){
        softAssert(actual,expected,text);
        Reporter.log("Verify the result" +result.toString());
        CustomListeners.test.log(Status.PASS, " Verify text" +result);

    }
}
