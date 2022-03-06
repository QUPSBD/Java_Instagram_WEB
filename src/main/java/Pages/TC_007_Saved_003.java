package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_007_Saved_003 {
    WebDriver driver = null;

    public TC_007_Saved_003(WebDriver driver){
        this.driver= driver;
    }

    By saved = By.xpath("//div[contains(text(),'Saved')]");
    By collection = By.xpath("//button[normalize-space()='+ New Collection']");
    By w_collection = By.xpath("//input[contains(@placeholder,'Collection Name')]");
    By next = By.xpath("//button[normalize-space()='Next']");
    By done = By.xpath("//button[normalize-space()='Done']");

    public void clickOnSaved(){
        driver.findElement(saved).click();
    }
    public void clickOnCollection(){
        driver.findElement(collection).click();
    }
    public void enter_NewCollection(String text){
        driver.findElement(w_collection).sendKeys(text);
    }
    public void clickOnNextBtn(){
        driver.findElement(next).click();
    }
    public void doneBtn(){
        driver.findElement(done).click();
    }
}
