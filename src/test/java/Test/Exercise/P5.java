package Test.Exercise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class P5 {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void t1(){
        //TC #1: Information alert practice1.Open browser
        //   2.Go to website: http://practice.cybertekschool.com/javascript_alerts
        // 3.Click to “Click for JS Alert”button
        // 4.Click to OK button from the alert
        // 5.Verify “You successfuly clicked an alert”text is displayed
       WebElement alertButton=driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
       alertButton.click();
       Alert alert=driver.switchTo().alert();
       alert.dismiss();

       WebElement result=driver.findElement(By.xpath("//p[.='You successfuly clicked an alert']"));
        System.out.println(result);
    }
@Test
    public void t2(){
        WebElement alertButton=driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        alertButton.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        WebElement result=driver.findElement(By.xpath("//p[.='You clicked: Ok']"));
}

}
