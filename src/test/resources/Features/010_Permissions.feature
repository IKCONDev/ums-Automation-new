Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Permission page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then Validate the Permissions page
    Then Add the Permissions "<s1>"
    Then Validate the added permission data "<s1>"
    Then Update the Permissions "<s1>"
    Then Validate the Updated permission data "<s1>"
    Then Delete the Permissions "<s1>"
    Then validate the Logout page

    Examples: 
      | url                               | Username               | Password | s1         |
      | https://ikn.ikcontech.com/#/login | ums-test@ikcontech.com | Test@123 | Technology |
      | https://icn.ikcontech.com/#/login | pa@ikcontech.com       | Test@123 | Think      |
