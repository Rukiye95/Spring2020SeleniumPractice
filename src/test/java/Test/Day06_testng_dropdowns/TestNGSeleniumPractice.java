package Test.Day06_testng_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TestNGSeleniumPractice {

    WebDriver driver;

@BeforeMethod
    public void setUp(){
        //GOAL is to open new browser for each test
        //what annotation i should be using for this?BeforeMethod or BeforeClass
    driver= WebDriverFactory.getDriver("chrome");
    driver.get("https://www.google.com ");
    }


    @AfterMethod
    public void tearDown()throws InterruptedException{
    //5-close browser
    Thread.sleep(2000);
    driver.close();

    }



    @Test(priority = 2)
    public void google_title_test(){
        //1.Go to : https://www.google.com


        //2.Verify title:Google
        String expectedTitle="Google";
        String actualTitle=driver.getTitle();
        //The line where we do assertion
        // If you use assertTrue,argument you are passing is supposed to be returning boolean
        Assert.assertTrue(actualTitle.equals(expectedTitle));

        //if you are using assertEquals
        //you need to pass two argument of the same type
        Assert.assertEquals(actualTitle,expectedTitle);

    }



    @Test(priority = 1)
public void google_search_title_verification() throws  InterruptedException{
        //1.open browser
        //2.go to https://google.com

        //3.search "apple"
        WebElement appleSearchBOx=driver.findElement(By.name("q"));
        appleSearchBOx.sendKeys("apple"+ Keys.ENTER);
        //4.verify title contains "apple"
        String expectedInTitle="apple";
        String actualTitle=driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));

}

}
