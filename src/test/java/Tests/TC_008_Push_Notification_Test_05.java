package Tests;

import Base.DriverSetup;
import Base.FunctionalitiesOfSettings;
import Base.Gmail_Login;
import Pages.TC_008_Push_Notification_05;
import org.testng.annotations.Test;

public class TC_008_Push_Notification_Test_05 extends DriverSetup {

    @Test
    public void push_Notification_test() throws InterruptedException {
        Gmail_Login access = new Gmail_Login(driver);
        access.signInGmail();

        FunctionalitiesOfSettings p_setting =  new FunctionalitiesOfSettings(driver);
        p_setting.profile_setting();

        TC_008_Push_Notification_05 notify = new TC_008_Push_Notification_05(driver);
        notify.clickOnPush_Notification();
        Thread.sleep(3000);
        notify.clickOn_Like_RadioBtn();
        Thread.sleep(3000);
        notify.clickOn_Cmnt_RadioBtn();
        Thread.sleep(3000);
        notify.clickOn_like_cmnt_photo();
        Thread.sleep(3000);
        notify.clickOn_AcceptAllow();
        Thread.sleep(3000);
        notify.clickOn_InstaDirect_Request();
        Thread.sleep(3000);
        notify.clickOn_Live_Video();
        Thread.sleep(3000);

    }
}
