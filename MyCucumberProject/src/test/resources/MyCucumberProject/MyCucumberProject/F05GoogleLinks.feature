@AllGoogleLinks
Feature: Google links

  Background: 
    Given I Open Google Application

  @GmailLink
  Scenario: To validate Gmail Link
    When I Click on Gmail Link
    Then Gmail page should displayed

  @ImagesLink
  Scenario: To validate Images Link
    When I Click on Images Link
    Then Images page should displayed

  @StoreLink
  Scenario: To validate Store link
    When I Click on Store link
    Then Store page should displayed

  @TermsLink
  Scenario: To validate Terms link
    When I Click on Terms Link
    Then Terms page should displayed