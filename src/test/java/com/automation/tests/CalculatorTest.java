package com.automation.tests;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {

    AndroidDriver<AndroidElement> driver;

    @Before
    public void test1() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "7.0");
        desiredCapabilities.setCapability("deviceName", "Pixel_2");
        desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);
        Thread.sleep(5000);
    }

    @Test
    public void test() {

        WebElement seven = driver.findElement(By.id("digit_7"));
        seven.click();

//        WebElement multiply = driver.findElement(MobileBy.ByAccessibilityId.id("multiply"));
        WebElement multiply = driver.findElement(MobileBy.AccessibilityId("multiply"));
        multiply.click();

        WebElement five = driver.findElement(By.id("digit_5"));
        five.click();

        WebElement equals = driver.findElement(MobileBy.AccessibilityId("equals"));
        equals.click();

        WebElement result = driver.findElement(By.id("result"));

        System.out.println(result.getText());













    }
}
