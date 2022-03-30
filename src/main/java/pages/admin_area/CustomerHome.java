package pages.admin_area;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.core.SuperPage;
import utils.Browser;

import java.util.ArrayList;
import java.util.List;

public class CustomerHome extends SuperPage {

    private static int sizeListCustomerName;


    @FindBy(id = "input-name")
    private static WebElement imputNameField;

    @FindBy(id = "button-filter")
    private static WebElement filterButton;

    @FindBy(xpath = "//tbody//td[2]")
    private static List<WebElement> listCustomerNames;



    static{
        PageFactory.initElements(Browser.driver, CustomerHome.class);
    }


    public static void writeInImputNameField(String customerName){
        imputNameField.sendKeys(customerName);
    }


    public static void clickFilterButton(){
        filterButton.click();
    }

    public static @NotNull List<String> peoplesCustomerName(String customerName) {
        ArrayList<String> textCustomerName = new ArrayList<>();
        for (WebElement currentCustomerName : listCustomerNames) {
            if(currentCustomerName.getText().contains((customerName))){
                textCustomerName.add(currentCustomerName.getText());
            }
            sizeListCustomerName = textCustomerName.size();
        }
        return textCustomerName;
    }

//    public static void sevenLie(){
//        int sizeImena = listCustomerNames.size();
//        Assert.assertEquals(sizeImena,7);
//    }

    public static void verifyFilteredNamesNumber(int number){
        Assert.assertEquals(sizeListCustomerName, number);
    }

}
