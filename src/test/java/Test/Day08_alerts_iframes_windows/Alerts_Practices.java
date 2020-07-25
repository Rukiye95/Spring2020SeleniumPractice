package Test.Day08_alerts_iframes_windows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Alerts_Practices {

     //TC #1: Information alert practice1.Open browser
     //   2.Go to website: http://practice.cybertekschool.com/javascript_alerts
     // 3.Click to “Click for JS Alert”button
     // 4.Click to OK button from the alert
     // 5.Verify “You successfuly clicked an alert”text is displayed


    WebDriver driver;
     @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void p1_information_alert_test(){

      //Locating the alert button to be able to click

        WebElement infoAlertButton=driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        //clicking the alert button so that the alert should pop-up
        infoAlertButton.click();


    //1-create the alert instance adn switch to it
        Alert alert=driver.switchTo().alert();

    //2-Use "alert " to accept the alert
        alert.accept();

      //locating result web element
        WebElement resultText=driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(resultText.isDisplayed());
    }

    @Test
    public void p2_confirmation_alert_test(){
       WebElement confirmationAlertButton=driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
       confirmationAlertButton.click();
       Alert alert=driver.switchTo().alert();
       alert.dismiss();
       WebElement resultText=driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(resultText.isDisplayed());


    }



}
