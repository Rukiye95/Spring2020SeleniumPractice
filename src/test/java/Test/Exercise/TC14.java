package Test.Exercise;
//NOT DONE
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.WebDriverFactory;

public class TC14 {
    public static void main(String[] args) {


        //TC #2: PracticeCybertek.com_AddRemoveElements WebElement verification
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        //2. Go to http://practice.cybertekschool.com/add_remove_elements
        //3. Click to “Add Element” button
        driver.findElement(By.xpath("//button[.='Add Element']")).click();
        //tagName[.='text']
        //4. Verify “Delete” button is displayed after clicking.
        System.out.println(driver.findElement(By.xpath("//button[.='Delete']")).isDisplayed());
        //5. Click to “Delete” button.
        driver.findElement(By.xpath("//button[.='Delete']")).click();
        //6. Verify “Delete” button is NOT displayed after clicking.
       Assert.assertFalse(driver.findElement(By.xpath("//button[.='Delete']")).isDisplayed());


    }
}