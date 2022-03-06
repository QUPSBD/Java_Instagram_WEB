package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_009_Manage_Contact_01 {
    WebDriver driver = null;
    public TC_009_Manage_Contact_01(WebDriver driver){
        this.driver=driver;
    }

    By manage_contact = By.xpath("//a[contains(text(),'Manage Contacts')]");

    public void clickOn_Manage_Contact(){
        driver.findElement(manage_contact).click();
    }

}
