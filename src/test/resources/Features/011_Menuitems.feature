Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Menuitems page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then Validate the menu items page
    And Add menu items "<Menuitem>"
    Then validate the added menu items "<Menuitem>" "<CB>"
    Then Update the menu item "<Menuitem>"
    Then validate the updated menu items "<Menuitem>" "<CB>"
    Then Delete the Menu item "<Menuitem>"
    Then validate the Logout page

    Examples: 
      | url                               | Username               | Password | Menuitem | CB          |
      | https://ikn.ikcontech.com/#/login | ums-test@ikcontech.com | Test@123 | innovate | UMS TEST    |
      | https://icn.ikcontech.com/#/login | pa@ikcontech.com       | Test@123 | automate | Pascal paul |
