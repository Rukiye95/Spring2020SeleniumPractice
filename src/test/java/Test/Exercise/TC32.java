package Test.Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

public class TC32 {
    @Test
    public void t1() {
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        WebElement choseFile=Driver.getDriver().findElement(By.id("file-upload"));
        choseFile.sendKeys("");


    }
}