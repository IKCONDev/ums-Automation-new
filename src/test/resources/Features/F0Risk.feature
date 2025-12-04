Feature: UMS

  @tag2
  Scenario Outline: Created by Risks Page
    Then user validates risks page
    Then user add risks page "<RT>" "<RD>"
    Then user validate the added risk "<RT>"
    Then user update risks page "<RT>" "<RD>"
    Then user validate the updated risk in risks page "<RT>" "<RD>"
    Then user delete risks page "<RT>"

    #Then user checks the risk details "<RT>" "<RD>"
    #Then user checks edit columns in risk page
    #Then user checks the risk filters "<RT>"
    Examples: 
      | RT            | RD               |
      | Materialistic | riskkjhgfdsdf314 |

  Scenario Outline: All Risks Page
    Then user navigates to all risks page
    Then user add risks page "<RT>" "<RD>"
    Then user validate the added risk "<RT>"
    Then user update risks page "<RT>" "<RD>"
    Then user validate the updated risk in risks page "<RT>" "<RD>"
    Then user delete risks page "<RT>"

    #Then user checks the risk details "<RT>" "<RD>"
    #Then user checks edit columns in risk page
    #Then user checks the risk filters "<RT>"
    Examples: 
      | RT            | RD               |
      | optimisticdfd | riskkjhgfdsdf315 |

  Scenario Outline: My Risks Page
    Then user navigates to my risks page
    Then user add risks page "<RT>" "<RD>"
    Then user validate the added risk "<RT>"
    Then user update risks page "<RT>" "<RD>"
    Then user validate the updated risk in risks page "<RT>" "<RD>"
    Then user delete risks page "<RT>"

    #Then user checks the risk details "<RT>" "<RD>"
    #Then user checks edit columns in risk page
    #Then user checks the risk filters "<RT>"
    Examples: 
      | RT            | RD               |
      | passsivevoice | riskkjhgfdsdf308 |

  Scenario Outline: Assigned to Risks Page
    Then user navigates to Assignedto risks page
    Then user add risks page "<RT>" "<RD>"
    Then user validate the added risk "<RT>"
    Then user update risks page "<RT>" "<RD>"
    Then user validate the updated risk in risks page "<RT>" "<RD>"
    Then user delete risks page "<RT>"

    #Then user checks the risk details "<RT>" "<RD>"
    #Then user checks edit columns in risk page
    #Then user checks the risk filters "<RT>"
    Examples: 
      | RT             | RD               |
      | Activevoicefnb | riskkjhgfdsdf308 |
