package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_009_Help_05 {
    WebDriver driver = null;

    public TC_009_Help_05(WebDriver driver){
        this.driver=driver;
    }
    By help = By.xpath("//a[contains(text(),'Help')]");

    public void clickOnHelp(){
        driver.findElement(help).click();
    }
}
