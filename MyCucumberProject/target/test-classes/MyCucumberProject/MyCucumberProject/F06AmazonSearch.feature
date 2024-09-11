Feature: Amazon search functionality

  Scenario: Search functionality for IPhone
    Given Open url "https://www.amazon.in/"
    When I search for "Iphone"
    Then Product should displayed