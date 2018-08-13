package org.framework.adib.ios.StepDefinition;

import java.util.Properties;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.apache.log4j.xml.DOMConfigurator;
import org.framework.adib.core.baseclass.BaseClass;
import org.framework.adib.core.commonfunctions.CommonFunction;
import org.framework.adib.core.commonfunctions.CommonFunctionIOSImpl;
import org.framework.adib.core.utilities.Log;
import org.framework.adib.core.utilities.XlsReader;
import org.framework.adib.ios.config.Config;
import org.testng.Reporter;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Setup {
  
    public static IOSDriver<IOSElement> driver;
    
    public static XlsReader XLR = null;
    Scenario scenario = null;
    Properties CONFIG;
    static CommonFunction com_fun = null;
    protected static String appUrl;

    

    @SuppressWarnings("unchecked")
    @Before
    public void beforeMethod(Scenario scenario) throws Exception {
        
        DOMConfigurator.configure("log4j.xml");
        
        // getting instance of scenario
        this.scenario = scenario;
        Log.startTestCase(scenario.getName());
        
        // Initialize Configurations
        CONFIG = Config.initializeConfig();
        
        // Initialize App location
        appUrl = (System.getProperty("user.dir") + CONFIG.getProperty("APP_URL"));
        Log.info("App location:" + appUrl);
        
        
       //Reading parameters from xml files.
        String EMU_NAME= Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("EMU_NAME");
        String PLATFORM_VERSION =Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("PLATFORM_VERSION");
        String APPIUM_PORT=  Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("APPIUM_PORT");
        // Initialize Appium Driver
        BaseClass.openApplication(appUrl, CONFIG, EMU_NAME, PLATFORM_VERSION, APPIUM_PORT);
        driver = (IOSDriver<IOSElement>)BaseClass.getDriver();
        
        // Initialize XCEL for Data
        XLR = new XlsReader(System.getProperty("user.dir") + CONFIG.getProperty("DATA_FILE"));
        
        // Initialize Common Function
        com_fun = new CommonFunctionIOSImpl(driver);
    }
    
    @After
    public void afterMethod() {
        if (driver != null) {
            driver.quit();
        }
       /* if (BaseClass.checkIfServerIsRunnning(Integer.parseInt(CONFIG.getProperty("APPIUM_PORT")))) {
            BaseClass.stopServer();
        }*/
    }
    
}
