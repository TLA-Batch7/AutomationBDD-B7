Feature: Homepage scenarios

 @HomeScenarios @US1021
  Scenario:Test Header
    Then I should see header as "Automation with Selenium"

   @US1022
   Scenario: Verify nav buttons are displayed
     Then Verify button "Home" is displayed
     Then Verify button "Calendar" is displayed
     Then Verify button "User-Mgt" is displayed
     Then Verify button "Others" is displayed
     Then Verify button "Tables" is displayed