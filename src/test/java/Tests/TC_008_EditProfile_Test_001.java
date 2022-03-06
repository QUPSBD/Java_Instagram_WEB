package Tests;

import Base.DriverSetup;
import Base.Gmail_Login;
import Pages.TC_007_Profile_02;
import Pages.TC_008_EditProfile_01;
import org.testng.annotations.Test;

public class TC_008_EditProfile_Test_001 extends DriverSetup {

    @Test
    public void edit_Profile_test() throws InterruptedException {
        Gmail_Login access = new Gmail_Login(driver);
        access.signInGmail();

        TC_007_Profile_02 p = new TC_007_Profile_02(driver);
        p.clickOnProfile_icon();
        Thread.sleep(5000);
        p.clickOnProfile();
        Thread.sleep(5000);
        TC_008_EditProfile_01 eProfile = new TC_008_EditProfile_01(driver);
        eProfile.clickOnEditProfile();
        //Thread.sleep(5000);
        //eProfile.clickOnUploadPhoto();
       // eProfile.changeOnProfilePicture("C:\\Users\\zahan\\Documents\\Animee.jpg");
        Thread.sleep(10000);


    }
}
