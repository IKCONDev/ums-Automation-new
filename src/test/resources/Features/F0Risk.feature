Feature: UMS

  @tag2
  Scenario Outline: Risk Page
    Then user validates risks page
    Then user add risks page "<RT>" "<RD>"
    Then user update risks page "<RT>" "<RD>"
    Then user delete risks page "<RT>"

    Examples: 
      | RT     | RD                |
      | risk40 | riskdescription40 |
