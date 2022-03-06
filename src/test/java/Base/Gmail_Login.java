package Base;

import Pages.TC_003_Login_Gmail_02;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Gmail_Login extends DriverSetup{
    WebDriver driver = null;

    public Gmail_Login(WebDriver driver){
        this.driver=driver;
    }
    public void signInGmail() throws InterruptedException {
        driver.get(baseUrl);
        new WebDriverWait(driver, Duration.ofSeconds(2));
        driver.manage().window().maximize();
        Thread.sleep(3000);

        TC_003_Login_Gmail_02 gmail_login = new TC_003_Login_Gmail_02(driver);
        gmail_login.enterEmailFiled("sqa.qups@gmail.com");
        Thread.sleep(3000);
        gmail_login.enterPassWord("Qups@1234");
        Thread.sleep(3000);
        gmail_login.clickLoginBtn();
        Thread.sleep(5000);
        gmail_login.alertNotify();
        Thread.sleep(5000);
        gmail_login.checkNotification();
        Thread.sleep(5000);


    }
}
