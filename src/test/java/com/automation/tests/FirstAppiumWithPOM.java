package com.automation.tests;

import com.automation.pages.EtsyPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstAppiumWithPOM {

    AndroidDriver<AndroidElement> driver;
    WebDriverWait wait;
    EtsyPage etsyPage;

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
        etsyPage = new EtsyPage(driver);

        Thread.sleep(5000);
    }

    @Test
    public void login() {
        etsyPage.getStarted.click();
        etsyPage.login("POM","123");

    }
}
