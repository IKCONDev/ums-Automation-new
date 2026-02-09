Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Menuitems page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then Validate the menu items page
    And Add menu items "<Menuitem>"
    Then validate the added menu items "<Menuitem>"
    Then Update the menu item "<Menuitem>"
    Then validate the updated menu items "<Menuitem>"
    Then Delete the Menu item "<Menuitem>"

    Examples: 
      | url                          | Username              | Password | Menuitem |
      | https://129.80.90.99/#/login | umstest@ikcontech.com | Test@123 | innovate |
