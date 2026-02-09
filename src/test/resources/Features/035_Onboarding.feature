Feature: UMS

  @smoke @sanity @regression
  Scenario Outline: Onboarding page
    Then Validate the Onboarding page "<url>" "<email>" "<Mobile>" "<Fullname>" "<Password>" "<ConfirmPassword>"

    Examples: 
      | url                               | email              | Mobile     | Fullname   | Password | ConfirmPassword |
      | https://icn.ikcontech.com/#/login | dilipkumar@ikn.com | 9090789888 | Dilipkumar | Test@123 | Test@123        |
