package Test.Exercise;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TC35 {
    @Test
    public void t1()throws IOException {
        Properties properties=new Properties();
        String path="configuration.properties";

        FileInputStream file=new FileInputStream(path);
        properties.load(file);
        System.out.println("System.getProperty(\"browser\") = " + System.getProperty("browser"));
        System.out.println("System.getProperty(\"password\") = " + System.getProperty("password"));
        System.out.println("properties.getProperty(\"password\") = " + properties.getProperty("password"));


    }
    @Test
    public void t2(){
        System.out.println( ConfigurationReader.getProperty("password"));
    }


}
