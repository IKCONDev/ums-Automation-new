Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Created by Risks Page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then user validates risks page
    Then user add risks page "<RT>" "<RD>"
    Then user validate the added risk "<RT>"

    #Then user update risks page "<RT>" "<RD>"
    #Then user validate the updated risk in risks page "<RT>" "<RD>"
    #Then user delete risks page "<RT>"
    #Then user checks the risk details "<RT>" "<RD>"
    #Then user checks edit columns in risk page
    #Then user checks the risk filters "<RT>"
    Examples: 
      | url                               | Username               | Password | RT                          | RD               |
      | https://ikn.ikcontech.com/#/login | ums-test@ikcontech.com | Test@123 | Hardware or system failures | riskkjhgfdsdf314 |
#@smoke @sanity @regression
  #Scenario Outline: All Risks Page
    #Then user navigates to all risks page
    #Then user add risks page "<RT>" "<RD>"
    #Then user validate the added risk "<RT>"
    #Then user update risks page "<RT>" "<RD>"
    #Then user validate the updated risk in risks page "<RT>" "<RD>"
    #Then user delete risks page "<RT>"
#
    #Then user checks the risk details "<RT>" "<RD>"
    #Then user checks edit columns in risk page
    #Then user checks the risk filters "<RT>"
    #Examples: 
      #| RT                                    | RD               |
      #| Software bugs or poor code deployment | riskkjhgfdsdf315 |
#@smoke @sanity @regression
  #Scenario Outline: My Risks Page
    #Then user navigates to my risks page
    #Then user add risks page "<RT>" "<RD>"
    #Then user validate the added risk "<RT>"
    #Then user update risks page "<RT>" "<RD>"
    #Then user validate the updated risk in risks page "<RT>" "<RD>"
    #Then user delete risks page "<RT>"
#
    #Then user checks the risk details "<RT>" "<RD>"
    #Then user checks edit columns in risk page
    #Then user checks the risk filters "<RT>"
    #Examples: 
      #| RT                           | RD               |
      #| Inadequate change management | riskkjhgfdsdf308 |
#@smoke @sanity @regression
  #Scenario Outline: Assigned to Risks Page
    #Then user navigates to Assignedto risks page
    #Then user add risks page "<RT>" "<RD>"
    #Then user validate the added risk "<RT>"
    #Then user update risks page "<RT>" "<RD>"
    #Then user validate the updated risk in risks page "<RT>" "<RD>"
    #Then user delete risks page "<RT>"
#
    #Then user checks the risk details "<RT>" "<RD>"
    #Then user checks edit columns in risk page
    #Then user checks the risk filters "<RT>"
    #Examples: 
      #| RT                                     | RD               |
      #| Downtime impacting business continuity | riskkjhgfdsdf308 |
