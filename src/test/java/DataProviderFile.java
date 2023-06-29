import org.testng.annotations.DataProvider;

public class DataProviderFile {
    @DataProvider
    public Object[][] DataSets1(){
        return new Object[][]{{"Username", "Lastname", "Password"},
                {"Nikunj","Maniya", "Nikunj123"},
                {"Mayuri", "Kachhadiya", "Mayuri123"},
                {"MayuNiku", "Maniya", "MayuNiku123"}};
    }
}
