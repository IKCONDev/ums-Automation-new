Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Login page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"

    Examples: 
      | url                          | Username             | Password |
      | https://129.80.90.99/#/login | bharat@ikcontech.com | Test@123 |
      | https://129.80.90.99/#/login | bharat@ikcontech.com | Test@123 |
      | https://129.80.90.99/#/login | bharat@ikcontech.com | Test@123 |
      | https://129.80.90.99/#/login | bharat@ikcontech.com | Test@123 |
