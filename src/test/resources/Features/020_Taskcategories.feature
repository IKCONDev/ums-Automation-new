Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Task Category page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then Validate the task category page
    Then add the category "<CN>"
    Then validate the added task category "<CN>"
    Then update the category "<CN>"
    Then validate the updated task category "<CN>"
    Then Delete the category "<CN>"

    Examples: 
      | url                          | Username              | Password | CN        |
      | https://129.80.90.99/#/login | umstest@ikcontech.com | Test@123 | jhwerhcvj |
