package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_008_CreateNewPost_000 {
    WebDriver driver = null;
    public TC_008_CreateNewPost_000(WebDriver driver){
        this.driver = driver;
    }


    By createPost = By.xpath("//div[@class='XrOey']/div/button/div[1]");
    By upload_file = By.xpath("//button[contains(text(),'Select from computer')]");
   // By nxtBtn = By.xpath("//button[contains(text(),'Next')]");
    By nxtBtn = By.xpath("//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_         _4EzTm                                                                                   XfCBB            g6RW6               ']/button");
    By nxtBtn2 = By.xpath("//button[contains(text(),'Next')]");
    By writeCaption = By.xpath("//textarea[@placeholder='Write a caption...']");
    By share = By.xpath("//button[contains(text(),'Share')]");


    public void clickOnCreatePost(){
        driver.findElement(createPost).click();
    }
    public void clickOnSelectBtn(String text){
        driver.findElement(upload_file).sendKeys(text);
    }
    public void clickOnNxtBtn(){
        driver.findElement(nxtBtn).click();
    }
    public void clickOnNxtBtn2(){
        driver.findElement(nxtBtn2).click();
    }
    public void enterCaption(String text){
        driver.findElement(writeCaption).sendKeys(text);
    }
    public void clickOnShare(){
        driver.findElement(share).click();
    }
}
