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

    Examples: 
      | url                          | Username              | Password | s1   |
      | https://129.80.90.99/#/login | umstest@ikcontech.com | Test@123 | Tech |
