Feature: BookStore login feature

  Scenario: User should be able to log in with valid credentials
    Given user is on the login page
    When user enters a VALID username "userName" into the username input box
    And user enters a VALID password "password" into the password input box
    And the user clicks on the Log in button
    Then the user should land on the profile page
