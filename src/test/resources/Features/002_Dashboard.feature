Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Dashboard Page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then user checks the My dashboard page
    Then user checks the Team Dashboard page
    Then user checks the Department Dashboard page
    Then user checks the Exective Dashboard page

    Examples: 
      | url                          | Username              | Password |
      | https://129.80.90.99/#/login | umstest@ikcontech.com | Test@123 |
