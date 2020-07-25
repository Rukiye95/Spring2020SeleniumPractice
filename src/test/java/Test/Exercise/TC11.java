package Test.Exercise;
//DONE
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class TC11 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkBox1=driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        if(!checkBox1.isSelected()){
            System.out.println("check box 1 is not selected");
        }else{
            System.out.println("check boz 1 is selected");
        }

        WebElement checkboxes2=driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
        if(checkboxes2.isSelected()){
         System.out.println("check box 2 is selected");
        }else{
            System.out.println("check box 2 is not selected");
        }

        checkBox1.click();

        checkboxes2.click();

        if(checkBox1.isSelected()){
            System.out.println("is selected passed");
        }else{
            System.out.println("is not selected failed");
        }


        if(!checkboxes2.isSelected()){
            System.out.println("is not selected passed");
        }else{
            System.out.println("is selected failed");
        }



    }
}
