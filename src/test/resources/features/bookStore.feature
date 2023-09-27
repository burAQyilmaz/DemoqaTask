Feature: BookStore features


  Scenario: log in with valid credentials
    Given user is on the login page
    When user enters a valid username "userName" into the username input box
    And user enters a valid password "password" into the password input box
    And the user clicks on the Log in button
    Then the user should see his username on the profile page


  Scenario: log in with valid credentials by enter
    Given user is on the login page
    When user enters a valid username "userName" into the username input box
    And user enters a valid password "password" into the password input box
    And the user hits the enter
    Then the user should see his username on the profile page


  Scenario Outline: Negative login scenarios
    Given user is on the login page
    When user enters a valid username "<userName>" into the username input box
    And user enters a valid password "<password>" into the password input box
    And the user clicks on the Log in button
    Then the user should see his username on the profile page

    Examples: credentials
      | userName | password   |
      |          |            |
      |          | Burak1234! |
      | buraq    |            |
      | burak    | Burak1234! |
      | buraq    | Burak1234  |
      | burak    | Burak1234  |


  Scenario: logout scenario
    Given user is logged in
    When user clicks on the log out button on the any page
    Then user is logged out


  Scenario: search box scenario
    Given user is logged in
    When user clicks on the search box
    And user types "String" into the search box
    Then user sees listed books which contain "String"


  @wip
  Scenario: Change row number on profile page
    Given user is on the profile page
    When user clicks row dropdown menu
    And user select any row "number"
    Then user sees changed row "number"
