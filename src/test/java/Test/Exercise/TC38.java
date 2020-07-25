package Test.Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.Driver;

public class TC38 {
    @Test
    public void t1() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));

        WebElement userName=Driver.getDriver().findElement(By.id("prependedInput"));
        WebElement password=Driver.getDriver().findElement(By.id("prependedInput2"));
        WebElement logIn=Driver.getDriver().findElement(By.id("_submit"));

        userName.sendKeys(ConfigurationReader.getProperty("storemanager_username"));
        password.sendKeys("sjdhva");
        logIn.click();

       WebElement errorMessage=Driver.getDriver().findElement(By.xpath("//div[.='Invalid user name or password.']"));
        Assert.assertTrue(errorMessage.isDisplayed());

    }
}