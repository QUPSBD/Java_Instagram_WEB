package Tests;

import Base.DriverSetup;
import Base.Gmail_Login;
import Pages.TC_003_Login_Gmail_02;
import Pages.TC_006_SearchBox;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_006_SearchBox_Test extends DriverSetup {

    @Test
    public void searchBox_test() throws InterruptedException {
        Gmail_Login access = new Gmail_Login(driver);
        access.signInGmail();

        TC_006_SearchBox tc_search = new TC_006_SearchBox(driver);
        tc_search.searchBar("nature");
        Thread.sleep(5000);
        tc_search.searchBar1();
        Thread.sleep(3000);
        tc_search.searchBar1();
        Thread.sleep(10000);
    }
}
