package ScreenShotInTestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class LaunchWebsite {
    public static WebDriver driver = null;
    @BeforeTest
    public void openBrowser(){
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
        driver.get("https://www.ebay.com/");
    }
    @Test
    public void test() {
        Actions actions=new Actions(driver);
        WebElement homeAndGarden=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a"));
        homeAndGarden.click();

    }
    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
