package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReaderUtil;
import utils.WebDriverFactory;

public class BasePage {
    protected WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.initDriver(ConfigReaderUtil.get("browser"));
        driver.get(ConfigReaderUtil.get("url"));
    }
    @AfterMethod
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}
