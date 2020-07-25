package Test.Exercise;
//DONE
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class TC12 {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

WebElement successSelected=driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
WebElement successsMessage=driver.findElement(By.xpath("//div[.='Success - Check box is checked']"));
if(!successSelected.isSelected()&&!successsMessage.isDisplayed()){
    System.out.println("verification passed");
}else{
            System.out.println("verification failed");
        }


successSelected.click();
if(successsMessage.isDisplayed()){
    System.out.println("passed");
}else{
    System.out.println("failed");
}


    }
}
