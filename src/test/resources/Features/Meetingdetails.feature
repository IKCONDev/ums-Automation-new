Feature: Full Meeting Details and Records Management

  Background:
    Given the user navigate to meeting details page

  Scenario: Verify Participant List and Summary
    Then validate the Meeting details page
    And add action items
    Then add the task from action item
    And Add the risk
        
    