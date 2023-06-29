package ScreenShotInTestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listerners extends ScreenShotOnFailure implements ITestListener {
    public void onTestStart(ITestResult result){
        System.out.println("This is from ListersDemo and for all starting case");
    }
    public void onTestSuccess(ITestResult result){

    }
    public void onTestFailure(ITestResult result){
        System.out.println("Due to failure I am taking Screen shots");
        try {
            SSOnFailure();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void onTestSkipped(ITestResult result){
        System.out.println("Here, I am skipping that test beacuse of Incomplete");
    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult result){

    }


}
