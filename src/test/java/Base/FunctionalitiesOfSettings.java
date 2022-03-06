package Base;

import Pages.TC_007_Profile_Icon_01;
import Pages.TC_007_Settings_004;
import org.openqa.selenium.WebDriver;

public class FunctionalitiesOfSettings{

    WebDriver driver = null;

    public FunctionalitiesOfSettings(WebDriver driver){
        this.driver=driver;
    }

    public void profile_setting() throws InterruptedException {
        TC_007_Profile_Icon_01 p_icon = new TC_007_Profile_Icon_01(driver);
        p_icon.clickOnProfile_icon();
        Thread.sleep(3000);
        TC_007_Settings_004 t_setting = new TC_007_Settings_004(driver);
        t_setting.clickOnSetting();
        Thread.sleep(3000);
    }

}
