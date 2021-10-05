@SmokeFeature
Feature: feature to test login functionality

  @smoketest
  Scenario: Check login is successful with valid credentials

    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigate to the login page


  Example:
  |username|password|
  |user1|pass1|
  |user2|pass2|

