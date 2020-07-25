package Test.Day07_javafaker_webtables;

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

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearTests {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
       // TC #1: Smartbear software link verification
        // 1.Open browser2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SmartBearUtilities.login(driver);

    }

    @Test
    public void p1_smartbear_login_test(){

        // 6.Print out count of all the links on landing page
       List<WebElement> allLinks= driver.findElements(By.xpath("//body//a"));
        System.out.println("Number of the links: "+allLinks.size());
        int expectedNumberOfLinks=6;
        int actualNumberOfLinks=allLinks.size();
        Assert.assertEquals(actualNumberOfLinks,6);
        // 7.Print out each link text on this page
        for(WebElement link:allLinks){
            System.out.println(link.getText());
        }



    }


    @Test
    public void p2_smartbear_order_placing() throws InterruptedException{
        //TC#2: Smartbearsoftware order placing

        // 6.Click on Order
        WebElement orderLink=driver.findElement(By.xpath("//a[.='Order']"));
        orderLink.click();
        // 7.Select familyAlbum from product, set quantity to 2
        Select productDropdown=new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        productDropdown.selectByVisibleText("FamilyAlbum");

        WebElement quantityInput=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        //quantityInput.clear();//just deletes if there is any existing input int he input box
        Thread.sleep(1000);
        //Imitating as if the user is pressing BACKSPACE key on keyboard to delete something
        quantityInput.sendKeys(Keys.BACK_SPACE);

       // Thread.sleep(1000);
        quantityInput.sendKeys("2");
        // 8.Click to “Calculate” button
        WebElement calculateButton=driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculateButton.click();

        // 9.Fill address Info with JavaFaker

WebElement inputCustomerName=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
WebElement inputStreet=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
WebElement inputCity=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
WebElement inputState=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
WebElement inputZip=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));


        Faker faker=new Faker();

//•Generate: name, street, city, state, zip code
        inputCustomerName.sendKeys(faker.name().fullName());
        inputStreet.sendKeys(faker.address().streetName());
        inputCity.sendKeys(faker.address().city());
        inputState.sendKeys(faker.address().state());
        String zipcode=faker.address().zipCode().replaceAll("-","");
        inputZip.sendKeys(zipcode);

        // 10.Click on “visa” radio button
WebElement visaRadiobutton=driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
visaRadiobutton.click();
        // 11.Generate card number using JavaFaker
WebElement inputCardNumber=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
//Entering the credit card number
inputCardNumber.sendKeys(faker.finance().creditCard().replaceAll("-",""));

//Entering date
WebElement expirationDate =driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
expirationDate.sendKeys("12/25");

        // 12.Click on “Process”
WebElement processButton=driver.findElement(By.xpath("//a[.='Process']"));
processButton.click();

// 13.Verify success message “New order has been successfully added.”
        WebElement successMessage=driver.findElement(By.xpath("//div[@class='buttons_process']/strong"));
        Assert.assertTrue(successMessage.isDisplayed());
        
    }

}


