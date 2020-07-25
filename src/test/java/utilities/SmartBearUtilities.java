package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtilities {

public static void login(WebDriver driver){
    // 3.Enter username: “Tester”
    WebElement inputUsername=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
    inputUsername.sendKeys("Tester");
    // 4.Enter password: “test”
    WebElement inputPassword=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
    inputPassword.sendKeys("test");
    // 5.Click to Login button
    WebElement loginButton=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
    loginButton.click();


}
/*
@param: WebDriver driver, String name
    • Method should verify if given name exists in orders.
    • This method should simply accepts a name(String), and assert whether
    given name is in the list or not.
    • Create a new TestNG test to test if the method is working as expected.
 */

public static void verifyOrder(WebDriver driver,String name){
List<WebElement> namesList= driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

    for (WebElement each : namesList) {
        if (each.getText().equals(name)){ //this provided by arguments
            Assert.assertTrue(true);
            return;
        }
    }

    Assert.fail("The name does not exist in the list! Verification failed!");

}

public static void printNameAndCities(WebDriver driver){

    //The list where we store all the names

    List<WebElement> namesList= driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));
    List<WebElement>citiesList=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[7]"));

    //instead of creating each look ,we will create regular for loop
    //because we can use the int i index number to get both names and cities values

    for(int i=0;i<namesList.size();i++){
        System.out.println("Name: "+namesList.get(i).getText()+",Cities: "+citiesList.get(i).getText());
    }


}

}








