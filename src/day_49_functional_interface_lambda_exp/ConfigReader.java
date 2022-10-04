package day_49_functional_interface_lambda_exp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();
    /*
    * private: only accessible in the same class
    * static: access by the class name instead of create an object
    * Properties: we are creating object of this class to connect
    * a properties (test.properties) of this class to java project
    */
    static {
        try {
            //creates a file object allows us to connect to a file
            FileInputStream fileInputStream = new FileInputStream("test.properties");
            properties.load(fileInputStream);
        } catch (IOException e) {
            //throw new RuntimeException(e);
            System.out.println("File is not found");
            e.printStackTrace();
        }
    }
    /* static block: run the code in the beginning to make sure everything is set up
     FileInputStream: connect to a file -> allows access to the information in some way
     */
    /*
    summary:
    1 creates a properties file called: test.properties
    2 created a class called ConfigReader
    3 in ConfigReader we created a Properties object
    4 in the static block we connected to the file the Properties object
    5 used the load method from Properties object to load information to property object file
     */
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
