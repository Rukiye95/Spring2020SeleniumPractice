package Test.Exercise;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class P7 {
    @Test
    public void p1()throws IOException {

        Properties properties=new Properties();
        String path="configuration.properties";
        FileInputStream file=new FileInputStream(path);
        properties.load(file);
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));


    }
}
