# Author Fadhilatun Nisa
# Date 18/01/2021
# ALL test scenarios in Admin Hackathon
@AllAdminHackathon
Feature: As User creating a end-to-end (e2e) tests for testing Admin Hackathon

@CreateHackathon
Scenario: As an admin I want to create new hackathon
	Given admin is on hackathon list page to create hackathon
	When admin clicks add hackathon button
	And create hackathon
	Then it created new hackathon
	
@DraftInfo
Scenario: As an admin I want to update draft info
	Given admin is on hackathon list page to update draft info
	When admin clicks update link
	And fill draft info form
	Then it updated draft info
	
@DraftProblemStatement
Scenario: As adn admin I want to add problem statement
	Given admin is on hackathon list page to update draft problem statement
	When admin clicks update link with problem statement tab
	And add new problem statement
	And fill the probstat form
	Then added new problem statement 
	
@DraftCustomQuestion
Scenario: As adn admin I want to submit proposal custom question
	Given admin is on hackathon list page to update draft custom question
	When admin clicks update link with submit proposal question tab
	And add new custom question
	And fill the custom question form
	Then added new custom question
	
@DraftSolutionCustomQuestion
Scenario: As adn admin I want to submit solution custom question
	Given admin is on hackathon list page to update solution custom question
	When admin clicks update link with submit solution question tab
	And add new solution custom question
	And fill the solution custom question form
	Then added new solution custom question

@DraftCriteria
Scenario: As adn admin I want to add criteria
	Given admin is on hackathon list page to update draft criteria
	When admin clicks update link with criteria tab
	And add new criteria
	And fill the criteria form
	Then added new criteria
	
@DraftTermConditions
Scenario: As adn admin I want to add tnc
	Given admin is on hackathon list page to update draft tnc
	When admin clicks update link with tnc tab
	And add new tnc
	And fill the tnc form
	Then added new tnc
	And added new tnc judge
	
@AdminInviteAdmin
Scenario: A an admin I want to invite another admin
	Given admin login to admin page to invite admin
	When admin access user management to invite admin
	And Fill the invite user form role admin
	Then admin user invited

@AdminInviteEv
Scenario: Ad an admin I want to invite evaluator
	Given admin login to admin page to invite evaluator
	When admin access user management to invite evaluator
	And Fill the invite user form role evaluator
	Then evaluator user invited

@AdminInviteJudge
Scenario: Ad an admin I want to invite judge
	Given admin login to admin page to invite judge
	When admin access user management to invite judge
	And Fill the invite user form role judge
	Then judge user invited


	