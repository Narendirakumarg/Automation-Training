Feature: validate google title

  Scenario: to validate title of Google
    Given Open Google
    When Read the title
    Then Title should be Google
