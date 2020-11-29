package com.automation.utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver() {
    }
    private static AndroidDriver<AndroidElement> driver;

    public static AndroidDriver<AndroidElement> getDriver(){
        if (driver==null){
            String platform = ConfigurationReader.getProperty("platform");
            DesiredCapabilities dCaps = new DesiredCapabilities();
            switch (platform){
                case "android":
                    dCaps.setCapability("platformName","Android");
                    dCaps.setCapability("platformVersion","7.0");
                    dCaps.setCapability("deviceName","Pixel_2");
                    dCaps.setCapability("automationName","UiAutomator2");
                    dCaps.setCapability("app","C:/Users/TTR/IdeaProjects/appiumAutomation/apidemos.apk");
                    dCaps.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY,"io.appium.android.apis.ApiDemos");

                    try {
                        driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dCaps);
                        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    }catch (MalformedURLException e){
                        e.printStackTrace();
                    }
                    break;
                default:

            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}