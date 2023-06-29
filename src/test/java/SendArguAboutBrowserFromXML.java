//Now You don't need to defined your browser overhere, From XML file parameter will fetch in which browser all activities will be performing.

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SendArguAboutBrowserFromXML {
    public static WebDriver driver;

    @Parameters({ "browser" })
    @Test
    public void LoginToSauceLab(String browser){

        if (browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
        }
        else if (browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
            driver.get("https://www.saucedemo.com/");

        } else if (browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
            driver.get("https://www.saucedemo.com/");
        }
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
}
