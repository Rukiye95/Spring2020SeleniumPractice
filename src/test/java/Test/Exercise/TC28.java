package Test.Exercise;
//how to double click?
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TC28 {
   // TC	#16:	Double	ClickTest
    // 1.Go	to	https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
    // 2.Switch	to	iframe.
    // 3.Double	click	on	the	text	“Double-click	me	to	change	my	text	color.”
    // 4.Assert:	Text’s	“style”	attribute	value	con



    WebDriver driver;
    @BeforeMethod
    public void setUp(){
       driver= WebDriverFactory.getDriver("chrome");
       driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");


    }

    @Test
    public void r1(){
        WebElement iframe=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame("iframeResult");
        WebElement pr=driver.findElement(By.xpath("//p[.='Double-click me to change my text color.']"));
        pr.click();

    }

}
