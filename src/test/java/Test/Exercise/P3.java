package Test.Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class P3 {
    //TC	#	:	Window	Handlepractice
    // 1.Create	a	new	class	called:	WindowHandlePractice
    // 2.Create	new test and	make	set	ups
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
    public void t2(){
        Assert.assertEquals("Practice",driver.getTitle());
        driver.findElement(By.xpath("//a[.='Click Here']"));


    }


}
