Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Roles page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then validate the roles page
    Then add the role "<RN>" "<PN>"
    Then Validate the added role data "<RN>" "<CB>"
    Then Update the role "<RN>" "<PN>"
    Then Validate the Updated role data "<RN>" "<CB>"
    Then Delete the role "<RN>"
    Then validate the Logout page

    Examples: 
      | url                               | Username               | Password | RN      | PN   | CB          |
      | https://ikn.ikcontech.com/#/login | ums-test@ikcontech.com | Test@123 | SYNERGY | View | UMS TEST    |
      | https://icn.ikcontech.com/#/login | pa@ikcontech.com       | Test@123 | ENERGY  | View | Pascal paul |
