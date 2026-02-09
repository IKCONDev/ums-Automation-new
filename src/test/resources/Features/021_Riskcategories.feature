Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Risk Category page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then Validate the risk category page
    Then Add the Riskcategory "<s1>"
    Then Validate the added risk category "<s1>"
    Then Update the risk cateory "<s1>"
    Then Validate the updated risk category "<s1>"
    Then Delete the Risk categories "<s1>"

    Examples: 
      | url                          | Username              | Password | s1        |
      | https://129.80.90.99/#/login | umstest@ikcontech.com | Test@123 | Coalition |
