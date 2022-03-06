package Tests;

import Base.DriverSetup;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class TC_001_HomePage_Test_001 extends DriverSetup {

    @Test
    public void openBrowser() throws InterruptedException {
        driver.get(baseUrl);
        new WebDriverWait(driver, Duration.ofSeconds(2));
        driver.manage().window().maximize();
        Thread.sleep(5000);

        String actualTitle = "Instagram";
        String siteTitle = driver.getTitle();
        Assert.assertEquals(siteTitle, actualTitle);
        System.out.println("Title:" + siteTitle);

    }
}
