package Test.Day010_jsexecuter_upload_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class Uploading {
    @Test
    public void uploading_test()throws InterruptedException{

        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        WebElement choseFile=Driver.getDriver().findElement(By.id("file-upload"));

        Thread.sleep(3000);

        choseFile.sendKeys("/Users/rukiyeyildirim/Desktop/test");

        WebElement fileUpload=Driver.getDriver().findElement(By.id("file-submit"));
        fileUpload.click();

        WebElement uplodedMessage=Driver.getDriver().findElement(By.xpath("//div[@class='example']/h3"));
        Assert.assertTrue(uplodedMessage.isDisplayed());






    }

}
