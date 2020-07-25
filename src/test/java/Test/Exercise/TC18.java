package Test.Exercise;
//DONE
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SmartBearUtilities;
import utilities.WebDriverFactory;

public class TC18 {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        // TC #1: Smartbear software link verification
        // 1.Open browser
        // 2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
     driver= WebDriverFactory.getDriver("chrome");
     driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtilities.login(driver);
    }


    @Test
    public void s1()throws  InterruptedException{
        driver.findElement(By.xpath("//a[.='Order']")).click();
        Select productDropdown=new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        productDropdown.selectByVisibleText("FamilyAlbum");

        WebElement quantityInput=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        Thread.sleep(3000);
        quantityInput.sendKeys(Keys.BACK_SPACE);
        quantityInput.sendKeys("2");
        WebElement calculateButton=driver.findElement(By.xpath("//input[@value='Calculate']"));


        WebElement inputName=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']"));
        WebElement inputStreet=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox2']"));
        WebElement inputCity=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox3']"));
        WebElement inputState=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox4']"));
        WebElement inputZip=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox5']"));

        Faker faker=new Faker();
        inputName.sendKeys(faker.name().fullName());
        inputCity.sendKeys(faker.address().city());
        inputStreet.sendKeys(faker.address().streetName());
        inputState.sendKeys(faker.address().state());
        inputZip.sendKeys(faker.address().zipCode().replaceAll("-",""));

        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']")).click();
       WebElement cardNO=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox6']"));
       cardNO.sendKeys(faker.finance().creditCard().replaceAll("-",""));

       WebElement expireDate=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox1']"));
       expireDate.sendKeys("11/17");
       driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']")).click();

     WebElement successMessage= driver.findElement(By.xpath("//div[@class='buttons_process']/strong"));
        Assert.assertTrue(successMessage.isDisplayed());
        System.out.println(successMessage.getText());
    }



}
