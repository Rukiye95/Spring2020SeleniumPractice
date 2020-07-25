package Test.Exercise;
//attribute value
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //TC #4: Zero Bank URLverification1.Open Chrome browser
        driver.get(" http://zero.webappsecurity.com/login.html");
        //2.Go to http://zero.webappsecurity.com/login.html

        // 3.Get attribute value of href from the “forgot your password”link
        System.out.println( driver.findElement(By.linkText("Forgot your password ?")).getAttribute("href"));
        System.out.println(driver.findElement(By.linkText("Forgot your password ?")).getText());
        // 4.Verify attribute value containsExpected: “/forgot-password.html”
    }
}