package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_009_Email_Insta_04 {
    WebDriver driver = null;

    public TC_009_Email_Insta_04(WebDriver driver){
        this.driver= driver;
    }

    By emaiL_insta = By.xpath("//a[contains(text(),'Emails from Instagram')]");
    By other_tab = By.xpath("//span[contains(text(),'Other')]");
    By security_tab = By.xpath("//span[contains(text(),'Security')]");

    public void clickOn_Email_Insta(){
        driver.findElement(emaiL_insta).click();
    }
    public void clickOnOhter(){
        driver.findElement(other_tab).click();
    }
    public void clickOnSecurity(){
        driver.findElement(security_tab).click();
    }
}
