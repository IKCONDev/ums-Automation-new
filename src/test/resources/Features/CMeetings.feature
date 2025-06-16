Feature: UMS

  @tag2
  Scenario Outline: Meetings Page
    Then user clicks and validates the meetings page
    Then user enters the meeting details in create meeting "<MT>" "<UN>"
    Then user adds project and programs under meeting "<MT>"
    Then user enters Actionitems tasks and risks undermeeting "<MT>" "<AT>" "<AD>" "<TT>" "<TD>" "<RT>" "<RD>"
    Then user clicks edit column in meetings page

    #Then user clicks filter in meetings page "<MID>"
    #Then user check the meeting details page "<MT>"
    Examples: 
      | MT          | UN              | MID  | AT            | AD                   | TT      | TD                 | RT      | RD                 |
      | Elevenweeks | Venkatesh Udaru | 1942 | Actionitem204 | Actiondescription204 | Task204 | Taskdescription204 | Risk204 | Riskdescription204 |
