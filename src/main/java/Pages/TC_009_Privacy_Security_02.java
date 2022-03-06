package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_009_Privacy_Security_02 {
    WebDriver driver = null;

    public TC_009_Privacy_Security_02(WebDriver driver){
        this.driver= driver;
    }

    By security_privacy = By.xpath("//a[contains(text(),'Privacy and Security')]");
    By privateAccount = By.xpath("//div[@id='accountPrivacy']/label/div");
    By privacyAcc_notification = By.xpath("//button[contains(text(),'Okay')]");
    By activity_status = By.xpath("//div[@id='activityStatus']/label/div[1]");
    By allow_sharing = By.xpath("//div[@id='feedPostReshareDisabled']/label/div[1]");
    By comment = By.xpath("//a[contains(text(),'Edit Comment Settings')]");
    //By cmnt_write =By.xpath("//textarea[@class='P5eiA']");
    By cmnt_write = By.xpath("//body/div[@id='react-root']/section[1]/main[1]/div[1]/article[1]/div[1]/form[1]/textarea[1]");
    By submitBtn = By.xpath("//button[contains(text(),'Submit')]");

    public void  clickOn_Security_Privacy(){
        driver.findElement(security_privacy).click();
    }
    public void clickOn_Private_Account(){
        driver.findElement(privateAccount).click();
    }
    public void clickOnPrivacy_Notification(){
        driver.findElement(privacyAcc_notification).click();
    }
    public void clickOn_Activity_Status(){
        driver.findElement(activity_status).click();
    }
    public void clickOn_Allow_Sharing(){
        driver.findElement(allow_sharing).click();
    }
    public void clickOn_Comment(){
        driver.findElement(comment).click();
    }
    public void enter_Comment(String text){
        driver.findElement(cmnt_write).sendKeys(text);
    }
    public void clickOn_SubmitBtn(){
        driver.findElement(submitBtn).click();
    }
}
