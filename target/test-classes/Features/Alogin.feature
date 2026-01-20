Feature: UMS

  @tag1
  Scenario Outline: Login page
    Given user is Navigate Login page
    When user is validate Login page "<Username>" "<Password>"

    Examples: 
      | Username               | Password  |
      | ums-test@ikcontech.com | Test@1234 |
