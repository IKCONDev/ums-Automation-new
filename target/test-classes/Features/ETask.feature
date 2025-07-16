Feature: UMS

  @tag2
  Scenario Outline: Task Page
    Then user validates the task page "<TT>"

    #Then user updates the task page "<TT>"
    #Then user deletes the task page "<TT>"
    #Then user clicks editcolumn in the task page
    #Then user clicks filter in the task page "<TT>"
    #
    Examples: 
      | TT     |
      | Task21 |
