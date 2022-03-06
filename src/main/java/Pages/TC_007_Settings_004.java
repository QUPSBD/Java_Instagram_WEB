package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;

public class TC_007_Settings_004 {
    WebDriver driver = null;

    public TC_007_Settings_004(WebDriver driver) {
        this.driver = driver;
    }

    By setting = By.xpath("//div[contains(text(),'Settings')]");
    By assertion_name = By.xpath("//h1[normalize-space()='sqa.qups']");

    public void clickOnSetting() {
        driver.findElement(setting).click();
    }

    public void asserationMethod() {
        String actual = "sqa.qups";
        String expected = driver.findElement(assertion_name).getText();
        assertEquals(expected, actual);
        System.out.println("Profile Username:" + expected);
    }
}
