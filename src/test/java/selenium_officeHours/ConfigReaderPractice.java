package selenium_officeHours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReaderPractice {
private static Properties properties;
WebDriver driver;
    /*
    * To go into method/class implementation click and hold command and make a click
    * @param args
     */
    static {
        try (FileInputStream fileInputStream=new FileInputStream("src/test/resources/config.properties")){ //we need copy as
            properties=new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
        static {

        }
        static {

        }

        public static String getProperty(String key){
        return properties.getProperty(key);
        }
    public static void main(String[] args) {
        //try with resources used to automatically close input stream


             String browser= properties.getProperty("browser");//we need to give toString otherwise it will return as object
            System.out.println(browser);
            //you will get null if there is no such
            System.out.println(properties.getProperty("url"));

    }

    @Test
    public void loginTest()throws  InterruptedException{
        String browser=getProperty("browser");
        String URL=getProperty("url");
        String usernName=getProperty("username");
        String password=getProperty("password");

        driver= WebDriverFactory.getDriver(browser);
        driver.get(URL);
        System.out.println(driver.getTitle());
        driver.findElement(By.id("prependedInput")).sendKeys(usernName);
        driver.findElement(By.id("prependedInput2")).sendKeys(password);

        Thread.sleep(5000);

        String expected="Dashboard";
        String actual=driver.getTitle();
        Assert.assertEquals(actual,expected,"Page title is not correct!");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
