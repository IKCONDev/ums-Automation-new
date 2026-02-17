Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Teams page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then validate the teams page
    Then add the team "<Team>" "<Teamcode>" "<Teamdept>" "<Teamlead>" "<Teamhead>"
    Then validate the added team "<Team>" "<Teamcode>" "<Teamdept>" "<Teamlead>" "<Teamhead>" "<CB>"
    Then update the team "<Team>" "<Teamcode>" "<Teamdept>" "<Teamlead>" "<Teamhead"
    Then validate the updated team "<Team>" "<Teamcode>" "<Teamdept>" "<Teamlead>" "<Teamhead>" "<CB>"
    Then delete the team "<Team>"
    Then validate the Logout page

    Examples: 
      | url                               | Username               | Password | Team     | Teamlead | Teamhead | Teamdept               | Teamcode | CB       |
      | https://ikn.ikcontech.com/#/login | ums-test@ikcontech.com | Test@123 | Solution | Praveen  | Praveen  | Information Technology | dfgh     | UMS TEST |
