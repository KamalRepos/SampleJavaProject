import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample
{

    /* This example is to use data provide from another class*/
    @Test(dataProvider = "LoginDataProvider",dataProviderClass = DataProvider_From_Different_Class.class)
    public void loginTest(String email, String pwd)
    {
        System.out.println(email+ "  " +pwd);
    }




/* Below example is to use data provide inside the same class*/

    /*
    @Test(dataProvider = "LoginDataProvider")
    public void loginTest(String email, String pwd)
    {
        System.out.println(email+ "  " +pwd);
    }



    @DataProvider(name="LoginDataProvider")
    public Object[][] getData()
    {
        Object[][] data={{"abc@gmail.com","pwd1"},{"xyz@gmail.com","pwd2"},{"lmn@gmail.com","pwd3"}};
        return data;
    }*/
}
