package Test.Exercise;
//DONE
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;

public class TC10 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.apple.com");
        WebElement phoneLink=driver.findElement(By.xpath("//span[.='iPhone']"));

        List<WebElement> allLinks=driver.findElements(By.xpath("//body//a"));

        int linkWithoutText=0;
        int linkWithText=0;

        for(WebElement each:allLinks){
            String textOfEachLink=each.getText();
            if(textOfEachLink.isEmpty()){
                linkWithoutText++;
            }else{
               linkWithText++;
            }

        }
        System.out.println(linkWithoutText);
        System.out.println(linkWithText);

    }
}
