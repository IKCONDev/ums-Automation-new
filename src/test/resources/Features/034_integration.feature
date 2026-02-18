Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Integration page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then Validate the Integration page
    Then Configure the Microsoft teams in teams tool Integration page "<MSTenantID>" "<MSClientID>" "<MSClientsecret>"
    Then Configure the Googlemeet in tool Integration page "<GmeetClientID>" "<GmeetClientsecret>" "<GmeetRefreshtoken>"
    Then Configure the Zoom in tool Integration page "<ZoomAccountID>" "<ZoomClientID>" "<ZoomClientsecret>"
    Then Configure the webex in tool Integration page "<WebexClientID>" "<WebexClientSecret>" "<Webextoken>" "<WebexRefreshtoken>" "<webexrefreshtokenexpire>"

    Examples: 
      | url                               | Username               | Password | MSTenantID | MSClientID | MSClientsecret | GmeetClientID | GmeetClientsecret | GmeetRefreshtoken | ZoomAccountID | ZoomClientID | ZoomClientsecret | WebexClientID | WebexClientSecret | Webextoken | WebexRefreshtoken | webexrefreshtokenexpire |
      | https://ikn.ikcontech.com/#/login | ums-test@ikcontech.com | Test@123 | sdfg       | jhgf       | kjhgf          | dfghj         | jhgfgh            | kjhghjk           | dfgh          | jhg          | kjhg             | dfghj         | uyttjh            | kjhgfdfg   | kjhgfghjh         |                      99 |
      #| https://icn.ikcontech.com/#/login | pa@ikcontech.com       | Test@123 |
