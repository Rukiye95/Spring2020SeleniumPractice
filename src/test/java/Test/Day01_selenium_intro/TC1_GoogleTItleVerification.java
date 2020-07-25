package Test.Day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_GoogleTItleVerification {
    public static void main(String[] args) {

        /*

tc #1 Google Title VErification
//1.Open Chrome Browser
2.Go to https://www.google.com
3.verify title:expected :google

         */


        //1.Open Chrome Browser
          //Set up ,my web driver
        WebDriverManager.chromedriver().setup();
          //Create an instance of my Chrome driver
        WebDriver driver=new ChromeDriver();
          //make the browser full screen
        driver.manage().window().maximize();

        //2.Go to https://www.google.com
        driver.get("https://www.google.com");
        //3.Verify title:Expected:Google
        String actualTitle=driver.getTitle();
        String expectedTitle="Google";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Google Title verification PASSED!");
        }else{
            System.out.println("Google Title verification FAILED!!");
        }




    }
}
