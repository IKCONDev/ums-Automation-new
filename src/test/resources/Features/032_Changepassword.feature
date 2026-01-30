Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: ChangePassword page
    Given user is Navigate Login page "<url>"
    When user is validate Login page "<Username>" "<Password>"
    Then Validate the Change Password page "<Oldpass>" "<Newpass>" "<ConfirmNewpass>"

    Examples: 
      | url                          | Username              | Password | Oldpass  | Newpass   | ConfirmNewpass |
      | https://129.80.90.99/#/login | umstest@ikcontech.com | Test@123 | Test@123 | Test@1234 | Test@1234      |
