#This is a sample Feature file with an example of a single scenario.
#Every feature file starts with "Feature:" Keyword which describes what Feature is under test.
#tags are used for running entire Feature, a single Scenario or group of Feature or Scenarios.
#Tags are annotated with "@" symbol

Feature: Yahoo:- As a new customer I would like to Signin to Yahoo account so I can : -

  #This is a typical scenario Example. Every Scenario starts with "Scenario:" keyword.
  #Scenarios are represented in Given When Then syntax


  Scenario: Login to Yahoo Page successfully
    Given i navigate to the website "HOME" page
    And i click "Login_IN" on the Yahoo Page
#    And i click on Register for New Registration
#    When i fill in the registration form on New Registration page
#    Then i am registered successfully and can view "My Account Summary" page
#    When i click "SIGN_OUT" on the Home Page
#    Then i am signed out successfully and can view Sign In Page

