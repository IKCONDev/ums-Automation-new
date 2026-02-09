Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Users page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then validate the users page
    Then add the user "<RN>" "<Email>"
    Then validate the added user "<RN>" "<Email>"
    Then update the user "<URN>" "<Email>"
    Then validate the updated user "<URN>" "<Email>"

    Examples: 
      | url                          | Username              | Password | RN    | Email                    | URN         |
      | https://129.80.90.99/#/login | umstest@ikcontech.com | Test@123 | ADMIN | amarlokesh@ikcontech.com | TEAM_MEMBER |
