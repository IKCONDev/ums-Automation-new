Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Actionitems Category page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then Validate the actionitem category page
    Then add the actionitem category "<ACN>" "<Dept>"
    Then validate the added actionitem category "<ACN>" "<Dept>" "<CB>"
    Then update the actionitem category "<ACN>" "<Dept>"
    Then validate the updated actionitem category "<ACN>" "<Dept>" "<CB>"
    Then Delete the actionitem category "<ACN>"
    Then validate the Logout page

    Examples: 
      | url                               | Username               | Password | ACN           | Dept                   | CB          |
      | https://ikn.ikcontech.com/#/login | ums-test@ikcontech.com | Test@123 | kjkjjhgfghjhj | Information Technology | UMS TEST    |
      | https://icn.ikcontech.com/#/login | pa@ikcontech.com       | Test@123 | jhgfdfghjkj   | HR                     | Pascal paul |
