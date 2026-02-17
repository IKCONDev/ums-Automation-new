Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Login page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"

    Examples: 
      | url                               | Username              | Password |
      | https://ikn.ikcontech.com/#/login | umstest@ikcontech.com | Test@123 |
