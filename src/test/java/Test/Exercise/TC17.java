package Test.Exercise;
//DONE
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TC17 {

    WebDriver driver;
    @BeforeMethod

    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void ex1() {
        //Select “December 1 , 1921” and verify it is selected.
        //   Select year using : visible text
        Select yearDropdown=new Select(driver.findElement(By.xpath("//select[@id='year']")));
        yearDropdown.selectByVisibleText("1921");
        String yearExpected="1921";
        String yearActual=yearDropdown.getFirstSelectedOption().getText();

        Assert.assertTrue(yearActual.contains(yearExpected));


        Select monthDropdown=new Select(driver.findElement(By.xpath("//select[@id='month']")));
        monthDropdown.selectByIndex(11);
        String monthExpected="December";
        String monthActual=monthDropdown.getFirstSelectedOption().getText();


        Select dayDropdown=new Select(driver.findElement(By.xpath("//select[@id='day']")));
        dayDropdown.selectByValue("1");
        String dayActual=dayDropdown.getFirstSelectedOption().getText();
        String dayExpected="1";
        Assert.assertEquals(dayActual,dayExpected);


    }

}
