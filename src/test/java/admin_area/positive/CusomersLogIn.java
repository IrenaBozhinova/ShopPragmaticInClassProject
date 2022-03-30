package admin_area.positive;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.admin_area.CustomerHome;
import pages.admin_area.Customers;
import pages.admin_area.LoginPage;

public class CusomersLogIn extends BaseTest {

    @Test
    public void goToCusomerPage(){
        LoginPage.goTo();
        LoginPage.login("admin", "parola123!");
        Customers.clickCustomerDrobDownField();
        Customers.clickCustomersFieldTwo();
        CustomerHome.writeInImputNameField("Georgi Georgiev");
        CustomerHome.clickFilterButton();
        CustomerHome.peoplesCustomerName("Georgi Georgiev");
        CustomerHome.verifyFilteredNamesNumber(7);
    }

}
