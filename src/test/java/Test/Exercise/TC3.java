package Test.Exercise;
//DONE
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3 {
    public static void main(String[] args) {
        //  TC #3: PracticeCybertek/ForgotPassword URL verification
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        // 1.Open Chrome browser
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // 3.Enter any email into input box
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ry@gmail.com");
        // 4.Click on Retrieve password
        driver.findElement(By.xpath("//i[.='Retrieve password']")).click();
        // 5.Verify URL contains: Expected: “email_sent”
        System.out.println(driver.getCurrentUrl());
        // 6.Verify textbox displayed the content as expected.Expected: “Your e-mail’s been sent!
        WebElement message=driver.findElement(By.name("confirmation_message"));
        System.out.println(message.getText());
    }
}
