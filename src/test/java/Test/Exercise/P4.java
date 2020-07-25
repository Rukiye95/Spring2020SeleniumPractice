package Test.Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class P4 {
WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/iframe");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
public void  p1(){
       WebElement iframe= driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
       driver.switchTo().frame("mce_0_ifr");

       WebElement text=driver.findElement(By.xpath("//body[.='Your content goes here.']"));
        System.out.println(text.getText());
        System.out.println(driver.switchTo().parentFrame().getTitle());




}



}
