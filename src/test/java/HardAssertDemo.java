//Need of Soft assert is, For example, you define multiple assert in the @Test, and among them If one assertion got failed then rest of program is not going to be execute means uts Hardassert
//And When we apply soft assert at that time if 1st assertion got failed it doesn't matter though rest of all assertion will be executed
//In this example, if title assert is not execute then another assert is not goint to be execute

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

public class HardAssertDemo {
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
    public void test(){
        String expectedString="Electronics, Cars, Fashion, Collectibles & More | eBay";
        String expectedTest="Search";
        String actualString=driver.getTitle();
        String actualText=driver.findElement(By.id("gh-btn")).getAttribute("value");

        System.out.println("Verifying Title");
        Assert.assertEquals(expectedString, actualString);
        System.out.println("Verified title");

        System.out.println("Verifying Text");
        Assert.assertEquals(expectedTest, actualText);
        System.out.println("Verified Text");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
