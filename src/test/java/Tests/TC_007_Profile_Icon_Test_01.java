package Tests;

import Base.DriverSetup;
import Base.Gmail_Login;
import Pages.TC_007_Profile_Icon_01;
import org.testng.annotations.Test;


public class TC_007_Profile_Icon_Test_01 extends DriverSetup {

    @Test
    public void profile_icon_test() throws InterruptedException {
        Gmail_Login access = new Gmail_Login(driver);
        access.signInGmail();

        TC_007_Profile_Icon_01 p_icon = new TC_007_Profile_Icon_01(driver);
        p_icon.clickOnProfile_icon();
        Thread.sleep(5000);

    }

}
