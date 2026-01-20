#Feature: UMS Filter
#
 #@tag1
  #Scenario Outline: Login page
    #Given user is Navigate Login page
    #When user is validate Login page "<Username>" "<Password>"
#
    #Examples: 
      #| Username                  | Password    |
      #| ums-support@ikcontech.com | Test@123456 |
#
  #@tag2
  #Scenario Outline: Task Page
    #Then Meeting Filters "<Username>" "<Password>"
    #Examples: 
      #| Username                  | Password    |
      #| ums-support@ikcontech.com | Test@123456 |
#Feature: UMS Filter
#
  #@tag1
  #Scenario Outline: Login page
    #Given user is Navigate Login page
    #When user is validate Login page "<Username>" "<Password>"
#
    #Examples:
      #| Username             | Password |
      #| bharat@ikcontech.com | Test@123 |
#
  #@tag2
  #Scenario Outline: Meetings filters Page
    #And navigate to Meetings
    #Then Meeting Filters "<Username>" "<Password>"
#
    #Examples:
      #| Username                  | Password    |
      #| ums-support@ikcontech.com | Test@123456 |
#
  #@tag2
  #Scenario Outline: Meetings filters Page
    #And navigate to Actionitems
    #Then Action Item Filters "<Username>" "<Password>"
#
    #Examples:
      #| Username                  | Password    |
      #| ums-support@ikcontech.com | Test@123456 |
#
  #Scenario Outline: Action item filters Page
    #Given navigate to Tasks
    #Then Task Filters  "<Username>" "<Password>"
#
    #Examples:
      #| Username                  | Password    |
      #| ums-support@ikcontech.com | Test@123456 |
#
  #Scenario Outline: Tasks filters Page
    #Given navigate to Risks
    #Then Risk Filters "<Username>" "<Password>"
#
    #Examples:
      #| Username                  | Password    |
      #| ums-support@ikcontech.com | Test@123456 |
