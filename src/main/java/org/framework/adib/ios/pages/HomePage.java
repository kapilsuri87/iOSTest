package org.framework.adib.ios.pages;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;



public class HomePage {
	IOSDriver<IOSElement> driver;

    public HomePage(IOSDriver<IOSElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='Controls']")
    public WebElement controlsTab;
    
    public ControlsPage clickControlsTab()
    {
        controlsTab.click();
        return new ControlsPage(driver);
    }

}
