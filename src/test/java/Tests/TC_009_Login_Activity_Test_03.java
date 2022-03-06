package Tests;

import Base.DriverSetup;
import Base.FunctionalitiesOfSettings;
import Base.Gmail_Login;
import Pages.TC_009_Help_05;
import Pages.TC_009_Login_Activity_03;
import org.testng.annotations.Test;

public class TC_009_Login_Activity_Test_03 extends DriverSetup {

    @Test
    public void activity_test() throws InterruptedException {
        Gmail_Login access = new Gmail_Login(driver);
        access.signInGmail();

        FunctionalitiesOfSettings p_setting =  new FunctionalitiesOfSettings(driver);
        p_setting.profile_setting();

        TC_009_Login_Activity_03 activity = new TC_009_Login_Activity_03(driver);
        activity.clickOnLoginActivity();
        Thread.sleep(5000);

    }
}
