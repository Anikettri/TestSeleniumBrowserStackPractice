package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {
    public static String captureScreenshot(WebDriver driver, String testName){
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String screenshotDir = "screenshots";
        String fileName=testName+"_"+timeStamp+".png";
        File screenshotFolder = new File(screenshotDir);
        File destFile = new File(screenshotDir, fileName);
        if (!screenshotFolder.exists()){
            screenshotFolder.mkdirs();
        }
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try{
            Files.copy(srcFile.toPath(), destFile.toPath());
        } catch (IOException e) {
            System.out.println("Failed to save screenshot "+e.getMessage());
        }
        return destFile.getAbsolutePath();
    }
}
