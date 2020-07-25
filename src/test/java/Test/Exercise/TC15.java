package Test.Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;
//Did not give assert result
public class TC15 {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com ");
    }

    @Test
    public void apple(){
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);
        String expectedTitle="apple - Google Search";
        String actualTitle=driver.getTitle();

         Assert.assertTrue(actualTitle.toLowerCase().contains(expectedTitle.toLowerCase()));
    }
}
