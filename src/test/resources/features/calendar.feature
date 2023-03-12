Feature: Calendar page scenarios

  @smoke @US1015
  Scenario: Choosing date from calendar
    When I click nav button "Calendar"
    And I click a button "endDateInput"
    And I click a button "calendarTomorrowDate"
    And I click a button "submitCalendarButton"
    Then Verify text will display 1 day difference

    @regression @US1016
    Scenario: Choosing date from the calendar - Start date test
      When I click nav button "Calendar"
      * I click a button "endDateInput"
      * I click a button "calendarTomorrowDate"
      * I click a button "submitCalendarButton"
      Then Verify text contains current date

