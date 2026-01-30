Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Programs Page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then user Validates the Programs page
    Then user Add Programs in the Programs page "<PN>" "<PC>" "<PD>"
    Then user Validate the AddedPrograms in programs page "<PN>" "<PC>" "<PD>"
    Then user Update the Programs in programs page "<PN>" "<PC>" "<PD>"
    Then user Validate the Updated Program in programs page "<PN>" "<PC>" "<PD>"
    Then user delete the Program in programs page "<PN>"

    Examples: 
      | url                          | Username              | Password | PN       | PC    | PD                  |
      | https://129.80.90.99/#/login | umstest@ikcontech.com | Test@123 | uytiuygf | DG001 | Dignity description |
