package org.framework.adib.ios.StepDefinition;

import static org.testng.Assert.assertTrue;

import org.framework.adib.core.baseclass.BaseClass;
import org.framework.adib.core.commonfunctions.CommonFunction;
import org.framework.adib.core.utilities.Log;
import org.framework.adib.core.utilities.XlsReader;
import org.framework.adib.ios.pages.ControlsPage;
import org.framework.adib.ios.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IOSTest extends BaseClass {
    
    CommonFunction com_fun = Setup.com_fun;
 
    // Variables for accessing XLS methods
    XlsReader XLR = Setup.XLR;
    String name, userName, email, pwd, lang, adds;
    int rowNum = 0;
    
    // Page objects for all the application pages
    protected HomePage hp;
    protected ControlsPage cp;
    
    @Given("^User opens UI Catalog application$")
    public void user_opens_UI_Catalog_application() throws Throwable {
        hp = new HomePage(Setup.driver);
    }

    @When("^User clicks on Controls tab$")
    public void user_clicks_on_Controls_tab() throws Throwable {
        cp = hp.clickControlsTab();
    }

    @Then("^Standard switch is displayed$")
    public void standard_switch_is_displayed() throws Throwable {
       assertTrue(cp.getstandardSwitchText().equalsIgnoreCase("Standard Switch"));
       Log.info("Standard switch text is displayed");
    }

    @When("^User clicks on the stanrd switch$")
    public void user_clicks_on_the_stanrd_switch() throws Throwable {
        cp.enablesatandardSwitch();
    }

    @Then("^Standard switch should be activated$")
    public void standard_switch_should_be_activated() throws Throwable {
        assertTrue(cp.satandardSwitch.getAttribute("value").equalsIgnoreCase("1"));
        Log.info("Switch is enabled");
    }
}
