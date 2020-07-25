package Test.Day09_testbase_properties_driverUtil;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingFRomProperties {


    @Test
    public void reading_properties_file() throws IOException {
        //Properties class object allow us to read from configuration.properties
        Properties properties=new Properties();

        //we need to show where the file is stored
        //we need the path of the file

        String path="configuration.properties";
        //Users/cybertekchicago-1/Desktop/seleniumprojectb18/configuration.properties

        //we need to open this configuration.properties file in java memory(FileInputStream)
        FileInputStream file=new FileInputStream(path); //we throw IOException

        //we need to load the opened file into the properties object
        properties.load(file);

        //we can read the configuration.properties file using properties object
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));//properties.getProperty(
        System.out.println("properties.getProperty(\"password\") = " + properties.getProperty("password"));
    }


    @Test
    public void using_configuration_reader_utility(){

       String browser = ConfigurationReader.getProperty("browser");
        System.out.println("browser= "+browser);

        String username=ConfigurationReader.getProperty("username");
        System.out.println("Username= "+username);
    }
}
