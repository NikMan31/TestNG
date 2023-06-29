import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {

    @Test(dataProvider = "DataSets1", dataProviderClass = DataProviderFile.class)  //Here, dataProviderClass is attribute by using, you can access that file which consist DataProvider
    public void LoginPage(String username, String lastname, String password){
        System.out.println(username+" "+lastname+ " " +password);
    }
}
