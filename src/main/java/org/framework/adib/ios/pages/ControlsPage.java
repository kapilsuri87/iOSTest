package org.framework.adib.ios.pages;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

import org.mortbay.log.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;



public class ControlsPage {
	IOSDriver<IOSElement> driver;

    public ControlsPage(IOSDriver<IOSElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    
    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='Standard Switch']")
    public WebElement standardSwitchText;
    
    @iOSFindBy(xpath = "//XCUIElementTypeSwitch[@name='Standard']")
    public WebElement satandardSwitch;
    
    public String getstandardSwitchText() {
        return standardSwitchText.getText();
    }
    
    public void enablesatandardSwitch()
    {
        if(satandardSwitch.getAttribute("value").equalsIgnoreCase("0"))
        {
            Log.info("Standard switch is disabled");
            satandardSwitch.click();
        }
    }

}
