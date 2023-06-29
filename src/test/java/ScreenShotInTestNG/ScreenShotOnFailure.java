package ScreenShotInTestNG;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenShotOnFailure extends LaunchWebsite{

    public void SSOnFailure() throws IOException {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(".//ScreenShotInTestNG/Screenshot/ss.png"));

    }
}
