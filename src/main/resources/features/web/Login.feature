#This is a sample Feature file with an example of a single scenario.
#Every feature file starts with "Feature:" Keyword which describes what Feature is under test.
#tags are used for running entire Feature, a single Scenario or group of Feature or Scenarios.
#Tags are annotated with "@" symbol
Feature: Login:- As a new customer I would like to register so I can : -
 #This is a typical scenario Example. Every Scenario starts with "Scenario:" keyword.
  #Scenarios are represented in Given When Then syntax
Background: 
	Given i navigate to the website "HOME" page

@tc01
Scenario Outline: Negative combinations for user login scenarios
When i enter "UserName" <login> on the Home Page  
#And i click on "Next" button
And I run query "query.getUserReg" <login> to get list of users in record set
Examples:
| login    | 
|   a1     | 

@tc02
Scenario Outline: Negative combinations for user login scenarios
When i enter Insured "UserName" <login> on the Home Page  
And I run query "query.getUserReg" <login> to get list of users in record set
Examples:
| login    | 
|   b1     | 