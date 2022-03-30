package pages.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Browser;

public class SuperPage {

    protected static WebElement waitForElementToBeClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(Browser.driver, 3);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }


}
