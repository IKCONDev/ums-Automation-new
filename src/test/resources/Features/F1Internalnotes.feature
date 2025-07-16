Feature: UMS

  @tag1
  Scenario Outline: Internal notes page
    Then Validate the Internal notes page
    Then add the Internalnotes page "<IN>"

    #Then Validate the added internal notes "<IN>"
    #Then Update the internal notes "<IN>"
    #Then Validate the Updated internal notes "<IN>"
    #Then Delete the internal notes "<IN>"
    #Then Edit column in internal notes
    #
    Examples: 
      | IN            |
      | SeventeenNote |
