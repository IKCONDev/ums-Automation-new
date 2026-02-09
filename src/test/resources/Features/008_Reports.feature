Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Reports Page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then user checks the Meeting Reports page
    Then user checks the Actionitem Reports page
    Then user checks the Task Reports page
    Then user checks the Risk Reports page

    Examples: 
      | url                          | Username              | Password |
      | https://129.80.90.99/#/login | umstest@ikcontech.com | Test@123 |
