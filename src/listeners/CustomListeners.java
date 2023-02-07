package listeners;

import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener
{
    //This belongs to ITestListener and will execute before starting of Test set/batch
    public void onStart(ITestContext arg)
    {
        System.out.println("Starts TestSet  Execution....."+arg.getName());
    }

    //This belongs to ITestListener and will execute after completion of Test set/batch
    public void onFinish(ITestContext arg)
    {
        System.out.println("Finish Test Execution....."+arg.getName());
    }

    //This belongs to ITestListener and will execute before main Test start i.e. @Test
    public void onTestStart(ITestResult arg0)
    {
        System.out.println("Start Test Execution....."+arg0.getName());
    }

    //This belongs to ITestListener and will execute before main Test start i.e. @Test
    public void onTestSkipped(ITestResult arg0)
    {
        System.out.println("Skipped Test Execution....."+arg0.getName());
    }

    //This belongs to ITestListener and will execute when test is passed
    public void onTestSuccess(ITestResult arg0)
    {
        System.out.println("Passed Test Execution....."+arg0.getName());
    }

    //This belongs to ITestListener and will execute when test is failed
    public void onTestFailure(ITestResult arg0)
    {
        System.out.println("Failed Test Execution....."+arg0.getName());
    }

    //Not so important .....but should be defined becuase
    //ITestListner is an interface, when using this we should define all its methods even if it is not used in framework
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0)
    {

    }

}
