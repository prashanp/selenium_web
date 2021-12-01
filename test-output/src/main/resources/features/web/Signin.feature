#This is a sample Feature file with an example of a single scenario.
#Every feature file starts with "Feature:" Keyword which describes what Feature is under test.
#tags are used for running entire Feature, a single Scenario or group of Feature or Scenarios.
#Tags are annotated with "@" symbol
Feature: Login:- As a new customer I would like to register so I can : -
 #This is a typical scenario Example. Every Scenario starts with "Scenario:" keyword.
  #Scenarios are represented in Given When Then syntax
Background: 
	Given i navigate to the website "HOME" page

@tc02
Scenario Outline: Negative combinations for user login scenarios
When i enter Insured "UserName" <login> on the Home Page  
And I run query "query.getUserReg" <login> to get list of users in record set
Examples:
| login    | 
|   b1     | 

@0001-01 @tc000 @Functional_test 
Scenario Outline: SIGNIN : ##0001: Sign In / Sign Out 
 	Given Go to nccpa sign in page
	When User is in signin page
	Then User should see the role from the select role dropdown list
	And Enters a valid userid "<userid>" 
	And Enters a valid password "<password>"
  And Click on Signin button
	Then Check background Questions
	Then validate login is successful
	Then Check Important Notice Dialog	
	Then Dashboard menu item dispaly is display
	And Verify the signout button is visible
	And Clicks on signout to leave the Dashboard page
	Then Verifies the signout is successful

Examples:
  | role       | userid 	| password |test|
	| Portal (1) | c1	      | Password |1015|
	| Portal (2) | c2	      | Password |1016|
