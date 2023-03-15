Feature: Pop-Up page scenarios
  Background: Navigating to Pop-Up page
    When I click nav button "Pop-Up"

  @US801
  Scenario: Verify "New Message" header is displayed when user clicks on "Message" button
    And I click a button "Message"
    Then Verify header text of pop up window is "New message"

  @US802
  Scenario: Verify "BMI Calculator" header is displayed when user clicks on “BMI Calculator” button
    And I click a button "BMI Calculator"
    Then Verify header text of pop up window is "BMI Calculator"