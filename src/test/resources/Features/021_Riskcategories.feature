Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Risk Category page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then Validate the risk category page
    Then Add the Riskcategory "<s1>" "<Dept>"
    Then Validate the added risk category "<s1>" "<Dept>" "<CB>"
    Then Update the risk cateory "<s1>"
    Then Validate the updated risk category "<s1>" "<Dept>" "<CB>"
    Then Delete the Risk categories "<s1>"
    Then validate the Logout page

    Examples: 
      | url                              | Username               | Password | s1        | Dept                   | CB          |
      | https://ikn.ikcontech.com#/login | ums-test@ikcontech.com | Test@123 | Coalition | Information Technology | UMS TEST    |
      | https://icn.ikcontech.com#/login | pa@ikcontech.com       | Test@123 | violation | QA                     | Pascal Paul |
