Feature: UMS

  @tag1
  Scenario Outline: Login page
    Given user is Navigate Login page
    When user is validate Login page "<Username>" "<Password>"

    Examples: 
      | Username             | Password |
      | bharat@ikcontech.com | Test@123 |
      | Username               | Password  |
      | ums-test@ikcontech.com | Test@1234 |

      
      Scenario Outline: fghjkjh
      Given Delete the role RN
      | Username              | Password |
      | umstest@ikcontech.com | Test@123 |
