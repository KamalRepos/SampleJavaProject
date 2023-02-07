import org.testng.annotations.Test;

public class GroupingExample {

    @Test(groups = {"smoke"})
    void test1()
    {
        System.out.println("This is test1...");
    }
    @Test(groups = {"Regression"})
    void test2()
    {
        System.out.println("This is test2...");
    }
    @Test(groups = {"smoke"})
    void test3()
    {
        System.out.println("This is test3...");
    }
    @Test(groups = {"smoke"})
    void test4()
    {
        System.out.println("This is test4...");
    }
    @Test(groups = {"smoke","Regression"})
    void test5()
    {
        System.out.println("This is test5...");
    }
    @Test
    void test6()
    {
        System.out.println("This is test6...");
    }
}
