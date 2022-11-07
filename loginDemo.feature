Feature: feature to add dashboard in my analytics

  Scenario Outline: check dashboard is added in my analytics successfully with valid credentials
    Given browser is open
    And user is on login page
    When user enters username and password
    And user clicks login
    And user clicks new tab
    And user clicks dashboard
    And user enter name of the <dashboad>
    And user enter nam of the description
    And user clicks create
    Then dashboard is created and can be viewed in my analytics

    Examples:
    | dashboard |
    | ahmad     |
    | tehreem   |
    
   