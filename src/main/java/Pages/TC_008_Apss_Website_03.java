package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_008_Apss_Website_03 {
    WebDriver driver = null;

    public TC_008_Apss_Website_03(WebDriver driver){
        this.driver = driver;
    }

    By appsweb = By.xpath("//a[normalize-space()='Apps and Websites']");

    public void clickOnApps_Website(){
        driver.findElement(appsweb).click();
    }
}
