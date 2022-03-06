package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_008_ChangePassword_02 {
    WebDriver driver = null;
    public TC_008_ChangePassword_02(WebDriver driver){
        this.driver = driver;
    }

    By changePsw = By.xpath("//a[normalize-space()='Change Password']");
    By oldPsw = By.xpath("//input[@id='cppOldPassword']");
    By newPsw = By.xpath("//input[@id='cppNewPassword']");
    By cnfrmPsw = By.xpath("//input[@id='cppConfirmPassword']");
    By changePasswordBtn = By.xpath("//button[normalize-space()='Change Password']");

    public void clickOnChangePsw() {
        driver.findElement(changePsw).click();
    }
    public void enterOldPsw(String text){
        driver.findElement(oldPsw).sendKeys(text);
    }
    public void enterNewPsw(String text){
        driver.findElement(newPsw).sendKeys(text);
    }
    public void enterCnfrmPsw(String text){
        driver.findElement(cnfrmPsw).sendKeys(text);
    }
    public void chnagePasswordBtn(){
        driver.findElement(changePasswordBtn).click();
    }
}
