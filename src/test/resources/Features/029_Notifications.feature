Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Notifications page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then Validate the Notifications page

    Examples: 
      | url                          | Username              | Password |
      | https://129.80.90.99/#/login | umstest@ikcontech.com | Test@123 |
