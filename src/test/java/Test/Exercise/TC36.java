package Test.Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

public class TC36 {

    @Test
    public void t1(){
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        WebElement fileChoose=Driver.getDriver().findElement(By.id("file-upload"));
        fileChoose.sendKeys("/Users/rukiyeyildirim/Desktop/test");

        WebElement upload=Driver.getDriver().findElement(By.id("file-submit"));
        upload.click();
        WebElement message=Driver.getDriver().findElement(By.id("uploaded-files"));
        System.out.println(message.isDisplayed());
    }
}
