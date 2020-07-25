package Test.Exercise;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TC21 {
    //C#6: Cybertek registration form confirmationNote: Use JavaFaker when possible.
    // 1.Open browser
    // 2.Go to website: http://practice.cybertekschool.com/registration_form
    // 3.Enter first name
    // 4.Enter last name
    // 5.Enter username
    // 6.Enter email address
    // 7.Enter password
    // 8.Enter phone number
    // 9.Select a gender from radio buttons
    // 10.Enter date of birth
    // 11.Select Department/Office
    // 12.Select Job Title
    // 13.Select programming language from checkboxes
    // 14.Click to sign up button
    // 15.Verify success message “You’ve successfully completed registration.”is displayed.

    WebDriver driver;
    @BeforeMethod
    public void t1(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/registration_form");


    }

    @Test
    public void t2(){
        Faker faker=new Faker();
        WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys(faker.name().firstName());


        WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());


        WebElement userName=driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys(faker.name().username().replaceAll(".",""));

        WebElement emailAdress=driver.findElement(By.xpath("//input[@name='email']"));
        emailAdress.sendKeys(faker.internet().emailAddress());

        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.internet().password());


        WebElement phoneNumber=driver.findElement(By.xpath("//input[.='Phone number']"));
        phoneNumber.sendKeys(faker.phoneNumber().cellPhone());
        Select gender=new Select(driver.findElement(By.xpath("//input[.='Gender']")));
        gender.selectByIndex(1);
        Select dateOfBirth=new Select(driver.findElement(By.xpath("//input[@name='']")));
        dateOfBirth.selectByVisibleText("10/02/1995");
        //WebElement department=driver.findElement(By.xpath(""));
        //WebElement jobTitle=driver.findElement(By.xpath(""));
        //WebElement programmingLanguages=driver.findElement(By.xpath(""));



    }
}
