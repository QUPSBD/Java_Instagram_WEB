package Tests;

import Base.DriverSetup;
import Base.Gmail_Login;
import Pages.TC_003_Login_Gmail_02;
import Pages.TC_007_Profile_02;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_007_Profile_Test_02 extends DriverSetup {

    @Test
    public void profile_test() throws InterruptedException {
        Gmail_Login access = new Gmail_Login(driver);
        access.signInGmail();

        TC_007_Profile_02 p = new TC_007_Profile_02(driver);
        p.clickOnProfile_icon();
        Thread.sleep(5000);
        p.clickOnProfile();
        Thread.sleep(5000);
        //p.asserationMethod();

    }

}
