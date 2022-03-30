package admin_area.positive;

import core.BaseTest;
import elements.LeftNavigationBar;
import org.testng.annotations.Test;
import pages.admin_area.LoginPage;
import pages.admin_area.Products;

public class ProductsTests extends BaseTest {

    @Test
    public void bla(){
        LoginPage.goTo();
        LoginPage.login("admin1","parola123!");
        LeftNavigationBar.clickCatalogDrobDownMenu();
        LeftNavigationBar.clickProducts();
        Products.writeIninputPriceField("100.00");
        Products.clickOnFilterButton();
        Products.verifyTheFilterPrices("100.00");

    }
}
