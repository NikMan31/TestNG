//GroupTest means you can run @Test as per group

import org.testng.annotations.Test;

public class GroupTest {

    @Test(groups = "Registration")
    public void A(){
        System.out.println("I am A from registration");
    }

    @Test(groups = "Registration")
    public void B(){
        System.out.println("I am B from registration");
    }

    @Test(groups = {"Login", "Registration"})
    public void C(){
        System.out.println("I am C from Login as well as Registration");
    }

    @Test(groups = "Login")
    public void D(){
        System.out.println("I am D from Login");
    }

    @Test(groups = "Login")
    public void E(){
        System.out.println("I am E from Login");
    }

    @Test
    public void F(){
        System.out.println("I am F from Login");
    }

}
