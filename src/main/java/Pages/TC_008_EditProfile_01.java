package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_008_EditProfile_01 {
    WebDriver driver = null;

    public TC_008_EditProfile_01(WebDriver driver){
        this.driver = driver;
    }

    By edit_profile = By.xpath("//a[contains(text(),'Edit Profile')]");
    By profile_change = By.xpath("//button[contains(text(),'Change Profile Photo')]");
    By upload_photo = By.xpath("//button[contains(text(),'Upload Photo')]");

    public void clickOnEditProfile(){
        driver.findElement(edit_profile).click();
    }

    public void changeOnProfilePicture(String text){
        driver.findElement(profile_change).sendKeys(text);
    }

    public void clickOnUploadPhoto(){
        driver.findElement(upload_photo).click();
    }
}
