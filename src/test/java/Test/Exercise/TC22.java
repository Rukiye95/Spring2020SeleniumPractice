package Test.Exercise;
//DONE

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TC22 {
   // TC#7: Cybertek “month”dropdown default value1.Open browser
     //   2.Go to website: http://practice.cybertekschool.com/dropdowns
    // 3.Verify default value is always showing the current montho
    // Expected: If currently in June, should show June selected.
    // TC#8: Cybertek “month”dropdown list of default values verification
    // 1.Do both verifications in the same test
    // 2.Verify list of months are correct as expected.o
    // Expected: Options should contain all 12 months of the year.

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
       driver= WebDriverFactory.getDriver("chrome");
       driver.get("http://practice.cybertekschool.com/dropdown");

    }


    @Test
    public void t2(){
Select monthDropdowns=new Select(driver.findElement(By.xpath("//select[@id='month']")));
String actualDropdown=monthDropdowns.getFirstSelectedOption().getText();
        System.out.println("Expected dropdown "+actualDropdown);
String expectedDropdown= LocalDateTime.now().getMonth().name();
        System.out.println("Actual dropdown "+expectedDropdown);

        Assert.assertEquals(expectedDropdown.toLowerCase(),actualDropdown.toLowerCase());



        List<String>monthActualList= Arrays.asList("January", "February", "March", "April", "May", "June", "July"
                , "August", "September", "October", "November", "December");

       List<WebElement>actualMonthList=monthDropdowns.getOptions();

       List<String>monthText=new ArrayList<>();





    }





}
