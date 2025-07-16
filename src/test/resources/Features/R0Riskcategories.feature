Feature: UMS

  @tag1
  Scenario Outline: Risk Category page
    Then Validate the risk category page
    Then Add the Riskcategory "<s1>"

    #Then Validate the added risk category "<s1>"
    #
    #Then Update the risk cateory "<s1>"
    #Then Validate the updated risk category "<s1>"
    #Then Delete the Risk categories "<s1>"
    Examples: 
      | s1    |
      | Union |
