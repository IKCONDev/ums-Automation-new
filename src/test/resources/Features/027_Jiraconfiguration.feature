Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Jira Configuration page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then validate the Jira Integration page

    Examples: 
      | url                               | Username                      | Password |
      | https://ikn.ikcontech.com/#/login | ums-test@ikcontech.com        | Test@123 |
      | https://icn.ikcontech.com/#/login | venkatesh.udaru@ikcontech.com | Test@123 |
