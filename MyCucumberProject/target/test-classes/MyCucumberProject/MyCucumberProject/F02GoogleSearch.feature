Feature: Validate google search

  Scenario: To validate search functionality of google
    Given Launch Google
    When I enter valid keyword in search box
    And I hit Enter
    Then A valid search should display