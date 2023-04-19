import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportGeneration {

    @Test
    public void test1(){
        System.out.println("This is Test 1");
    }

    @Test
    public void test2(){
        Reporter.log("Successful run Test 2");
        System.out.println("This is Test 2");
    }

    @Test
    public void test3(){
        System.out.println("This is Test 3");
    }
}
