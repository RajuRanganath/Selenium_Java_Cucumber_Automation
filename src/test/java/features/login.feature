Feature: Verify login functionality

  Scenario Outline: Verify error message when UserID field left blank
    Pre-requisite: Login page opened
    When user enters "<UserID>"
    And user enters "<Password>"
    And user clicks on "Submit" button
    Then verify error message "User ID should not be blank"

    Examples:
    |UserID| Password|
    |      |password@1234|

