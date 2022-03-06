package Tests;

import Base.DriverSetup;
import Base.FunctionalitiesOfSettings;
import Base.Gmail_Login;
import Pages.TC_007_Settings_004;
import Pages.TC_009_Privacy_Security_02;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_009_Privacy_Security_Test_02 extends DriverSetup {

    @Test
    public void privacy_Security_test() throws InterruptedException {
        Gmail_Login access = new Gmail_Login(driver);
        access.signInGmail();

        FunctionalitiesOfSettings p_setting = new FunctionalitiesOfSettings(driver);
        p_setting.profile_setting();

        TC_007_Settings_004 t_setting = new TC_007_Settings_004(driver);
        t_setting.asserationMethod();

        TC_009_Privacy_Security_02 p_security = new TC_009_Privacy_Security_02(driver);
        p_security.clickOn_Security_Privacy();
        Thread.sleep(3000);
        p_security.clickOn_Private_Account();
        Thread.sleep(3000);
        p_security.clickOnPrivacy_Notification();
        Thread.sleep(3000);
        p_security.clickOn_Activity_Status();
        Thread.sleep(3000);
        p_security.clickOn_Allow_Sharing();
        Thread.sleep(3000);
        p_security.clickOn_Comment();
        Thread.sleep(10000);
        p_security.enter_Comment("Software Quality Testing");
        Thread.sleep(7000);
        p_security.clickOn_SubmitBtn();
        Thread.sleep(10000);





    }
}
