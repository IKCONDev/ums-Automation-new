Feature: UMS

  @tag1
  Scenario Outline: Actionitems Category page
    Then Validate the actionitem category page
    Then add the actionitem category "<ACN>"
    Then validate the added actionitem category "<ACN>"
    Then update the actionitem category "<ACN>"
    Then validate the updated actionitem category "<ACN>"
    Then Delete the actionitem category "<ACN>"

    Examples: 
      | ACN       |
      | jhgfdfghj |
