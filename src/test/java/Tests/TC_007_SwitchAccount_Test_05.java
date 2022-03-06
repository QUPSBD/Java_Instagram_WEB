package Tests;

import Base.DriverSetup;
import Base.Gmail_Login;
import Pages.TC_003_Login_Gmail_02;
import Pages.TC_007_Profile_Icon_01;
import Pages.TC_007_Settings_004;
import Pages.TC_007_SwitchAccount_005;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_007_SwitchAccount_Test_05 extends DriverSetup {

    @Test
    public void switchAccount_test() throws InterruptedException {
        Gmail_Login access = new Gmail_Login(driver);
        access.signInGmail();

        TC_007_Profile_Icon_01 p_icon = new TC_007_Profile_Icon_01(driver);
        p_icon.clickOnProfile_icon();
        Thread.sleep(5000);
        TC_007_SwitchAccount_005 t_switch = new TC_007_SwitchAccount_005(driver);
        t_switch.clickOnSwitch_Account();
        Thread.sleep(5000);
//        t_switch.clickOnDialogBox();
//        Thread.sleep(10000);

    }
}
