Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: CopilotProcessing page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then validate the copilot processing page
    Then validate the Logout page

    Examples: 
      | url                               | Username               | Password |
      | https://ikn.ikcontech.com/#/login | ums-test@ikcontech.com | Test@123 |
      | https://icn.ikcontech.com/#/login | pa@ikcontech.com       | Test@123 |
