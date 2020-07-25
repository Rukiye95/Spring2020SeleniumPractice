package Test.Exercise;
//DONE
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TC16 {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
    }


    @Test
    public void ex1(){
       Select dropdown1=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
       String actuald1=dropdown1.getFirstSelectedOption().getText();
       String expectedd1="Please select an option";
        Assert.assertEquals(actuald1,expectedd1);


        Select dropdown2=new Select(driver.findElement(By.xpath("//select[@id='state']")));
      String actuald2=dropdown2.getFirstSelectedOption().getText();
        String expectedd2="Select a State";
        Assert.assertTrue(actuald2.contains(expectedd2));
    }

    @Test
    public void  ex2()throws  InterruptedException{
        Select dropdown5=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        Thread.sleep(3000);
        dropdown5.selectByVisibleText("Kansas");
        Thread.sleep(3000);
        dropdown5.selectByValue("HI");
        Thread.sleep(3000);
        dropdown5.selectByIndex(2);

    }
}
