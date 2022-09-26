Feature: Verify links 

   
   Scenario: Verify previous link on the first page
    Given User is logged on to LMS website to verify links
    When User is on first page of Manage Program 
    Then Verify that previous link is disabled
    
     Scenario: Verify next link
    Given User is on the page number one
    When User clicks navigate  button
    Then User navigated to page number two
    
     Scenario: Verify previous link
    Given User is on page number two
    When User clicks navigate button to navigate back  
    Then User navigated to page number one
    
     Scenario: Verify next link on the last page
    Given User is logged on to LMS website to verify last link
    When User is on last page of Manage Program 
    Then Verify that next link is disabled
    
   
    
      
