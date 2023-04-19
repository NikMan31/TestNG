import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class GroupDemo2 {

    @BeforeClass //This annotation will execute before all the annotation including @BeforeTest, @BeforeGroup
    public void beforeClass(){
        System.out.println("I am beforeClass annotation");
    }

    @AfterClass //This annotation will execute after all the annotation including @AfterTest, @AfterGroup
    public void afterClass(){
        System.out.println("Hello, I am afterClass annotation");
    }

    @BeforeGroups(value = "AddToCart")
    public void beforeGroup(){
        System.out.println("Hello, I am from beforeGroup");
    }

    @AfterGroups(value = "AddToCart")
    public void afterGroup(){
        System.out.println("Hello, I am from afterGroup");
    }

    @Test(groups = "AddToCart")
    public void Method1(){
        System.out.println("Hello, I am Method 1");
    }

    @Test(groups = "AddToCart")
    public void Method2(){
        System.out.println("Hello, I am Method 2");
        Assert.fail();  //here I am Manually Failing this class for performing Listerners
    }

    @Test(groups = {"AddToCart","LogOut"})
    public void Method3(){
        System.out.println("Hello, I am Method 3");
        throw new SkipException("I am Skipping this Test because Listerners");
    }

    @Test(groups = "LogOut")
    public void Method4(){
        System.out.println("Hello, I am Method 4");
    }

    @Test(groups = "LogOut")
    public void Method5(){
        System.out.println("Hello, I am Method 5");
    }
}
