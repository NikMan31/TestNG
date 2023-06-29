import org.testng.annotations.Test;

//In, TestNG there are 2 of the helper annotation enabled and timeout
public class HelperAnnotation {


    @Test(enabled = false) //This test case will be skipped
    public void funtion1(){
        System.out.println("Hello, This is function 1 and use helper annotation so it will be skipped");
    }

    @Test(timeOut = 5000)  //This timeOut means bcz of some failure aa test case 5 second wait karshe and 5 sec maa kaay barabar naay thay to testcase fail thase
    public void function2(){
        System.out.println("Hello, This is function 2");
    }

    @Test
    public void function3(){
        System.out.println("Hello, This is function 3");
    }

    @Test
    public void function4(){
        System.out.println("Hello, This is function 4");
    }
}
