Feature: Home Page 
 
   Background: 
   Given User is on Homepage

  Scenario: Verifying the heading on the Home page 
    When User clicks on the text 
    Then User should see a heading with text LMS Learning Management System on the Home page
    
  Scenario: Verifying the Program button visibility
   When User clicks on the program
    Then User should see a button with text Program on the menu bar
    
 Scenario: Verifying the batch button visibility
    When User clicks on the batch
    Then User should see a button with text batch on the menu bar
    
     Scenario: Verifying the User button visibility
      When User clicks on the user button
    Then User should see a button with text User on the menu bar
    
     Scenario: Verifying the Assignment button visibility
     When User clicks on the Assignment button
    Then User should see a button with text Assignment on the menu bar
    
     Scenario: Verifying the Attendence button visibility
     When User click on the attendence button
    Then User should see a button with text Attendence on the menu bar
    
     Scenario: Verifying the logout button visibility
      When User click on the logout
      Then User should see a button with text logout on the menu bar
  

