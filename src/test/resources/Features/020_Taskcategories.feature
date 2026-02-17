Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Task Category page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then Validate the task category page
    Then add the category "<CN>" "<Dept>"
    Then validate the added task category "<CN>" "<Dept>" "<CB>"
    Then update the category "<CN>" "<Dept>"
    Then validate the updated task category "<CN>" "<Dept>" "<CB>"
    Then Delete the category "<CN>"
    Then validate the Logout page

    Examples: 
      | url                              | Username               | Password | CN           | Dept                   | CB          |
      | https://ikn.ikcontech.com#/login | ums-test@ikcontech.com | Test@123 | jhwerhcvjhfj | Information Technology | UMS TEST    |
      | https://icn.ikcontech.com#/login | pa@ikcontech.com       | Test@123 | jhfgjkjhkjgh | HR                     | Pascal paul |
