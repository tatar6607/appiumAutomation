package com.automation.tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstAppiumTest {

    AndroidDriver<AndroidElement> driver;
    WebDriverWait wait;

    @Before
    public void test1() throws MalformedURLException, InterruptedException {
        DesiredCapabilities dCaps = new DesiredCapabilities();
        dCaps.setCapability("platformName","Android");
        dCaps.setCapability("platformVersion","7.0");
        dCaps.setCapability("deviceName","Pixel_2");
        dCaps.setCapability("automationName","UiAutomator2");
        dCaps.setCapability("app","C:/Users/TTR/IdeaProjects/appiumAutomation/etsy.apk");
        dCaps.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY,"com.etsy.android.ui.FragmentHolderSingleActivity");

        driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"),dCaps);
        Thread.sleep(5000);
    }

    @Test
    public void openNewTab() throws MalformedURLException, InterruptedException {

        driver.resetApp();

        String xClickId = "com.etsy.android:id/dark_mode_alert_dismiss";
        try {
            WebElement xClick = driver.findElement(By.xpath(xClickId)) ;
            xClick.click();
        }catch (Exception e) {

        }

        String getStartedId= "com.etsy.android:id/btn_link";
        WebElement getStartedElement= driver.findElement(By.id(getStartedId));
        getStartedElement.click();

        Thread.sleep(5000);

        wait = new WebDriverWait(driver,10);
        String usernameId ="com.etsy.android:id/edit_username";

        WebElement userName = driver.findElement(By.id(usernameId));
        wait.until(ExpectedConditions.visibilityOf(userName));
        userName.sendKeys("abc@mail.com");

        String passwordId ="com.etsy.android:id/edit_password";
        WebElement password =driver.findElement(By.id(passwordId));
        password.sendKeys("123456");




    }
}
