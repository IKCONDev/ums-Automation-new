Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Projects Page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then user Validate the projects page
    Then user Add project in the projects page "<PN>" "<PC>" "<PD>"
    Then user validate the added project in projects page "<PN>" "<PC>" "<PD>"
    Then user update the project in projects page "<PN>" "<PC>" "<PD>"
    Then user validate the updated project in projects page "<PN>" "<PC>" "<PD>"
    Then user delete the project in projects page "<PN>"

    Examples: 
      | url                          | Username              | Password | PN      | PC    | PD                   |
      | https://129.80.90.99/#/login | umstest@ikcontech.com | Test@123 | working | TH001 | Together description |
