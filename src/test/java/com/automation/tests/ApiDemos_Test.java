package com.automation.tests;

import com.automation.pages.ApiDemos_Page;
import com.automation.utilities.ReusableMethods;
import org.junit.Test;

public class ApiDemos_Test {

    ApiDemos_Page apiDemosPage = new ApiDemos_Page();

    @Test
    public void testApiDemos() {
        ReusableMethods.waitFor(2);
        apiDemosPage.preference.click();
        apiDemosPage.predepen.click();
        apiDemosPage.checkBox.click();
        apiDemosPage.wifiSetting.click();

        ReusableMethods.waitFor(2);
        apiDemosPage.inputBox.sendKeys("text");
        apiDemosPage.okButton.click();
    }
}
