//There are 3 ways to skipping test
        // - Pass parameter as to the @Test (enabled=false)
        // - throw SkipException("")
        // - By Condition

import org.testng.SkipException;
import org.testng.annotations.Test;
public class SkipTest {
    boolean datasetup= false;

    @Test(enabled = false)
    public void skipClass1()
    {
        System.out.println("I am skipping becuase of enabled=False");
    }

    @Test
    public void skipClass2()
    {
        System.out.println("I am skipping forcefully means by using exception");
        throw new SkipException("skipping this exception");
    }

    @Test
    public void skipClass3()
    {
        System.out.println("I am skipping because of defined class");
        if (datasetup==true){
            System.out.println("I am executing becuase datasetup is ready");
        }
        else {
            System.out.println("I am skipping because of exception");
            throw new SkipException("Datasetup is not ready");


        }
    }
}
