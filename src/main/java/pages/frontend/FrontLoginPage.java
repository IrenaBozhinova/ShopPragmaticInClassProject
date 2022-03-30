package pages.frontend;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.stylesheets.LinkStyle;
import pages.core.SuperPage;
import utils.Browser;

public class FrontLoginPage extends SuperPage {

    @FindBy(xpath = "//div[@class='navbar-header']/following-sibling::div//a[text()='Tablets']")
    private static WebElement tabletsField;

    @FindBy(css = "div.list-group a:nth-of-type(3)")
    public static WebElement laptopsAndNotebook;

    static{
        PageFactory.initElements(Browser.driver, FrontLoginPage.class);
    }




    public static void goToFrontend(){
        Browser.driver.get("http://shop.pragmatic.bg");
    }

    public static void clickTabletsField(){
        tabletsField.click();
    }

    public static void clickLaptopsAndNotebook() {
        laptopsAndNotebook.click();

    }


}
