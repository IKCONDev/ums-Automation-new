Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Employee page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then validate the employee profile page
    And add the employee profile "<FN>" "<LN>" "<EID>" "<Email>" "<DN>" "<DSN>" "<FNs>" "<GN>"
    Then validate the added employees "<FN>" "<LN>" "<EID>" "<Email>" "<DN>" "<DSN>" "<FNs>" "<GN>"
    Then update the employee profile "<FN>" "<LN>" "<EID>" "<Email>" "<DN>" "<DSN>" "<FNs>" "<GN>"
    Then validate the updated employees "<FN>" "<LN>" "<EID>" "<Email>" "<DN>" "<DSN>" "<FNs>" "<GN>"
    Then delete the employee "<Email>"

    Examples: 
      | url                          | Username              | Password | FN      | LN    | EID     | Email                      | DN                     | DSN            | FNs          | GN   |
      | https://129.80.90.99/#/login | umstest@ikcontech.com | Test@123 | Prakash | Varma | IK42365 | prakashvarma@ikcontech.com | Information Technology | Human Resource | Sashank Arun | Male |
