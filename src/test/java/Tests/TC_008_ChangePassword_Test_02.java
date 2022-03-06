package Tests;

import Base.DriverSetup;
import Base.FunctionalitiesOfSettings;
import Base.Gmail_Login;
import Pages.*;
import org.testng.annotations.Test;


public class TC_008_ChangePassword_Test_02 extends DriverSetup {

    @Test
    public void change_Password_test() throws InterruptedException {
        Gmail_Login access = new Gmail_Login(driver);
        access.signInGmail();

        FunctionalitiesOfSettings p_setting = new FunctionalitiesOfSettings(driver);
        p_setting.profile_setting();

        TC_008_ChangePassword_02 changePass = new TC_008_ChangePassword_02(driver);
        changePass.clickOnChangePsw();
        Thread.sleep(3000);
        changePass.enterOldPsw("Qups@1234");
        Thread.sleep(3000);
        changePass.enterNewPsw("Demo@1234");
        Thread.sleep(3000);
        changePass.enterCnfrmPsw("Demo@1234");
        Thread.sleep(3000);
        changePass.chnagePasswordBtn();
        Thread.sleep(5000);

    }
}
