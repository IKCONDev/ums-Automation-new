Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Internal notes page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then Validate the Internal notes page
    Then add the Internalnotes page "<IN>"
    Then Validate the added internal notes "<IN>"
    Then Update the internal notes "<IN>"
    Then Validate the Updated internal notes "<IN>"
    Then Delete the internal notes "<IN>"
    Then Edit column in internal notes

    Examples: 
      | url                          | Username              | Password | IN           |
      | https://129.80.90.99/#/login | umstest@ikcontech.com | Test@123 | EighteenNote |
