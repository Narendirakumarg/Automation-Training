Feature: Test practice Test Automation

  Background: 
    Given Practice Test Automation page in browser

  Scenario: To validate login functionality with valid data
    When I enter valid user name
    When I enter valid password
    And I click on Login button
    Then Login should successful

  Scenario: To validate login functionality with invalid data
    When I Enter invalid user name
    When I Enter invalid password
    And Click on login button
    Then Error message should display