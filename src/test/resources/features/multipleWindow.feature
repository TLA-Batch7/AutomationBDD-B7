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

    @US9001c
    Scenario Outline: Verify social media buttons are enabled using scenario outline
      Then Verify "<button>" is enabled
      Examples:
      |button|
      | Launch TLA      |
      | Launch Google   |
      | Launch Facebook |