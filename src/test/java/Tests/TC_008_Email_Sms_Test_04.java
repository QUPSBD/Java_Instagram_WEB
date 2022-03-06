package Tests;

import Base.DriverSetup;
import Base.FunctionalitiesOfSettings;
import Base.Gmail_Login;
import Pages.TC_008_Email_Sms_04;
import org.testng.annotations.Test;


public class TC_008_Email_Sms_Test_04 extends DriverSetup {
    @Test
    public void email_Sms_test() throws InterruptedException {
        Gmail_Login access = new Gmail_Login(driver);
        access.signInGmail();

        FunctionalitiesOfSettings p_setting = new FunctionalitiesOfSettings(driver);
        p_setting.profile_setting();

        TC_008_Email_Sms_04 e_sms = new TC_008_Email_Sms_04(driver);
        e_sms.clickOnEmail_Sms();
        Thread.sleep(5000);

    }
}