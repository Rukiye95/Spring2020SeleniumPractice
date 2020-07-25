package Test.Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SmartBearUtilities;
import utilities.WebDriverFactory;

public class P2 {
    // TC #1: Smartbear software link verification
    // 1.Open browser
    // 2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtilities.login(driver);
    }

    @Test
    public void p1(){
       WebElement name= driver.findElement(By.xpath("//table[@class='SampleTable']//tr/td[3]"));
       System.out.println(name.getText());

       WebElement name2=driver.findElement(By.xpath("//table[@class='SampleTable']//tr[5]/td[9]"));
        System.out.println(name2.getText());
    }


}
