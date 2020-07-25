package Test.Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;

public class Ex {

    @Test
    public void t1() {
        Driver.getDriver().get("https://www.cbc.ca/news");
        WebElement searchButton=Driver.getDriver().findElement(By.id("searchButton"));
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(searchButton).perform();

    }
}
