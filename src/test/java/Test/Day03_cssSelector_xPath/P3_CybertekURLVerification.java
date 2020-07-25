package Test.Day03_cssSelector_xPath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_CybertekURLVerification {
    public static void main(String[] args) {

//Tc #3:Practice Cybertek/ForgotPassword URL verification
//1.Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
//2.Go to http://practice.cybertekschool.com?forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
//3,Enter any email into input box
        WebElement emailInput= driver.findElement(By.name("email")); //this line returns me web element
        emailInput.sendKeys("anyemail@email.com");
       //int inte241=driver.findElement(By.id("asdf"));
//4.Click on Retrieve password
  WebElement retrievePasswordButton= driver.findElement(By.id("form_submit"));
  retrievePasswordButton.click();
//5.Verify URL contains:
//Expected:"email_sent"
String actualURL=driver.getCurrentUrl();
String expectedInURL="email_sent";
        System.out.println("The current URL: "+actualURL);
if(actualURL.contains(expectedInURL)){
    System.out.println("URL verification PASSED!");
}else{
    System.out.println("URL verification FAILED");
}

//6.Verify text box displayed the content as expected
// Expected :"your email's been sent!"
WebElement confirmationMessage=driver.findElement(By.name("confirmation_message"));
//WebElement something=driver.findElement(By.name("confirmation_message")).getText(); return me String
   String actualMessageText=  confirmationMessage.getText();
   String expectedMessageText="Your e-mail's been sent!";
       // System.out.println("Actual message is"+actualMessageText);
   if(actualMessageText.equals(expectedMessageText)){//it checks content
       System.out.println("Confirmation message text verification PASSED!");
   }else{
       System.out.println("Confirmation message text verification FAILED!");
   }


if(confirmationMessage.isDisplayed()){//checks if displayed or not

    System.out.println("Message is displayed, verification PASSED!");
}else{
    System.out.println("Message is NOT displayed,verification FAILED! ");
}


    }
}
