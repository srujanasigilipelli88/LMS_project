Feature: Verify different features in Program page

  Scenario: Select multiple Program
    Given User is on Program page to select multiple programs
    When User selects more than one Program using checkbox
    Then Programs get selected

 Scenario: Delete Feature
    Given User is on Program page to delete a feature
    When User clicks on Delete button on top left corner
    Then User lands on Confirm Deletion form.

   Scenario: verify deletion by clicking yes
    Given User is on Confirm Deletion form to verify the delete button
    When User clicks yes button
    Then User can see Successful Programs Deleted message
    
   Scenario: verify dlete function by clicking no
    Given User is on Confirm Deletion form to verify
    When User clicks no button
    Then User can see Confirm Deletion form disappears
    
   Scenario: Verify previous link on the first page
    Given User is logged on to LMS website to verify links
    When User is on first page of Manage Program 
    Then Verify that previous link is disabled
    
     Scenario: Verify next link
    Given User is on the page number 1
    When User clicks navigate  button
    Then User navigated to page number 2
    
     Scenario: Verify previous link
    Given User is on page number 2
    When User clicks navigate button
    Then User navigated to page number 1
    
     Scenario: Verify next link on the last page
    Given User is logged on to LMS website to verify last link
    When User is on last page of Manage Program 
    Then Verify that next link is disabled
    
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
    
    
      