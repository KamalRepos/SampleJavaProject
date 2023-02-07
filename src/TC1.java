import org.testng.annotations.*;

public class TC1 {

    @BeforeClass
    void beforeClass()
    {
        System.out.println("This will execute after the class");
    }

    @AfterClass
    void afterClass()
    {
        System.out.println("This will execute after the class");
    }


    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("This will execute before every method");
    }

    @AfterMethod
    void afterMethod()
    {
        System.out.println("This will execute after every test method");
    }

    @Test
    void test1()
    {
        System.out.println("This is test1....");
    }

    @Test
    void test2()
    {
        System.out.println("This is test2...");
    }

    @BeforeTest
    void beforeTest()
    {
        System.out.println("This will execute before the Test");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("This will execute after the Test");
    }
}
