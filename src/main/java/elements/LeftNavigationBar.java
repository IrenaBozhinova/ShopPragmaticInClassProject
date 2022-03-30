package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.core.SuperPage;
import utils.Browser;

public class LeftNavigationBar extends SuperPage {
    @FindBy(xpath = "//*[@id='menu-catalog']/a")
    private static WebElement catalogDrobDownMenu;

    @FindBy(xpath = "//*[@id='menu-catalog']/ul/li[2]/a")
    private static WebElement products;

    static {
        PageFactory.initElements(Browser.driver, LeftNavigationBar.class);
    }

    /**
     * Clicks the 'Catalog' DrobDownMenu.
     */
    public static void clickCatalogDrobDownMenu() { catalogDrobDownMenu.click();}



    /**
     * Clicks the 'Products' menu.
     */
    public static void clickProducts() {
        waitForElementToBeClickable(products);
        products.click();
    }
}
