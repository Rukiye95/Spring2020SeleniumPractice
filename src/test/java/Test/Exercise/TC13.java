package Test.Exercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC13 {


    // TC #03: FINDELEMENTS_APPLE
    // 1.Open Chrome browser
    // 2.Go to https://www.apple.com
    // 3.Click to all of the headers one by onea.Mac, iPad, iPhone, Watch, TV, Music, Support
    // 4.Printout how many links on each pagewiththe titles of the pages
    // 5.Loop through all
    // 6.Print out how many link is missing textTOTAL
    // 7.Print out how many link has textTOTAL
    // 8.Print out how many total linkTOTAL
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.apple.com");
    }
}
