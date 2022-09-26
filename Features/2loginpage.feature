Feature: Login Page

@driversetup
Scenario: Open LMS website
Given user is  on browser
When user opens LMS Website
Then user is on Login Page


Scenario: Valid username and valid password
Given user is on login page4 
When user enter valid username and valid password
Then user click on Login Button
And user is at HomePage
