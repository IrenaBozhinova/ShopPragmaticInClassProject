package admin_area.positive;

import pages.admin_area.DashBoardPage;
import pages.admin_area.LoginPage;
import core.BaseTest;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void loginSuccessfully() {
        LoginPage.goTo();
        LoginPage.login("admin", "parola123!");
        DashBoardPage.verifyUserInfoText("Milen Strahinski");
    }
}
