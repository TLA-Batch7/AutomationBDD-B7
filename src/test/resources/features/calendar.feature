Feature: Calendar page scenarios

  @smoke
  Scenario: Choosing date from calendar
    Given I navigate to homepage
    When I click nav button "Calendar"
    And I click a button "endDateInput"
    And I click a button "calendarTomorrowDate"
    And I click a button "submitCalendarButton"
    Then Verify text will display 1 day difference

    @regression
    Scenario: Choosing date from the calendar - Start date test
      Given I navigate to homepage
      When I click nav button "Calendar"
      * I click a button "endDateInput"
      * I click a button "calendarTomorrowDate"
      * I click a button "submitCalendarButton"
      Then Verify text contains current date

