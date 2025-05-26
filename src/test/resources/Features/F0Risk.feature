Feature: UMS

  @tag2
  Scenario Outline: Risk Page
    Then user validates risks page
    Then user add risks page "<RT>" "<RD>"
    Then user update risks page "<RT>" "<RD>"
    Then user delete risks page "<RT>"
    Then user checks the risk details "<RT>" "<RD>"
    Then user checks edit columns in risk page
    Then user checks the risk filters "<RT>"

    Examples: 
      | RT     | RD                |
      | risk76 | riskdescription76 |
