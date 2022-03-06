package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_003_Login_UserName_01 {
    WebDriver driver = null;

    public TC_003_Login_UserName_01(WebDriver driver){
        this.driver = driver;
    }

    By emailField = By.xpath("//input[@name='username']");
    By password = By.xpath("//input[@name='password']");
    By loginBtn = By.xpath("//div[contains(text(),'Log In')]");
    By saveAlert = By.xpath("//button[contains(text(),'Save Info')]");
    By notification = By.xpath("//button[contains(@class,'aOOlW   HoLwm ')]");
    By asseration = By.xpath("");

    public void enterEmailFiled(String text){
        driver.findElement(emailField).sendKeys(text);
    }

    public void enterPassWord(String text){
        driver.findElement(password).sendKeys(text);
    }

    public void clickLoginBtn(){
        driver.findElement(loginBtn).click();
    }

    public void alertNotify(){
        driver.findElement(saveAlert).click();
    }
    public void checkNotification(){
        driver.findElement(notification).click();
    }

}
