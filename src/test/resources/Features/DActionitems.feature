Feature: UMS

  @tag1
  Scenario Outline: Created By Action items Page
    When user navigates to action items page
    Then user validates the action items page
    Then user adds actionitem in action items page "<AT>" "<AD>"
    Then user validates the added actionitem in action items page "<AT>"
    Then user update the action items page "<AT>"
    Then user validates the updated actionitem in action items page "<AT>"
    Then user delete the action items page "<AT>"
    Then user create task in action items page "<AT>" "<TT>" "<TD>"
    Then user update task in action items page "<AT>" "<TT>" "<TD>"
    Then user delete task in action items page "<AT>" "<TT>" "<TD>"

    #Then user click on editcolumn in action items page
    #Then user click on filter in action items page "<AT>"
    Examples: 
      | AT            | AD                       | TT      | TD                 |
      | Actionitem289 | Actionitemdescription241 | Task241 | Taskdescription241 |
#
  #Scenario Outline: All Action items Page
    #Then user navigates to all action items page
    #Then user checks the action items page "<AT>" "<AD>"
    #Then user adds actionitem in action items page "<AT>" "<AD>"
    #Then user validates the added actionitem in action items page "<AT>"
    #Then user update the action items page "<AT>"
    #Then user delete the action items page "<AT>"
    #Then user create task in action items page "<AT>" "<TT>" "<TD>"
    #Then user click on editcolumn in action items page
#
    #Then user click on filter in action items page "<AT>"
    #Examples: 
      #| AT            | AD                       | TT      | TD                 |
      #| Actionitem231 | Actionitemdescription231 | Task231 | Taskdescription231 |
#
  #Scenario Outline: My Action items Page
    #Then user navigates to my action items page
    #Then user checks the action items page "<AT>" "<AD>"
    #Then user adds actionitem in action items page "<AT>" "<AD>"
    #Then user validates the added actionitem in action items page "<AT>"
    #Then user update the action items page "<AT>"
    #Then user delete the action items page "<AT>"
    #Then user create task in action items page "<AT>" "<TT>" "<TD>"
    #Then user click on editcolumn in action items page
#
    #Then user click on filter in action items page "<AT>"
    #Examples: 
      #| AT            | AD                       | TT      | TD                 |
      #| Actionitem232 | Actionitemdescription232 | Task232 | Taskdescription232 |
#
  #Scenario Outline: Assigned to Action items Page
    #Then user navigates to assignedto action items page
    #Then user checks the action items page "<AT>" "<AD>"
    #Then user adds actionitem in action items page "<AT>" "<AD>"
    #Then user validates the added actionitem in action items page "<AT>"
    #Then user update the action items page "<AT>"
    #Then user delete the action items page "<AT>"
    #Then user create task in action items page "<AT>" "<TT>" "<TD>"
    #Then user click on editcolumn in action items page
    #Then user click on filter in action items page "<AT>"
#
    #Examples: 
      #| AT            | AD                       | TT      | TD                 |
      #| Actionitem233 | Actionitemdescription233 | Task233 | Taskdescription233 |
