Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Departments page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then Validate the departments page
    Then add the department "<DN>" "<FN>" "<DC>" "<DL>"
    Then validate the added department  "<DN>" "<FN>" "<DC>" "<DL>" "<CB>"
    Then update the department "<DN>" "<FN>" "<DC>" "<DL>"
    Then validate the updated department  "<DN>" "<FN>" "<DC>" "<DL>" "<CB>"
    Then delete the department "<DN>"

    Examples: 
      | url                               | Username               | Password | DN       | FN            | DC     | DL           | CB          |
      | https://ikn.ikcontech.com/#/login | ums-test@ikcontech.com | Test@123 | Harmony  | Praveen Reddy | Al001  | Hyderabad    | UMS TEST    |
      | https://icn.ikcontech.com/#/login | pa@ikcontech.com       | Test@123 | Ceremony | Pascal paul   | A98761 | Unitedstates | Pascal paul |
