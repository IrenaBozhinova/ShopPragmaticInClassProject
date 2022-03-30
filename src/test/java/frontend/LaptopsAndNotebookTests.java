package frontend;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.frontend.FrontLoginPage;
import pages.frontend.LaptopsAndNotebookPage;

public class LaptopsAndNotebookTests extends BaseTest {

    @Test
    public void findLaptopsNotebooks(){
        FrontLoginPage.goToFrontend();
        FrontLoginPage.clickTabletsField();
        FrontLoginPage.clickLaptopsAndNotebook();
        LaptopsAndNotebookPage.findePriceLowHide();
        LaptopsAndNotebookPage.verifyPrice("2,000.00");
    }
}
