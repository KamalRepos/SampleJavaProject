import org.testng.annotations.DataProvider;

public class DataProvider_From_Different_Class
{

    @DataProvider(name="LoginDataProvider")
    public Object[][] getData()
    {
        Object[][] data={{"abc@gmail.com","pwd1"},{"xyz@gmail.com","pwd2"},{"lmn@gmail.com","pwd3"}};
        return data;
    }
}
