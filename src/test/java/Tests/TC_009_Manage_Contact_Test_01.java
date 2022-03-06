package Tests;

import Base.DriverSetup;
import Base.FunctionalitiesOfSettings;
import Base.Gmail_Login;
import Pages.TC_003_Login_Gmail_02;
import Pages.TC_007_Profile_Icon_01;
import Pages.TC_007_Settings_004;
import Pages.TC_009_Manage_Contact_01;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_009_Manage_Contact_Test_01 extends DriverSetup {

    @Test
    public void manage_contact_test() throws InterruptedException {
        Gmail_Login access = new Gmail_Login(driver);
        access.signInGmail();

        FunctionalitiesOfSettings p_setting = new FunctionalitiesOfSettings(driver);
        p_setting.profile_setting();

        TC_009_Manage_Contact_01 manage = new TC_009_Manage_Contact_01(driver);
        manage.clickOn_Manage_Contact();
        Thread.sleep(3000);


    }
}
