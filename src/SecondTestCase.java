import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 1)
    void setup() {
        System.out.println("This is setup test");
    }

    @Test(priority = 2)
    void searchCustomer() {
        System.out.println("This is searchCustomer test");
        Assert.assertEquals(1,1);
    }

    @Test(priority = 4)
    void teardown() {
        System.out.println("closing browser");
    }

    @Test(priority = 3)
    void addCustomer() {
        System.out.println("This is addCustomer test");
    }


}
