Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Actionitems Category page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then Validate the actionitem category page
    Then add the actionitem category "<ACN>"
    Then validate the added actionitem category "<ACN>"
    Then update the actionitem category "<ACN>"
    Then validate the updated actionitem category "<ACN>"
    Then Delete the actionitem category "<ACN>"

    Examples: 
      | url                          | Username              | Password | ACN   |
      | https://129.80.90.99/#/login | umstest@ikcontech.com | Test@123 | kjkjj |
