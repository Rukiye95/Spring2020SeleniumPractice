package Test.Exercise;
//DONE
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC6 {
    public static void main(String[] args) {


        //TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        // 1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/forgot_password
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // 3. Locate all the WebElements on the page using XPATH locator only (total of 6)
        // a. “Home” link
        WebElement homeLink= driver.findElement(By.xpath("//a[@class='nav-link']"));
        System.out.println(homeLink.getText());
        // b. “Forgot password” header
        WebElement forgotPassword=driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        System.out.println(forgotPassword.getText());
        // c. “E-mail” text
        WebElement emailText=driver.findElement(By.xpath("//label[.='E-mail']"));
        System.out.println(emailText.getText());
        // d. E-mail input box
        WebElement emailInputBox=driver.findElement(By.xpath("//input[@name='email']"));
        emailInputBox.sendKeys("ruki@gail.com");
        System.out.println(emailInputBox.getText());
        // e. “Retrieve password” button
        WebElement retrievePassword=driver.findElement(By.xpath("//i[.='Retrieve password']"));
        System.out.println(retrievePassword.getText());
        // f. “Powered byCybertek School” text
        WebElement poweredText=driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        System.out.println(poweredText.getText());

        // 4. Verify all WebElements are displayed
        System.out.println(homeLink.isDisplayed());
        System.out.println(forgotPassword.isDisplayed());
        System.out.println(emailText.isDisplayed());
        System.out.println(emailInputBox.isDisplayed());
        System.out.println(retrievePassword.isDisplayed());
        System.out.println(poweredText.isDisplayed());


    }
}