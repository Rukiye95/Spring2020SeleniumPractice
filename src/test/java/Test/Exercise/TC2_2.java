package Test.Exercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//DONE
public class TC2_2 {
    public static void main(String[] args) {

        //   C #2: Zero Bankheader verification
        //1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        // 3.Verify header textExpected: “Log in to ZeroBank”

String expectedTitle="Zero - Log in";
String actualTitle=driver.getTitle();

if(actualTitle.equals(expectedTitle)){
    System.out.println("passed");
}else{
    System.out.println("failed");
}

    }


}