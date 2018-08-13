@Functional
Feature: Smoke iOS Test
    @Smoke
  Scenario: Use of Buttons
    Given User opens UI Catalog application
    When User clicks on Controls tab
    Then Standard switch is displayed
    When User clicks on the stanrd switch
    Then Standard switch should be activated
   