Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Designations page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then validate the designations page
    Then add the designation "<DSN>"
    Then validate the added designation "<DSN>"
    Then update the designation "<DSN>"
    Then validate the updated designation "<DSN>"
    Then delete the designation "<DSN>"

    Examples: 
      | url                          | Username              | Password | DSN   |
      | https://129.80.90.99/#/login | umstest@ikcontech.com | Test@123 | Unity |
