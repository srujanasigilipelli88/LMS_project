Feature: Verify features in the Program page

Background: 
   
  Given User is on the Program page
   
 
  Scenario: Search Program By Name
     When User enters  name phrase into search box
     Then Entries for name phrase are shown

 
Scenario: Search Program By Description
    When User enters  description phrase into search box
    Then Entries for description phrase are shown
 
 Scenario: Search Program By Status
    When User enters  status  into search box
    Then Entries for status are shown
 
 Scenario: select the program
    When User selects Program using checkbox
    Then Program gets selected
 
 Scenario: Verify Edit button
    When User clicks on Edit button
    Then User lands on Program Details form
  
