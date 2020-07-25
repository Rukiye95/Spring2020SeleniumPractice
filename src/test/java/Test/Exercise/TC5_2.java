package Test.Exercise;
//DONE
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_2 {
    public static void main(String[] args) {


        //TC #5: Basic authentication Zero Bank
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        // 2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        // 3.Enter username: username
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");
        // 4.Enter password: password
        driver.findElement(By.cssSelector("input[id='user_password']")).sendKeys("password");
        // 5.Click sign in button
        driver.findElement(By.xpath("//input[@value='Sign in']")).click();
        // 6.Verify username is displayed on the page
        System.out.println( driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).isDisplayed());


        // 7.Verify the title Zero –Account Summary

        String expectedTitle="Zero - Account Summary";
        String actualTitle=driver.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
        // 8.Verify the link Account Summary’s href value contains: “account-summary”Print out results in validation formats

        System.out.println(driver.findElement(By.linkText("Account Summary")).getAttribute("href"));


    }
}