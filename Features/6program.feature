Feature: Verify program details form

 Background: 
   Given User is on Program Details form
  
 Scenario: Edit Program name
    When User edits Name and selects the Save button
    Then User can see updated Name
    
    Scenario: Edit Program description
    When User edits  description  and selects the save button
    Then User can see updated description
 
 Scenario: Edit Program status
    When User changes the status and saves
    Then User can see updated status
 
 Scenario: click cancel
    When User User clicks Cancel button
    Then User can see Program Details form disappears
 
 Scenario: Click Save
    When User clicks save button
    Then User can see Successful Program Updated message
    
     Scenario: Select Program
    When User selects Program using checkbox
    Then Program gets selected
 
  Scenario: verify Delete Feature
    When User clicks delete button
    Then User lands on Confirm Deletion form
 
  Scenario: verify delete button by clicking yes
    When User clicks Yes button
    Then User can see Successful Program Deleted message
 
  Scenario: Verify delete by clicking no
    Given User is on Confirm Deletion form to click no
    When User clicks no button
    Then  Confirm Deletion form disappears
 
  Scenario: Validate Add New Program
    Given User is on Program to add a new program
    When User clicks new program button
    Then User lands on Program Details form
 
  Scenario: Empty form submission
    When User clicks Save button without entering data
    Then User gets message Name is required
 
  Scenario: Enter Program Name
    When User enters Name in text box
    Then User can see Name entered
 
  Scenario: Enter Program Description
    When User enters Description in text box
    Then User can see Description entered
 
  Scenario: Select Status
    When User selects Status using radiobutton
    Then User can see Active or Inactive status selected
 
  Scenario: Save the form
    When User clicks on save button
    Then User gets Successful Program created message
 
  Scenario: Cancel the form
    When User clicks on  cancel button
    Then program details form closes
 
 

  
