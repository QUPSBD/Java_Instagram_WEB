package Tests;

import Base.DriverSetup;
import Base.Gmail_Login;
import Pages.TC_003_Login_Gmail_02;
import Pages.TC_007_Profile_02;
import Pages.TC_007_Profile_Icon_01;
import Pages.TC_007_Saved_003;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TC_007_Saved_Test_003 extends DriverSetup {

    @Test
    public void saved_test() throws InterruptedException {
        Gmail_Login access = new Gmail_Login(driver);
        access.signInGmail();

        TC_007_Profile_Icon_01 p_icon = new TC_007_Profile_Icon_01(driver);
        p_icon.clickOnProfile_icon();
        Thread.sleep(5000);
        TC_007_Saved_003 t_saved = new TC_007_Saved_003(driver);
        t_saved.clickOnSaved();
        Thread.sleep(2000);
        t_saved.clickOnCollection();
        Thread.sleep(3000);
        t_saved.enter_NewCollection("Do good and good will come to you.");
        Thread.sleep(5000);
        t_saved.clickOnNextBtn();
        Thread.sleep(3000);
        t_saved.doneBtn();
        Thread.sleep(10000);


    }
}
