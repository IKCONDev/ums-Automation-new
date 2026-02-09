Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Meetings Page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then user clicks and validates the meetings page
    Then user enters the meeting details in create meeting "<MT>" "<UN>"
    Then user adds project and programs under meeting "<MT>"
    Then user enters Actionitems tasks and risks undermeeting "<MT>" "<AT>" "<AD>" "<TT>" "<TD>" "<RT>" "<RD>"

    #Then user clicks edit column in meetings page
    #Then user clicks filter in meetings page "<MID>"
    #Then user check the meeting details page "<MT>"
    Examples: 
      | url                          | Username              | Password | MT          | UN              | MID  | AT            | AD                   | TT      | TD                 | RT      | RD                 |
      | https://129.80.90.99/#/login | umstest@ikcontech.com | Test@123 | twelveweeks | Venkatesh Udaru | 1942 | Actionitem206 | Actiondescription206 | Task206 | Taskdescription206 | Risk206 | Riskdescription206 |
  #Scenario Outline: Scheduled Meetings
    #Then user check the scheduled meetings
