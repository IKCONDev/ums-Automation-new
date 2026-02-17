Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Designations page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then validate the designations page
    Then add the designation "<DSN>"
    Then validate the added designation "<DSN>" "<CB>"
    Then update the designation "<DSN>"
    Then validate the updated designation "<DSN>" "<CB>"
    Then delete the designation "<DSN>"
    Then validate the Logout page

    Examples: 
      | url                               | Username               | Password | DSN     | CB          |
      | https://ikn.ikcontech.com/#/login | ums-test@ikcontech.com | Test@123 | Unity   | UMS TEST    |
      | https://icn.ikcontech.com/#/login | pa@ikcontech.com       | Test@123 | Density | Pascal paul |
