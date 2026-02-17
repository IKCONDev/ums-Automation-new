Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Teams page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then validate the teams page
    Then add the team "<Team>" "<Teamlead>" "<Teamhead>" "<Teamdept>"

    #Then validate the added team "<Team>"
    #Then update the team "<Team>"
    #Then validate the updated team "<Team>"
    #Then delete the team "<Team>"
    Examples: 
      | url                               | Username               | Password | Team      | Teamlead    | Teamhead    | Teamdept               |
      | https://ikn.ikcontech.com/#/login | ums-test@ikcontech.com | Test@123 | solution  | Praveen     | Praveen     | Information Technology |
      | https://icn.ikcontech.com/#/login | pa@ikcontech.com       | Test@123 | kjhgfdion | Pascal Paul | Pascal Paul | Dev                    |
