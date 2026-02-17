Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Programs Page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then user Validates the Programs page
    Then user Add Programs in the Programs page "<PN>" "<PC>" "<PD>" "<PROGOWNR>"
    Then user Validate the AddedPrograms in programs page "<PN>" "<PC>" "<PD>" "<PROGOWNR>" "<CB>"
    Then user Update the Programs in programs page "<PN>" "<PC>" "<PD>" "<PROGOWNR>"
    Then user Validate the Updated Program in programs page "<PN>" "<PC>" "<PD>" "<PROGOWNR>" "<CB>"
    Then user delete the Program in programs page "<PN>"

    Examples: 
      | url                               | Username               | Password | PN       | PC    | PD                    | PROGOWNR    | CB          |
      | https://ikn.ikcontech.com/#/login | ums-test@ikcontech.com | Test@123 | uytiuygf | DG001 | Dignity description   | UMS TEST    | UMS TEST    |
      | https://icn.ikcontech.com/#/login | pa@ikcontech.com       | Test@123 | dfghgfd  | DG001 | Deertnity description | Pascal Paul | Pascal Paul |
