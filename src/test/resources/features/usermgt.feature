@user-mgt
Feature: User-Mgt page scenarios

  Background:
    Given I click nav button "User-Mgt"

  @US4004
  Scenario: Verify new user input fields are displayed on the page
    Then Verify "First Name" input field is displayed
    And Verify "Last Name" input field is displayed
    And Verify "Phone Number" input field is displayed
    And Verify "E-mail" input field is displayed
    And Verify "Role" input field is displayed

  @US4004b
  Scenario: Verify new user input fields are displayed on the page
    Then Verify following input fields are displayed:
      | First Name   |
      | Last Name    |
      | Phone Number |
      | E-mail       |
      | Role         |

  @US4010
  Scenario: Verify Submit button is enabled after filling out the form
    Then Verify button "Submit" is disabled
    When I fill out new user form with following data:
      | First Name   | John                |
      | Last Name    | Snow                |
      | Phone Number | 123-456-7890        |
      | E-mail       | john.snow@north.com |
      | Role         | Student             |
    Then Verify "Submit" is enabled