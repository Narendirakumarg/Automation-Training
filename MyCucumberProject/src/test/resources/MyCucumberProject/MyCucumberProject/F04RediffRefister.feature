Feature: Rediff Registration

  Background: 
    Given Open rediff registration page

  Scenario: To validate registration process on Rediff page with valid data
    When I enter fullName as "Ankush Vankore"
    When I enter choose redif id as "ankushvankore"
    And I Click on check availablity
    When I enter password as "Ankush@123"
    When I enter confirm password "Ankush@123"
    When I enter alt mail id "ankushvankore@gmail.com"
    When I enter mobile no as 9874563210

  Scenario: To validate registration process on Rediff page with invalid data
    When enter fullName as "Suraj Singh"
    When enter choose redif id as "surajsingh2024aug"
    And Click on check availablity
    When enter password as "Suraj@123"
    When enter confirm password as "Suraj@123"
    When enter alt mail id "surajsingh@gmail.com"
    When enter mobile no as 1234567890