package Test.Exercise;
//DONE
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;

public class TC8 {
    public static void main(String[] args) {


        //TC #0: FINDELEMENTS
        //1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.merriam-webster.com/");
        //2.Go to https://www.merriam-webster.com/
        // 3.Print out the texts of all links
        List<WebElement> allLinks=driver.findElements(By.xpath("//body//a"));

        int linksWithoutTExt=0;
        int linksWithText=0;
        for(WebElement each:allLinks){
            String textOfEachLink=each.getText();

            if(textOfEachLink.isEmpty()){
                linksWithoutTExt++;
            }else{
                linksWithText++;
            }

        }

        System.out.println(linksWithoutTExt);
        System.out.println(linksWithText);
        // 4.Print out how many link is missing text
        // 5.Print out how many link has text
        // 6.Print out how many total link
    }
}