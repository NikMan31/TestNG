import org.testng.annotations.Test;

public class DataProvider {

    @Test(dataProvider = "DataSets")
    public void LoginPage(String Username, String Password){
        System.out.println("Username " + Username + " " + "Password " + Password );
    }
    @org.testng.annotations.DataProvider  //Here, Directly you can use DataProvider annotation
    public Object[][] DataSets(){
        Object[][] dataset= new Object[4][2]; //Here its 4 rows and 2 columns and I am using Object class from Java

        dataset[0][0]="Username";
        dataset[0][1]="Password";

        dataset[1][0]="Nikunj";
        dataset[1][1]="Nikunj123";

        dataset[2][0]="Mayuri";
        dataset[2][1]="Mayuri123";

        dataset[3][0]="MayuNiku";
        dataset[3][1]="MayuNiku123";

        return dataset;
    }
}
