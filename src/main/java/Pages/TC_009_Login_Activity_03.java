package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_009_Login_Activity_03 {

    WebDriver driver = null;

    public TC_009_Login_Activity_03(WebDriver driver){
        this.driver=driver;
    }
    By loginActivity = By.xpath("//a[contains(text(),'Login Activity')]");

    public void clickOnLoginActivity(){
        driver.findElement(loginActivity).click();
    }
}
