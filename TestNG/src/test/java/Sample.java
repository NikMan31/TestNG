//While using TestNG and when Import all the annotation, those all annotation should be imported from TestNg not from jUnit

import org.testng.annotations.Test;
public class Sample {

    @Test(priority = 3, description =    "I am third") //This will execute at the last //Description means message
    public void justSample(){
        System.out.println("This is only sample for TestNg");
    }

    @Test(priority = 1, description = "I am first") //This will execute at the first
    public void justSample2(){
        System.out.println("This is only for 2nd example");
    }

    @Test(priority = 2, description = "I am second") //This will execute at the second
    public void justExample3(){
        System.out.println("This is for only 3rd example");
    }
}
