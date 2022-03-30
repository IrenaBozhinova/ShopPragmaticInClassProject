package pages.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.core.SuperPage;
import utils.Browser;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;

public class LaptopsAndNotebookPage extends SuperPage {

    Wait<WebDriver> wait = new WebDriverWait(Browser.driver, 10);

    @FindBy(id = "input-sort")
    private static WebElement sotrtBy;

    @FindBy(xpath = "//*[@id='input-sort']/option[text()='Model (Z - A)']")
    private static Option endOption;

    @FindBy(xpath = "/*[@id='input-sort']/option[text()='Price (Low > High)']")
    private static Option priceLowToHide;

    @FindBy(xpath = "//p[@class= 'price']")
    private static WebElement priceField;





    static {
        PageFactory.initElements(Browser.driver, LaptopsAndNotebookPage.class);
    }


    public static void clickSortBy() {
        sotrtBy.click();
    }



    public static void findePriceLowHide() {
        Select objectSortBy = new Select(sotrtBy);
        objectSortBy.selectByVisibleText("Price (High > Low)");
    }

    public static void verifyPrice(String price){
        Assert.assertTrue( priceField.getText().contains(price));
    }


}






