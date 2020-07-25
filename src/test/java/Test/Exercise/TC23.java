package Test.Exercise;
//DONE
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TC23 {
    //TC #1: Information alert practice1.Open browser
        //2.Go to website: http://practice.cybertekschool.com/javascript_alerts
    // 3.Click to “Click for JS Alert”button
    // 4.Click to OK button from the alert
    // 5.Verify “You successfulyclicked an alert”text is displayed.
    // TC #2: Confirmationalert practice
    // 1.Open browser
    // 2.Go to website: http://practice.cybertekschool.com/javascript_alerts
    // 3.Click to “Click for JS Confirm” button
    // 4.Click to OK button from the alert
    // 5.Verify “You clicked: Ok” text is displayed.
    // TC #3: Information alert practice
    // 1.Open browser
    // 2.Go to website: http://practice.cybertekschool.com/javascript_alerts
    // 3.Click to “Click for JS Prompt” button
    // 4.Send “hello”text to alert
    // 5.Click to OK button from the alert
    // 6.Verify “You entered:  hello” text is displayed
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }
    @Test
    public void t1(){
        WebElement button1 =driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        button1.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        WebElement result1=driver.findElement(By.xpath("//p[.='You successfuly clicked an alert']"));
        System.out.println( result1.isDisplayed());

    }


    @Test
    public void t2(){
        WebElement button2=driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        button2.click();
        Alert alert=driver.switchTo().alert();
        alert.dismiss();
        WebElement result=driver.findElement(By.xpath("//p[.='You clicked: Cancel']"));
        System.out.println(result.isDisplayed());
    }

    @Test
    public void t3(){
        WebElement button3=driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        button3.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        WebElement result=driver.findElement(By.xpath("//p[.='You entered: ']"));
        System.out.println(result.isDisplayed());
    }

}
