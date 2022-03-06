package Tests;

import Base.DriverSetup;
import Base.User_Login;
import Pages.TC_003_Login_UserName_01;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_001_Login_UserName_Test_01 extends DriverSetup {

    @Test
    public void Login_Username() throws InterruptedException {
        User_Login  user = new User_Login(driver);
        user.signInUser();
        Thread.sleep(5000);

    }
}
