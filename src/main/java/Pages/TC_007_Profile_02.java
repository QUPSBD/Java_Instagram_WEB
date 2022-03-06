package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class TC_007_Profile_02 {
    WebDriver driver = null;

    public TC_007_Profile_02(WebDriver driver){
        this.driver = driver;
    }

    By profile_Icon = By.xpath("//img[@alt=\"sqa.qups's profile picture\"]");
    By profile = By.xpath("//div[contains(text(),'Profile')]");


    public void clickOnProfile_icon(){
        driver.findElement(profile_Icon).click();
    }

    public  void clickOnProfile(){
        driver.findElement(profile).click();
    }

}
