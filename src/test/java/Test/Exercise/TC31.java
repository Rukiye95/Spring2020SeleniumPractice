package Test.Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class TC31 {

   // TC #1: Etsy Title Verification
//1. Open Chrome browser
//2. Go to https://www.etsy.com
        //    3. Search for “wooden spoon”
          //  4. Verify title:
    //Expected: “Wooden spoon | Etsy”


    @Test
    public void t1(){
        Driver.getDriver().get("https://www.etsy.com");
        WebElement searchBox=Driver.getDriver().findElement(By.id("global-enhancements-search-query"));

        WebElement searchButton=Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        searchBox.sendKeys("wooden spoon");
        searchButton.click();

        String expectedTitle="Wooden spoon | Etsy CA";
        String actualTItle=Driver.getDriver().getTitle();

        Assert.assertEquals(actualTItle,expectedTitle);

    }


}
