package Tests;

import Base.DriverSetup;
import Base.FunctionalitiesOfSettings;
import Base.Gmail_Login;
import Pages.TC_008_Apss_Website_03;
import org.testng.annotations.Test;

public class TC_008_Apps_Website_Test_03 extends DriverSetup {
    @Test
    public void apps_Website_test() throws InterruptedException {
        Gmail_Login access = new Gmail_Login(driver);
        access.signInGmail();

        FunctionalitiesOfSettings p_setting = new FunctionalitiesOfSettings(driver);
        p_setting.profile_setting();

        TC_008_Apss_Website_03 apsweb = new TC_008_Apss_Website_03(driver);
        apsweb.clickOnApps_Website();
        Thread.sleep(5000);
    }
}
