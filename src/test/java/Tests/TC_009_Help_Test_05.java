package Tests;

import Base.DriverSetup;
import Base.FunctionalitiesOfSettings;
import Base.Gmail_Login;
import Pages.TC_009_Email_Insta_04;
import Pages.TC_009_Help_05;
import org.testng.annotations.Test;

public class TC_009_Help_Test_05 extends DriverSetup {

    @Test
    public void help_test() throws InterruptedException {
        Gmail_Login access = new Gmail_Login(driver);
        access.signInGmail();

        FunctionalitiesOfSettings p_setting =  new FunctionalitiesOfSettings(driver);
        p_setting.profile_setting();

        TC_009_Help_05 t_help = new TC_009_Help_05(driver);
        t_help.clickOnHelp();
        Thread.sleep(5000);

    }
}
