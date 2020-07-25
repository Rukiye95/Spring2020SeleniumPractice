package Test.Exercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GetTextvsGetAttribute2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();;
        WebDriver driver=new ChromeDriver();
        driver.get("https://cbcnews.ca");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println( driver.findElement(By.partialLinkText("Sign In")).getText());
        System.out.println(driver.findElement(By.partialLinkText("Sign In")).getAttribute("href"));

    }
}
