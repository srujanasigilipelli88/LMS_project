Feature: verify order of features

  Scenario: Verify that the results are displayed in Ascending order of Program name
    Given User is on the Program  page to verify results
    When User clicks onthe Ascending arrow down  near to the Program name 
    Then User can see the results in Ascending order of Program name
    
     Scenario: Verify that the results are displayed in Ascending order of Program Description
    Given User is on the Program page to verify ascending order of program description
    When User clicks onthe Ascending arrow down near to the Program Description 
    Then User can see the results in Ascending order of Program Description
    
     Scenario: Verify that the results are displayed in Ascending order of Program Status
    Given User is on the Program page to verify ascending order of status
    When User clicks onthe Ascending arrow down near to the Program Status 
    Then User can see the results in Ascending order of Program Status
    
     Scenario: Verify that the results are displayed in Descending order of Program name
    Given User is on the Program page to verify desc order of name
    When User clicks onthe Descending arrow down near to the Program name
    Then User can see the results in Descending order of Program name
    
     Scenario: Verify that the results are displayed in Descending order of Program Description
    Given User is on the Program page to verify desc order of description
    When User clicks onthe Descending arrow down near to the Program Description
    Then User can see the results in Descending order of Program Description
    
     Scenario: Verify that the results are displayed in Descending order of Program Status
    Given User is on the Program page to verify desc of status
    When User clicks onthe Descending arrow down near to the Program Status
    Then User can see the results in Descending order of Program Status
    