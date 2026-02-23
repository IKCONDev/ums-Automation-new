Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Internal notes page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then Validate the Internal notes page
    Then add the Internalnotes page "<IN>" "<Rwr>" "<Apr>"
    Then Validate the added internal notes "<IN>" "<CB>"
    Then Update the internal notes "<IN>"
    Then Validate the Updated internal notes "<IN>" "<CB>"
    Then Delete the internal notes "<IN>"
    Then Edit column in internal notes

    Examples: 
      | url                               | Username         | Password | IN      | Rwr         | Apr         | CB          |
      #| https://ikn.ikcontech.com/#/login | ums-test@ikcontech.com | Test@123 | USANote | Ums Test | Ums Test | Ums Test |
      | https://icn.ikcontech.com/#/login | pa@ikcontech.com | Test@123 | AusNote | Pascal Paul | Pascal Paul | Pascal Paul |
