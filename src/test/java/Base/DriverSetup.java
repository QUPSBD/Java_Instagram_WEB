package Base;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverSetup {
    public static WebDriver driver;
    public String baseUrl = "https://www.instagram.com/";

    @BeforeClass
    public void setUp(){
        //WebDriverManager.chromiumdriver().setup();
        //driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @AfterClass
    public void tearDown(){
        driver.quit();

    }

//     System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
//    driver = new ChromeDriver();
//        driver.get("https://www.flickr.com/");
//        driver.manage().window().maximize();
//    homePage = new HomePage(driver);
}
