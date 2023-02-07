import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {
    @Test
    void startCar()
    {
        System.out.println("Car started");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar()
    {
        System.out.println("Drive Car");
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar()
    {
        System.out.println("Stop Car");
    }

    @Test(dependsOnMethods = {"stopCar","driveCar"},alwaysRun = true)
    void parkCar()
    {
        System.out.println("Park Car");
    }
}
