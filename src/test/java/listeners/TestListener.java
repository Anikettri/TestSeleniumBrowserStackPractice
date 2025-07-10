package listeners;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ScreenshotUtil;

public class TestListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result){
        Object testClass = result.getInstance();
        if(testClass instanceof BasePage){
            WebDriver driver=((BasePage) testClass).getDriver();
            String testName = result.getName();
            ScreenshotUtil.captureScreenshot(driver, testName);
        }
    }
}
