package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_007_SwitchAccount_005 {
    WebDriver driver = null;

    public TC_007_SwitchAccount_005(WebDriver driver){
        this.driver=driver;
    }

    By switch_account =By.xpath("//div[contains(text(),'Switch Accounts')]");
    By dialog = By.xpath("//div[contains(@role,'dialog')]//div[contains(@class,'QBdPU')]//*[name()='svg']");

    public void clickOnSwitch_Account(){
        driver.findElement(switch_account).click();
    }

    public void clickOnDialogBox(){
        driver.findElement(dialog).click();
    }

}
