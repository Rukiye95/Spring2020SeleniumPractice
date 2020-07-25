package Test.Exercise;
//DONE
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {
   // TC	#2:	Cybertek	verifications
     //   1.Open	Chrome	browser
    //2.Go	to	https://practice.cybertekschool.com
    // 3.Verify	URL	containsExpected:	cybertekschool
    // 4.Verify	title:	Expected:	Practice


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();


        driver.get("http://practice.cybertekschool.com");

        String expectedUrl="http://practice.cybertekschool.com/";
        String actualUrl=driver.getCurrentUrl();

        if(actualUrl.equals(expectedUrl)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());

    }

}
