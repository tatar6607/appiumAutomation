package com.automation.tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackAndroid {

    public static final String USERNAME = "monsoleil4";
    public static final String AUTOMATE_KEY = "c7cmc5aMQU7qELdivKWM";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    AndroidDriver<AndroidElement> driver;

    @Before
    public void setup() throws InterruptedException, MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("browserName", "android");
        caps.setCapability("device", "Samsung Galaxy S10e");
        caps.setCapability("realMobile", "true");
        caps.setCapability("os_version", "9.0");
        caps.setCapability("name", "monsoleil4's First Test");

        driver = new AndroidDriver<AndroidElement>(new URL(URL),caps);
        Thread.sleep(5000);
    }

    @Test
    public void test() {


    }
}
