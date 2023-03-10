package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest2
{
    WebDriver driver;

    @Test
    void loginTest() throws InterruptedException
    {
        System.setProperty("webdriver.chrom.driver","C:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com");

        Thread.sleep(5000);

       driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
       driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
       driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

       Assert.assertEquals(driver.getTitle(),"OrangeHRM");
        Thread.sleep(5000);
    }

   /* @Test
    void homepageTitle() throws InterruptedException
    {
        System.setProperty("webdriver.chrom.driver","C:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com");

        String title = driver.getTitle();
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }*/

    @AfterMethod
    void tearDown()
    {
        driver.quit();
    }


}
