$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/org/framework/adib/ios/Feature/MyApplicationFeature.feature");
formatter.feature({
  "line": 2,
  "name": "Smoke iOS Test",
  "description": "",
  "id": "smoke-ios-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Functional"
    }
  ]
});
formatter.before({
  "duration": 7606916239,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Use of Buttons",
  "description": "",
  "id": "smoke-ios-test;use-of-buttons",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User opens UI Catalog application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on Controls tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Standard switch is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User clicks on the stanrd switch",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Standard switch should be activated",
  "keyword": "Then "
});
formatter.match({
  "location": "IOSTest.user_opens_UI_Catalog_application()"
});
formatter.result({
  "duration": 2065527075,
  "status": "passed"
});
formatter.match({
  "location": "IOSTest.user_clicks_on_Controls_tab()"
});
formatter.result({
  "duration": 6311248496,
  "status": "passed"
});
formatter.match({
  "location": "IOSTest.standard_switch_is_displayed()"
});
formatter.result({
  "duration": 3731710062,
  "status": "passed"
});
formatter.match({
  "location": "IOSTest.user_clicks_on_the_stanrd_switch()"
});
formatter.result({
  "duration": 7853022499,
  "status": "passed"
});
formatter.match({
  "location": "IOSTest.standard_switch_should_be_activated()"
});
formatter.result({
  "duration": 3818512864,
  "status": "passed"
});
formatter.after({
  "duration": 229660279,
  "status": "passed"
});
});