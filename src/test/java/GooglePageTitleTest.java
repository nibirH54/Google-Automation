import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GooglePageTitleTest {

    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void browserInitialization(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void verifyGoogleTitle(){
        String googleTitle = driver.getTitle();
        System.out.println("The page title for google is :" + googleTitle);
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
