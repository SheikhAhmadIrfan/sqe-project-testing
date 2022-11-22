Feature: feature to test change account settings

 tehreem
  Scenario Outline: check password changed successfully with valid credentials

  Scenario: check password changed successfully with valid credentials
 main
    Given browser is open
    And user is on login page
    When user enters email and password
    And user clicks signin
    And user clicks on setting 
    And user clicks on Account settings
    And user clicks Passwords
    And user enter Current password
 tehreem
    And user enter <createpassword> and <confirmpassword>
    And user clicks save
    And password is changed
    Then User navigate to login page
  
  Examples:  
    | createpassword |confirmpassword |
    | arsenal360   | arsenal360   |

    And user enter create password and confirm password
    And user clicks save
    And password is changed
    Then User navigate to login page
 main
