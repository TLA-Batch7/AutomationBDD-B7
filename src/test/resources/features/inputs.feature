@inputsScenario
Feature: Inputs page scenarios

  Background:
    Given I click nav button "Inputs"

  @US4051
  Scenario: Contact Us form text
    When I fill out contact us form with following details:
      | first_name | John                     |
      | last_name  | Wick                     |
      | email      | john.wick@contractor.com |
      | phone      | 666-666-6666             |
      | address    | 123 Main St              |
      | city       | NYC                      |
      | state      | New York                 |
      | zip        | 12345                    |
    When I click a button "Send"
    Then Verify text "Thanks for contacting us, we will get back to you shortly." is displayed
