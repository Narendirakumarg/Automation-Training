Feature: Test user registration process

  Background: Given Open registration page

  Scenario: Validate registration
    When I enter the data as follows
      | Naren | Kumar | narenkumar@gmail.com | Neelankarai |
      | Saran | Kundu | saranya@gmail.com    | Chennai     |
    Then Registration should sucess

  Scenario: Validate registration with anoth values
    When Enter following data
      | Fristname | LastName | MailID          | City        | Mobile     |
      | Samriddhi | Lakshmi  | Sam@gmail       | Neelankarai | 9876543210 |
      | Me        | you      | meyou@gamil.com | chennai     | 9012365478 |
    Then Registration message should display