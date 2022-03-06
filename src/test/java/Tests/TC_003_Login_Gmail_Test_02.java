package Tests;

import Base.DriverSetup;
import Base.Gmail_Login;
import org.testng.annotations.Test;


public class TC_003_Login_Gmail_Test_02 extends DriverSetup {

    @Test
    public void Login_Gmail() throws InterruptedException {
        Gmail_Login access = new Gmail_Login(driver);
        access.signInGmail();
        Thread.sleep(5000);

        //Notification Alert start from here
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-notifications");
//        driver = new ChromeDriver(options);
        //signUp.asserationMethod();

    }
}
