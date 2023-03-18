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

  @US1022b
  Scenario Outline: Test nav buttons are displayed with scenario outline
    Then Verify button "<button name>" is displayed
    Examples:
      | button name |
      | Home        |
      | Calendar    |
      | User-Mgt    |
      | Others      |
      | Tables      |
      | Inputs      |

  @US1023
  Scenario Outline: Verify practice website destination url
    When I click link text "<linkText>"
    Then Verify destination window has url as "<URL>"
    Examples:
      | linkText            | URL                                                |
      | PHP Travels         | https://phptravels.com/demo/                       |
      | Mercury tours       | http://newtours.demoaut.com/                       |
      | Internet            | http://the-internet.herokuapp.com/                 |
      | E-commerce          | http://automationpractice.com/index.php            |
      | Passion Tea Company | http://www.practiceselenium.com/                   |
      | Saucedemo           | http://www.saucedemo.com/                          |
      | Shopping Cart       | https://react-shopping-cart-67954.firebaseapp.com/ |

