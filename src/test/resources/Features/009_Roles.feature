Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Roles page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then validate the roles page
    Then add the role "<RN>" "<PN>"
    Then Validate the added role data "<RN>"
    Then Update the role "<RN>" "<PN>"
    Then Validate the Updated role data "<RN>"
    Then Delete the role "<RN>"

    Examples: 
      | url                          | Username              | Password | RN      | PN   |
      | https://129.80.90.99/#/login | umstest@ikcontech.com | Test@123 | SYNERGY | View |
