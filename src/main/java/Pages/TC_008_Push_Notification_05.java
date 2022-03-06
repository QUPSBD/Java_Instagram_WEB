package Pages;

import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_008_Push_Notification_05 {
    WebDriver driver = null;

    public TC_008_Push_Notification_05(WebDriver driver){
        this.driver=driver;
    }
    By notification = By.xpath("//a[normalize-space()='Push Notifications']");
    By likes_radioBtn = By.xpath("//input[@id='igCoreRadioButtonlikes2']");
    By cmt_radioBtn = By.xpath("//input[@id='igCoreRadioButtoncomments2']");
    By cmntLike = By.xpath("//input[@id='igCoreRadioButtoncomment_likes1']");
    By like_cmnt_photo = By.xpath("//input[@id='igCoreRadioButtonlike_and_comment_on_photo_user_tagged3']");
    By acceptAllow = By.xpath("//input[@id='igCoreRadioButtonfollow_request_accepted1']");
    By insDirReq = By.xpath("//input[@id='igCoreRadioButtonpending_direct_share1']");
    By live_video = By.xpath("//input[@id='igCoreRadioButtonlive_broadcast1']");

    public void clickOnPush_Notification(){
        driver.findElement(notification).click();
    }
    public void clickOn_Like_RadioBtn(){
        driver.findElement(likes_radioBtn).click();
    }
    public void clickOn_Cmnt_RadioBtn(){
        driver.findElement(cmt_radioBtn).click();
    }
    public void clickOn_CmntLike_RadioBtn(){
        driver.findElement(cmntLike).click();
    }
    public void clickOn_like_cmnt_photo(){
        driver.findElement(like_cmnt_photo).click();
    }
    public void clickOn_AcceptAllow(){
        driver.findElement(acceptAllow).click();
    }
    public void clickOn_InstaDirect_Request(){
        driver.findElement(insDirReq).click();
    }
    public void clickOn_Live_Video(){
        driver.findElement(live_video).click();
    }
}
