import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class googleSearchTest {

    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void browserInitialization(){
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void googleTextBoxSearch(){
        WebElement m = driver.findElement(By.name("q"));
        m.sendKeys("Cnbc Office Address");
        m.sendKeys(Keys.ENTER);
        driver.navigate().back();

       m.sendKeys("Apple headquarter Address");
       m.sendKeys(Keys.ENTER);
       driver.navigate().back();

       m.sendKeys("Elon Mask's age");
       m.sendKeys(Keys.ENTER);

    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
