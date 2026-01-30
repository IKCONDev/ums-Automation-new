Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Company details
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then validate the company details page
    Then add the company details
    Then update the company details

    Examples: 
      | url                          | Username              | Password |
      | https://129.80.90.99/#/login | umstest@ikcontech.com | Test@123 |
