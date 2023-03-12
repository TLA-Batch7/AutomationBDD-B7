Feature: Others page scenarios

  @smoke @regression @US2001 @otherScenario
  Scenario: Verify Disabled button is disabled initially
    When I click nav button "Others"
    Then Verify Disabled button is disabled

    @US2002 @othersScenario
    Scenario: Verify Disabled buttons changed on click
      When I click nav button "Others"
      Then Verify Disabled button is disabled
      When I click on Toggle button
      Then Verify Disabled button is enabled