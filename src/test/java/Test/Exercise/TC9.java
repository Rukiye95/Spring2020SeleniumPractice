package Test.Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;
//DONE
public class TC9 {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.youtube.com");


        List<WebElement> allLinks=driver.findElements(By.xpath("//body//a"));

        int linksWithText=0;
        int linksWithoutText=0;

        for(WebElement each:allLinks){
            String allText= each.getText();


            if(allText.isEmpty()){
                linksWithoutText++;
            }else{
                linksWithText++;
            }

        }

        System.out.println(linksWithoutText);
        System.out.println(linksWithText);



    }
}