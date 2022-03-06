package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_008_Email_Sms_04 {
    WebDriver driver = null;

    public TC_008_Email_Sms_04(WebDriver driver){
        this.driver=driver;
    }

    By email_sms = By.xpath("//a[normalize-space()='Email and SMS']");

    public void clickOnEmail_Sms(){
        driver.findElement(email_sms).click();
    }
}
