Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Assignmenuitems page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    And Validate the Assign MenuItems Permisisons page
    Then add the Assign MenuItems Permisisons
    Then Update the Assign MenuItems Permisisons

    Examples: 
      | url                          | Username              | Password |
      | https://129.80.90.99/#/login | umstest@ikcontech.com | Test@123 |
