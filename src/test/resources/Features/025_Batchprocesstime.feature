Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Batch Process Time
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    And Validate the Batch process page
    Then validate the Logout page

    Examples: 
      | url                               | Username               | Password |
      | https://ikn.ikcontech.com/#/login | ums-test@ikcontech.com | Test@123 |
      | https://icn.ikcontech.com/#/login | pa@ikcontech.com       | Test@123 |
