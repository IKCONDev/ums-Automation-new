Feature: UMS

  @tag1
  Scenario Outline: Login page
    Given user is Navigate Login page
    When user is validate Login page "<Username>" "<Password>"

    Examples: 
<<<<<<< HEAD
      | Username             | Password |
      | bharat@ikcontech.com | Test@123 |
=======
      | Username               | Password  |
      | ums-test@ikcontech.com | Test@1234 |
>>>>>>> branch 'devbranch' of https://github.com/IKCONDev/ums-Automation-new.git
