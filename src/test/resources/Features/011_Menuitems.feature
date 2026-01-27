Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Menuitems page
    Then Validate the menu items page
    And Add menu items "<Menuitem>"
    Then validate the added menu items "<Menuitem>"
    Then Update the menu item "<Menuitem>"
    Then validate the updated menu items "<Menuitem>"
    Then Delete the Menu item "<Menuitem>"

    Examples: 
      | Menuitem |
      | innovate |
