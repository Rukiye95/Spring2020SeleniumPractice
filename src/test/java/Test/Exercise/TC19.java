package Test.Exercise;
//DONE
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SmartBearUtilities;
import utilities.WebDriverFactory;

public class TC19 {
    //TC#3: Smartbear software order verification
    // //1.Open browser and login to Smartbear software

    //2.Click on View all orders
    //3.Verify Susan McLaren has order on date “01/05/2010”



    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtilities.login(driver);
    }

    @Test
    public void t1(){
SmartBearUtilities.verifyOrder(driver,"Susan McLaren");
    }
}
