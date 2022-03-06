package Base;

import Pages.TC_003_Login_UserName_01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class User_Login extends DriverSetup{
    WebDriver driver = null;

    public User_Login(WebDriver driver){
        this.driver=driver;
    }

    public void signInUser() throws InterruptedException {

        driver.get(baseUrl);
        new WebDriverWait(driver, Duration.ofSeconds(2));
        driver.manage().window().maximize();
        Thread.sleep(3000);

        TC_003_Login_UserName_01 user_login =  new TC_003_Login_UserName_01(driver);
        user_login.enterEmailFiled("sqa.qups");
        Thread.sleep(3000);
        user_login.enterPassWord("Qups@1234");
        Thread.sleep(3000);
        user_login.clickLoginBtn();
        Thread.sleep(5000);
        user_login.alertNotify();
        Thread.sleep(15000);
        user_login.checkNotification();
        Thread.sleep(15000);

    }
}
