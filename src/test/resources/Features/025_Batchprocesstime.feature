Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Batch Process Time
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    And Validate the Batch process page

    Examples: 
      | url                          | Username              | Password |
      | https://129.80.90.99/#/login | umstest@ikcontech.com | Test@123 |
