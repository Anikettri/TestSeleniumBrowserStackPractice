package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class WebDriverFactory {
    public static WebDriver initDriver(String browserName){
        WebDriver driver;
        if(browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else{
            throw new IllegalArgumentException("Unsupported browser");
        }
        driver.manage().window().maximize();
        return driver;
    }
}
