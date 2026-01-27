Feature: UMS

  @tag1
  Scenario Outline: Login page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"

    Examples: 
<<<<<<< HEAD
      | url                          | Username             | Password |
      | https://129.80.90.99/#/login | bharat@ikcontech.com | Test@123 |
      | https://129.80.90.99/#/login | bharat@ikcontech.com | Test@123 |
      | https://129.80.90.99/#/login | bharat@ikcontech.com | Test@123 |
      | https://129.80.90.99/#/login | bharat@ikcontech.com | Test@123 |
=======
      | Username             | Password |
      | bharat@ikcontech.com | Test@123 |
      | bharat@ikcontech.com | Test@123 |
      | bharat@ikcontech.com | Test@123 |
      | bharat@ikcontech.com | Test@123 |
>>>>>>> branch 'devbranch' of https://github.com/IKCONDev/ums-Automation-new.git
