package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class ExecuteAPI {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("");
        WebElement element = driver.findElement(By.cssSelector(""));
        File src = element.getScreenshotAs(OutputType.FILE);
        Contact contactDetails = new Contact(123456, 812724,new Address("123 Main St", "New York", 10001));
        System.out.println(contactDetails.getAddress().getCity());
    }
}
