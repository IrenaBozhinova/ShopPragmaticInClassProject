package pages.admin_area;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.core.SuperPage;
import utils.Browser;

public class Customers extends SuperPage {

    @FindBy(id = "menu-customer")
    private static WebElement customersDrobDownField;

    @FindBy(xpath = "//*[@id = 'menu-customer']/ul/li/*[text()='Customers']")
    private static WebElement customersFieldTwo;



    static {
        PageFactory.initElements(Browser.driver, Customers.class);
    }

    public static void clickCustomerDrobDownField(){
        customersDrobDownField.click();
    }

    public static void clickCustomersFieldTwo () {
        customersFieldTwo.click();
    }


}
