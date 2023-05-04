@tag
Feature: demoblaze website testing

  @tag1
  Scenario: Verifying demoblaze url
    Given I am on google browser
    When I am using demoblaze URL 
    Then Check correct wenbsite is opened
   
 @tag2
 Scenario: Verifying greeting message
    Given I am on demblaze website
    When I am using credential for login
    Then Check greeting message is visible
    
 @tag3
 Scenario: Redirection to signup page
    Given I am on demblaze web
    When click on signup option
    Then Check signup window should show
    
  @tag4
 Scenario: Verifying user name
    Given I am on demblaze
    When if I am using correct credential for login
    Then i should able to login