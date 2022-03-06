package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TC_006_SearchBox {
    WebDriver driver = null;

    public TC_006_SearchBox(WebDriver driver){
        this.driver = driver;
    }

    By search = By.xpath("//input[@placeholder='Search']");
    By search1 = By.xpath("//body/div[@id='react-root']/section[1]/nav[1]/div[2]/div[1]/div[1]/div[2]/input[1]");

    public void searchBar(String text){
        driver.findElement(search).sendKeys(text);
    }
    public void searchBar1 (){
        driver.findElement(search1).sendKeys(Keys.ENTER);
    }
}
