import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class AssertionDemo {

    public static WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.ebay.co.uk/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        WebElement cookieBtn=driver.findElement(By.xpath("//button[text()=\"Accept all\"]"));
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
    }

    @Test
    public void assertion(){
        String expectedString="Electronics, Cars, Fashion, Collectibles & More | eBay";
        String actualString=driver.getTitle();
        Assert.assertEquals(expectedString, actualString); //Here, you don't need to make object for Assert class... you can use directly
    }

    @AfterTest
    public void teatDown(){
        driver.quit();
    }
}
