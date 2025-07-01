Feature: UMS

  @tag1
  Scenario Outline: Designations page
    Then validate the designations page
    Then add the designation "<DSN>"
    Then validate the added designation "<DSN>"
    #Then update the designation "<DSN>"
    #Then validate the updated designation "<DSN>"
    #Then delete the designation "<DSN>"
#
    Examples: 
      | DSN   |
      | Unity |
