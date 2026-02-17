Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Rolemenuitems page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then Validate Role Menu Items
    And add the Role Menu Items "<Role>"
    Then validate the Logout page

    Examples: 
      | url                               | Username               | Password | Role    |
      | https://ikn.ikcontech.com/#/login | ums-test@ikcontech.com | Test@123 | SYNERGY |
      | https://icn.ikcontech.com/#/login | pa@ikcontech.com       | Test@123 | ENERGY  |
