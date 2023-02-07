package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest1
{
    WebDriver driver;

    @Test
    void logoTest() throws InterruptedException
    {
        System.setProperty("webdriver.chrom.driver","C:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com");
        Thread.sleep(5000);
        WebElement logo= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]"));
        Assert.assertTrue(logo.isDisplayed());
        Thread.sleep(5000);
    }

    @Test
    void homepageTitle() throws InterruptedException
    {
        System.setProperty("webdriver.chrom.driver","C:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com");

        String title = driver.getTitle();
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }

    @AfterMethod
    void tearDown()
    {
        driver.quit();
    }


}
