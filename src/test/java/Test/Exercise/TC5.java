package Test.Exercise;
//DONE
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC5 {
    public static void main(String[] args) {


        //TC#5:	Basic	login	authentication
        //1-Open	a	chrome	browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //  2-Go	to:	http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        // 3-Verify	title	equals:Expected:	Web	Orders	Login
        System.out.println( driver.getTitle());
        String expectedTitle="Web Orders Login";
        String actualTitle=driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        // 4-Enter	username:	Tester
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        // 5-Enter	password:	test
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        // 6-Click	“Sign	In”	button
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        // 7-Verify	titleequals:Expected:	Web	Orders
       String finalTitle= driver.getTitle();
       String finalExpectedTitle="Web Orders";
       if(finalTitle.equals(finalExpectedTitle)){
           System.out.println("passed");
       }else{
           System.out.println("failed");
       }

        System.out.println(finalExpectedTitle);
        System.out.println(finalTitle);


    }
}