Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Projects Page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then user Validate the projects page
    Then user Add project in the projects page "<PN>" "<PC>" "<PD>" "<PROGNAME>" "<PROJOWN>"
    Then user validate the added project in projects page "<PN>" "<PC>" "<PD>" "<PROGNAME>" "<PROJOWN>" "<CB>"
    Then user update the project in projects page "<PN>" "<PC>" "<PD>"
    Then user validate the updated project in projects page "<PN>" "<PC>" "<PD>" "<PROGNAME>" "<PROJOWN>" "<CB>"
    Then user delete the project in projects page "<PN>"

    Examples: 
      | url                               | Username               | Password | PN      | PC    | PD                   | PROGNAME | PROJOWN     |
      | https://ikn.ikcontech.com/#/login | ums-test@ikcontech.com | Test@123 | working | TH001 | Together description | IKCON    | UMS TEST    |
      | https://icn.ikcontech.com/#/login | pa@ikcontech.com       | Test@123 | Sinking | TH001 | sinikng description  | Unity    | Pascal Paul |
