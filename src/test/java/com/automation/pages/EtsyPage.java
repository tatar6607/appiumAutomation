package com.automation.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class EtsyPage {

    private AndroidDriver<AndroidElement> driver;

    public EtsyPage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "btn_link")
    public WebElement getStarted;

    @AndroidFindBy(id = "edit_username")
    public WebElement usernameTextBox;

    @AndroidFindBy(id = "edit_password")
    public WebElement passwordTextBox;

    public void login(String username, String password) {
        usernameTextBox.sendKeys(username);
        passwordTextBox.sendKeys(password);

    }

}
