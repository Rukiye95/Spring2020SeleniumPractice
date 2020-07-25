package Test.Day06_testng_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGPractice {

    @BeforeClass
    public void before_class(){
    System.out.println("Before CLASS is running!----------------");
    }

    @AfterClass
    public void after_class(){
        System.out.println("After CLASS is running!----------------");
    }


    @BeforeMethod
    public void setUp(){
        System.out.println("Before method is running...");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("After method is running..");
    }

    @Test
    public void test1(){
        System.out.println("Test1 running...");
        String actualTitle="Homepage";//driver.getTitle();
        String expectedTitle="Homepage";

        Assert.assertEquals(actualTitle,expectedTitle);
        /*
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed!");
        }else{
            System.out.println("Title verification FAILED!");
        }



         */
    }

@Ignore
    @Test
    public void test2(){
        System.out.println("Test2 is running...");

        Assert.assertEquals("string1","string2","String verification on test2 failed.");
    }

    @Test
    public void test3() {
        System.out.println("Test3 is running...");

        String actualTitle = "Amazon prime";
        String expectedInTitle = "prime";
        String textString="adsfd";

        //if the boolean value we pass in assertTrue is "true", assertion will pass.
        //else it will fail


       // Assert.assertTrue(false);
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
        //Assert.assertTrue(actualTitle.contains(textString));
        System.out.println("just checking if this line is running!");
        Assert.assertFalse(actualTitle.contains(textString));


    }


}
