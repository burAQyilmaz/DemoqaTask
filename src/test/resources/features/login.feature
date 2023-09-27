Feature: BookStore login feature

  Scenario: log in with valid credentials
    Given user is on the login page
    When user enters a valid username "userName" into the username input box
    And user enters a valid password "password" into the password input box
    And the user clicks on the Log in button
    Then the user should see his username on the profile page

    @wip
  Scenario: log in with valid credentials by enter
    Given user is on the login page
    When user enters a valid username "userName" into the username input box
    And user enters a valid password "password" into the password input box
    And the user hits the enter
    Then the user should see his username on the profile page
