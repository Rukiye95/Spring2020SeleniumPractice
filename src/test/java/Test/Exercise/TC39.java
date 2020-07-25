package Test.Exercise;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;
import utilities.Driver;

public class TC39 {
    @Test
    public void t1() {
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
        HoversPage hoversPage=new HoversPage();
        Actions actions=new Actions(Driver.getDriver());

        actions.moveToElement(hoversPage.img1).perform();
        Assert.assertTrue(hoversPage.user1.isDisplayed());

        actions.moveToElement(hoversPage.img2).perform();
        Assert.assertTrue(hoversPage.user2.isDisplayed());

        actions.moveToElement(hoversPage.img3).perform();
        Assert.assertTrue(hoversPage.user3.isDisplayed());



    }
}
