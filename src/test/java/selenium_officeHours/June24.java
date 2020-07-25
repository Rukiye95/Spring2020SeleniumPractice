package selenium_officeHours;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class June24 {


    WebDriver driver;
    SoftAssert softAssert;
    
    public void classSetUp(){
        System.out.println("Some class setup");
    }



    @BeforeMethod //make more organized
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();//to open chrome browser for test
    }




    @Test
    public void test(){
        driver.get("http://google.com");
        Assert.assertEquals(driver.getTitle(),"Google");
        softAssert.assertEquals(driver.getTitle(),"Google23");
        softAssert.assertEquals(driver.getTitle(),"Google21");
        softAssert.assertEquals(driver.getTitle(),"Google1245");
        System.out.println("Page title :: "+driver.getTitle());
    }



    @Test(description="Test for Amazon")
    public void amazonTest(){
        driver.get("http://amazon.com");
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
        softAssert.assertEquals(driver.getTitle(),"Amazon");
    }



    @AfterMethod
    public void tearDOwn(){
        softAssert.assertAll();//regardless on miss matching assertion,test execution will continue until this point
        driver.quit();
    }
}
