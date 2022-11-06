Feature: feature to test change account settings

  Scenario Outline: check password changed successfully with valid credentials
    Given browser is open
    And user is on login page
    When user enters email and password
    And user clicks signin
    And user clicks on setting 
    And user clicks on Account settings
    And user clicks Passwords
    And user enter Current password
    And user enter <createpassword> and <confirmpassword>
    And user clicks save
    And password is changed
    Then User navigate to login page
  
  Examples:  
    | createpassword |confirmpassword |
    | arsenal360   | arsenal360   |