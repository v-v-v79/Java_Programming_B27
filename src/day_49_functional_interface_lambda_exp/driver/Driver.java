package day_49_functional_interface_lambda_exp.driver;

import day_49_functional_interface_lambda_exp.ConfigReader;

import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver(){
        /*
        why is constructor private? Means -> I can't create an object outside the class.
         */
    }

    private static WebDriver driver;

    private static WebDriver getDriver() {
        switch (ConfigReader.getProperty("browser")) {
            case "chrome":
                driver = new ChromeDriver();
                //driver.manage().window().maximize();
                //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            case "firefox":
                driver = new FireFoxDriver();
        }
        return driver;
    }
}
