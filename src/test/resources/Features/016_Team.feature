Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Teams page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then validate the teams page
    Then add the team "<Team>"
    Then validate the added team "<Team>"
    Then update the team "<Team>"
    Then validate the updated team "<Team>"
    Then delete the team "<Team>"

    Examples: 
      | url                          | Username              | Password | Team     |
      | https://129.80.90.99/#/login | umstest@ikcontech.com | Test@123 | solution |
