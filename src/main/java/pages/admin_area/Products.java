package pages.admin_area;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.core.SuperPage;
import utils.Browser;

import java.util.ArrayList;
import java.util.List;

public class Products extends SuperPage {

    @FindBy(xpath = "//tbody//td[5]")
    private static List<WebElement> prices;

    @FindBy(id = "input-price")
    private static WebElement inputPriceField;

    @FindBy(id = "button-filter")
    private static WebElement filterButton;


    static {
        PageFactory.initElements(Browser.driver, Products.class);
    }

    private static List<String> getPrices() {
        List<String> pricesText = new ArrayList<>();
        for (WebElement currentPrice : prices) {
            pricesText.add(currentPrice.getText());
        }
        return pricesText;
    }

    public static void writeIninputPriceField (String price) {
        inputPriceField.sendKeys(price);
    }

    public static void clickOnFilterButton(){
        filterButton.click();
    }

    public static void verifyTheFilterPrices(String price){
        List<String> pricesText = getPrices();
        for (String currentPricesText : pricesText) {
            Assert.assertTrue(currentPricesText.contains(price));
        }

    }


}
