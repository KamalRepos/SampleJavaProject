import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {

    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    void setup(String browser, String WebURL)
    {
        if(browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "C:\\ChromeDriver\\chromedriver.exe");
            driver = new FirefoxDriver();
        }
        driver.get(WebURL);
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
