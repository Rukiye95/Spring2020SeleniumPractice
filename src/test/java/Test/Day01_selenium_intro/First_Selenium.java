package Test.Day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver; //comes with number 2
import org.openqa.selenium.chrome.ChromeDriver; //comes with number 2

public class First_Selenium {
    public static void main(String[] args) throws InterruptedException {

        //1-This Line creates the connection the between driver and selenium
        //And sets up the driver.
        WebDriverManager.chromedriver().setup();

        //2-Creating the instance of ChromeDriver to be able to do action on ChromeBrowser
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
       // the line maximizes the browser page ofter opening it

        //3-we get google.com
        //String googleURL=
        driver.get("https://www.google.com");
        System.out.println("driver.getTitle()-->"+driver.getTitle());
        System.out.println("driver.getCurrentUrl-->"+driver.getCurrentUrl());

        //BROWSER NAVIGATION
//this line will take user to previous page
        Thread.sleep(2000); //this line adds 200 milliseconds of wait =2 seconds
        driver.navigate().back();

        Thread.sleep(2000);
        driver.navigate().forward(); //this line will go to next page

        Thread.sleep(2000);
        driver.navigate().refresh(); //this line will refresh the page

        driver.navigate().to("https://www.facebook.com");

        System.out.println("driver.getTitle()-->"+driver.getTitle());
        System.out.println("driver.getCurrentUrl-->"+driver.getCurrentUrl());


        System.out.println(driver.getPageSource());

        driver.close();









    }
}
