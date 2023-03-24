import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleStoreTest {

    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void initializeBrowser(){
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void enterGoogleStore()  {
        driver.findElement(By.xpath("//a[@class='MV3Tnb'][2]")).click();
        driver.findElement(By.xpath("//a[@class='category-phones_product_link']")).click();
        driver.findElement(By.xpath("//div[@class='mqn2-hgi'][1]")).click();
        driver.findElement(By.xpath("//button[@class='pbO6Nb'][1]")).click();

    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
