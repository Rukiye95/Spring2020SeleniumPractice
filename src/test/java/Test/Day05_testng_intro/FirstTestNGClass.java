package Test.Day05_testng_intro;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestNGClass {

    @BeforeMethod
    public void setUp(){
        System.out.println("Before method running... ");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("After method running...");
    }


    @Test
    public void test1(){
        System.out.println("Test 1 is running ...");
    }

   //without Test annotation it is just Java method
    @Test
    public void test2(){
        System.out.println("Test 2 is running...");
    }
}

