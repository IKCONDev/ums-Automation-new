Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Rolemenuitems page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then Validate Role Menu Items
    And add the Role Menu Items "<Role>"

    Examples: 
      | url                          | Username              | Password | Role    |
      | https://129.80.90.99/#/login | umstest@ikcontech.com | Test@123 | SYNERGY |
