Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: All Task Page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then user validates the task page "<TT>"
    Then user updates the task page "<TT>"
    Then user deletes the task page "<TT>"
    Then user clicks editcolumn in the task page
    Then user clicks DueToday in the task page
    Then user clicks OverDue in the task page
    Then user clicks Upcoming in the task page
    Then user clicks Duefilters in the task page
    Then user clicks fortyeight in the task page

    Examples: 
      | url                          | Username              | Password | TT         |
      | https://129.80.90.99/#/login | umstest@ikcontech.com | Test@123 | invitation |
#@smoke @sanity @regression
    #Then user clicks dropdown in the task page
    #Then user clicks Mytasks in the task page
    #Then user clicks filter in the task page "<TT>"
    #Examples: 
      #| TT         |
      #| invitation |
#@smoke @sanity @regression
  #Scenario Outline: My Task Page
    #Then user clicks dropdown in the task page
    #Then user clicks Mytasks in the task page
    #Then user validates the task page "<TT>"
    #Then user updates the task page "<TT>"
    #Then user deletes the task page "<TT>"
    #Then user clicks editcolumn in the task page
    #Then user clicks DueToday in the task page
    #Then user clicks OverDue in the task page
    #Then user clicks Upcoming in the task page
    #Then user clicks Duefilters in the task page
#
    #Examples: 
      #| TT            |
      #| checking task |
#@smoke @sanity @regression
  #Scenario Outline: Team Task Page
    #Then user clicks dropdown in the task page
    #Then user clicks Teamtasks in the task page
    #Then user validates the task page "<TT>"
    #Then user updates the task page "<TT>"
    #Then user deletes the task page "<TT>"
    #Then user clicks editcolumn in the task page
    #Then user clicks DueToday in the task page
    #Then user clicks OverDue in the task page
    #Then user clicks Upcoming in the task page
    #Then user clicks Duefilters in the task page
#
    #Examples: 
      #| TT         |
      #| invitation |
#@smoke @sanity @regression
  #Scenario Outline: Assigned To Page
    #Then user clicks dropdown in the task page
    #Then user clicks Assignedto in the task page
    #Then user validates the task page "<TT>"
    #Then user updates the task page "<TT>"
    #Then user deletes the task page "<TT>"
    #Then user clicks editcolumn in the task page
    #Then user clicks DueToday in the task page
    #Then user clicks OverDue in the task page
    #Then user clicks Upcoming in the task page
    #Then user clicks Duefilters in the task page
#
    #Examples: 
      #| TT         |
      #| invitation |
#@smoke @sanity @regression
  #Scenario Outline: Created By Page
    #Then user clicks dropdown in the task page
    #Then user clicks Createdby in the task page
    #Then user validates the task page "<TT>"
    #Then user updates the task page "<TT>"
    #Then user deletes the task page "<TT>"
    #Then user clicks editcolumn in the task page
    #Then user clicks DueToday in the task page
    #Then user clicks OverDue in the task page
    #Then user clicks Upcoming in the task page
    #Then user clicks Duefilters in the task page
#
    #Examples: 
      #| TT         |
      #| invitation |
#@smoke @sanity @regression
  #Scenario Outline: Reviewer Page
    #Then user clicks dropdown in the task page
    #Then user clicks Reviewer in the task page
    #Then user validates the task page "<TT>"
    #Then user updates the task page "<TT>"
    #Then user deletes the task page "<TT>"
    #Then user clicks editcolumn in the task page
    #Then user clicks DueToday in the task page
    #Then user clicks OverDue in the task page
    #Then user clicks Upcoming in the task page
    #Then user clicks Duefilters in the task page
#
    #Examples: 
      #| TT         |
      #| invitation |
#
  #
