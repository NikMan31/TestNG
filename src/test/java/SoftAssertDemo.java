//For SoftAssert you need to make object for SoftAssert class object

//If any error occur then, SoftAssert will demonstrate difference whatever it is

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class SoftAssertDemo {

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
    public void SoftAssertdemo(){
        SoftAssert softAssert=new SoftAssert();
        String expectedString="Electronics, Cars, Fashion, Collectibles & More | eBay";
        String expectedTest="Search";
        String actualString=driver.getTitle();
        String actualText=driver.findElement(By.id("gh-btn")).getAttribute("value");

        System.out.println("Verifying Title");
        softAssert.assertEquals(expectedString, actualString); //Here instead of Assert, you need to use object of SoftAssert class
        System.out.println("Verified title");

        System.out.println("Verifying Text");
        softAssert.assertEquals(expectedTest, actualText); //Same here
        System.out.println("Verified Text");

        softAssert.assertAll(); //Need to use this line as well
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
