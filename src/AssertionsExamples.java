import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionsExamples {

    WebDriver driver;

    @BeforeClass
    void setup() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
        Thread.sleep(5000);
    }
    @Test
    void logoTest()
    {
       WebElement Logo =  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/img"));
       Assert.assertTrue(Logo.isDisplayed(),"Logo not displayed on the page");
    }

    @Test
    void PageTitle()
    {
        String title = driver.getTitle();
        Assert.assertEquals("OrangeHRM",title,"Title is not matched");
    }

    @AfterClass
    void tearDown()
    {
        driver.quit();
    }
}
