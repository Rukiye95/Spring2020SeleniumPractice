package Test.Day03_cssSelector_xPath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class P4_ZeroBankURLVerification {
    public static void main(String[] args) {


        // TC #4: Zero Bank URLverification
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        // 2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        // 3.Get attribute value of href from the “forgot your password”link

        WebElement forgotPasswordLink=driver.findElement(By.linkText("Forgot your password?"));  //same thing
       // WebElement forgotPasswordLink= driver.findElement(By.partialLinkText("Forgot")); //we use locator to locate Web Element

        //4.Verify attribute value contains
        //Expected:"/forgot-password.html

       String actualHrefValue= forgotPasswordLink.getAttribute("href");//we've already located Web Element
       String expectedInHRefValue="/forgot-password.html";

        System.out.println("actualHrefValue= "+actualHrefValue);

if(actualHrefValue.contains(expectedInHRefValue)){
    System.out.println("Href value verification PASSED!");
}else{
    System.out.println("Href value verification FAILED!");
}


        System.out.println("Is forgot password displayed? "+forgotPasswordLink.isDisplayed());
//if it is true means displayed on the page


        System.out.println(driver.findElement(By.className("offset3")).isDisplayed());

    }

}
