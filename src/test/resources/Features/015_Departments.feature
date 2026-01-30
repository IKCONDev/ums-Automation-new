Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Departments page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then Validate the departments page
    Then add the department "<DN>" "<FN>" "<DC>" "<DL>"
    Then validate the added department  "<DN>" "<FN>" "<DC>" "<DL>"
    Then update the department "<DN>" "<FN>" "<DC>" "<DL>"
    Then validate the updated department  "<DN>" "<FN>" "<DC>" "<DL>"
    Then delete the department "<DN>"

    Examples: 
      | url                          | Username              | Password | DN      | FN          | DC    | DL        |
      | https://129.80.90.99/#/login | umstest@ikcontech.com | Test@123 | Harmony | Vinod Kethu | Al001 | Hyderabad |
