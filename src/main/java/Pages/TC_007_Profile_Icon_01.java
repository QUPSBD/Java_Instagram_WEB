package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_007_Profile_Icon_01 {
    WebDriver driver = null;

    public TC_007_Profile_Icon_01(WebDriver driver){
        this.driver = driver;
    }

    By profile_Icon = By.xpath("//span[@class='_2dbep qNELH']/img[1]");
    //By profile = By.xpath("//div[contains(text(),'Profile')]");

    public void clickOnProfile_icon(){
        driver.findElement(profile_Icon).click();
    }

//    public  void clickOnProfile(){
//        driver.findElement(profile).click();
//    }

}
