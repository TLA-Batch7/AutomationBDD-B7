Feature: Select Class page scenarios

  Background:
    Given I click nav button "Select-class"

  @6021
  Scenario: Verify when I select numbers from the options it will display as expected
    When I select option "One" in section "Select a single option"
    Then Displayed text should be "You selected: One" under "Select a single option" section

  @6022
  Scenario: Verify when I select colors from the options it will display as expected
    When I select option "Yellow" in section "Select a single option 2"
    Then Displayed text should be "You selected: Yellow" under "Select a single option 2" section