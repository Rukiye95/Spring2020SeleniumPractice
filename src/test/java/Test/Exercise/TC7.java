package Test.Exercise;
//NOT COmplete
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC7 {
    public static void main(String[] args) {


        // TC #2: PracticeCybertek.com_AddRemoveElements WebElement verification
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/add_remove_elements
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        // 3. Click to “Add Element” button
        WebElement addElementButton=driver.findElement(By.xpath("//button[.='Add Element']"));
        addElementButton.click();
        // 4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton=driver.findElement(By.xpath("//button[.='Delete']"));
        System.out.println(deleteButton.isDisplayed());
        // 5. Click to “Delete” button.
        deleteButton.click();
        // 6. Verify “Delete” button is NOT displayed after clicking. USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        System.out.println(deleteButton.isDisplayed());


    }
}