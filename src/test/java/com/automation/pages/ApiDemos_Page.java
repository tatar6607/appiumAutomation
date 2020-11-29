package com.automation.pages;

import com.automation.utilities.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ApiDemos_Page {

    public ApiDemos_Page () {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);
    }

    @AndroidFindBy(accessibility = "Preference")
    public WebElement preference;

    @AndroidFindBy(accessibility = "3. Preference dependencies")
    public WebElement predepen;

    @AndroidFindBy(id = "android:id/checkbox")
    public WebElement checkBox;

    @AndroidFindBy(xpath = "//*[@text='WiFi settings']")
    public WebElement wifiSetting;

    @AndroidFindBy(id = "android:id/edit")
    public WebElement inputBox;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement okButton;


}

