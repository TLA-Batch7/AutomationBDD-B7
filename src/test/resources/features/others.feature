Feature: Others page scenarios

  @smoke @regression
  Scenario: Verify Disabled button is disabled initially
    When I open Others page
    Then Verify Disabled button is disabled

    Scenario: Verify Disabled buttons changed on click
      When I open Others page
      Then Verify Disabled button is disabled
      When I click on Toggle button
      Then Verify Disabled button is enabled