Feature: Multiple window page scenarios

  Background:
    Given I click nav button "Multiple-window"

  @US9001
  Scenario: Verify link buttons are enabled
    Then Verify "Launch TLA" is enabled
    Then Verify "Launch Google" is enabled
    Then Verify "Launch Facebook" is enabled

  @US9001b
  Scenario: Verify link buttons are enabled with Data Table
    Then Verify following buttons are enabled
      | Launch TLA      |
      | Launch Google   |
      | Launch Facebook |