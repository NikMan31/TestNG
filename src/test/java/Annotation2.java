import org.testng.annotations.*;

public class Annotation2 {

    @BeforeTest //@BeforeTest execute before all the Test annotation means only execute once before all the @Test
    public void Login(){
        System.out.println("Successfully login");
    }

    @BeforeMethod //@BeforeMethod will execute before each and every @Test
    public void DBConnection(){
        System.out.println("Successfully connection with DB");
    }

    @AfterMethod //@AfterMethod will execute each and every @Test
    public void DBdisconnection(){
        System.out.println("Successfully disconnected from DB");
    }

    //There is one more importanant annotation is enable means you keep enable=true then that testcase will run but if you keep enable=flase then that test will skipped
    @AfterTest //@AfterTest execute after all the@Test means It will work only once after all the @Test
    public  void Logout(){
        System.out.println("Successfully logout");
    }

    @Test //This normal @Test
    public void AddToBasket(){
        System.out.println("Successfully add into basket");
    }
}
