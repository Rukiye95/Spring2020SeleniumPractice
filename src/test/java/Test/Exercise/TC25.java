package Test.Exercise;
//DONE
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.Set;

public class TC25 {
   // TC	#	:	Window	Handlepractice
    // 1.Create	a	new	class	called:	WindowHandlePractice
    // 2.Create	new	test	and	make	set	ups
    // 3.Go	to	:	http://practice.cybertekschool.com/windows
    // 4.Assert:	Title	is	“Practice”
    // 5.Click	to:	“Click	Here”text
    // 6.Switch	to	new	Window.
    // 7.Assert:	Title	is	“New	Window”
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
driver= WebDriverFactory.getDriver("chrome");
driver.get("http://practice.cybertekschool.com/windows");



    }
@Test
    public void t1(){
       String currentWindowHandle=driver.getWindowHandle();
       WebElement clickHereLink=driver.findElement(By.xpath("//a[.='Click Here']"));
    System.out.println("Before clicking "+driver.getTitle());
    clickHereLink.click();
    System.out.println("After clicking "+driver.getTitle());


    Set<String>windowHandles=driver.getWindowHandles();
    for(String each:windowHandles){
        driver.switchTo().window(each);
        System.out.println(driver.getTitle());

    }
    driver.switchTo().window(currentWindowHandle);
    System.out.println(driver.getTitle());


}

}
