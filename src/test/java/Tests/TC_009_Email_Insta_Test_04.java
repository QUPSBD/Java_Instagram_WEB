package Tests;

import Base.DriverSetup;
import Base.FunctionalitiesOfSettings;
import Base.Gmail_Login;
import Pages.TC_009_Email_Insta_04;
import org.testng.annotations.Test;

public class TC_009_Email_Insta_Test_04 extends DriverSetup {

    @Test
    public void email_Insatagram_test() throws InterruptedException {
        Gmail_Login access = new Gmail_Login(driver);
        access.signInGmail();

        FunctionalitiesOfSettings p_setting =  new FunctionalitiesOfSettings(driver);
        p_setting.profile_setting();

        TC_009_Email_Insta_04 email_Insta = new TC_009_Email_Insta_04(driver);
        email_Insta.clickOn_Email_Insta();
        Thread.sleep(3000);
        email_Insta.clickOnOhter();
        Thread.sleep(3000);
        email_Insta.clickOnSecurity();
        Thread.sleep(5000);

    }
}
