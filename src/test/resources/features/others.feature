Feature: Others page scenarios

  @smoke @regression
  Scenario: Verify Disabled button is disabled initially
    Given I navigate to homepage
    When I open Others page
    Then Verify Disabled button is disabled

    Scenario: Verify Disabled buttons changed on click
      Given I navigate to homepage
      When I open Others page
      Then Verify Disabled button is disabled
      When I click on Toggle button
      Then Verify Disabled button is enabled