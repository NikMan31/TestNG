//:isterners means, Aya tame avo calss defined karo cho with method, aa method particular action aa execute thase
//Ex, AA Class ma onTestStart() method che aa jyare game te class na @Test execute thase atle pella aa run thase
//Ex, Me aa ListernsDemo ne GroupDemo2 sathe configure karya (TestNgXMLForListerners) ma, means when each @test from GroupDemo2 will be execute before that This's Listerners Class OntestStart will run
// Same like that, From GroupDemo2 any @Test will be failed at that time Listerner's Class @onTestFailure will be execute


import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernsDemo implements ITestListener {

    public void onTestStart(ITestResult result){
        System.out.println("This is from ListersDemo and for all starting case");
    }
    public void onTestSuccess(ITestResult result){

    }
    public void onTestFailure(ITestResult result){
        System.out.println("Due to failure I am taking Screen shots");

    }
    public void onTestSkipped(ITestResult result){
        System.out.println("Here, I am skipping that test beacuse of Incomplete");

    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult result){

    }

}
