package org.framework.adib.ios.Runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/org/framework/adib/ios/Feature/MyApplicationFeature.feature" }, 
                        glue = {"org/framework/adib/ios/StepDefinition" }, 
                        plugin = {"html:target/cucumber-html-report" }, 
                        dryRun = false, monochrome = false)

@Test
public class TestRunner extends AbstractTestNGCucumberTests {
    
}

// ORed : tags = {"@Smoke, @Regression"} To add condition for OR operator
// Anded : tags = {"@Smoke", "@Regression"} To add condition for AND operator
// Ignore Case : tags = {"~@Smoke", "@Regression"} To ignore a set of test cases
// use ~ operator