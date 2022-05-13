# Author Fadhilatun Nisa
# Date 25/01/2021
# ALL test scenarios in Generic Hackathon
@AllGenericHackathon
Feature: As User creating a end-to-end (e2e) tests for testing Generic Hackathon

@UserRegisterGenericHackathon	
Scenario: As an user I want to register to generic hackathon
	Given user access to generic hackathon to register
	When user clicks register button on generic hackathon
	And proceed sso register
	And fill register account on generic hackathon
	Then user has been registered on generic hackathon

@UserLoginGenericHackathon	
Scenario: As an user I want to login to generic hackathon
	Given user access to generic hackathon to login
	When user clicks login button on generic hackathon
	And proceed sso login
	Then user logged in to generic hackathon
	
@submitProposalGenericHackathon
Scenario: As an user I want to submit proposal to generic hackathon
	Given user access to generic hackathon to submit proposal
	When user clicks submit proposal button on generic hackathon
	And fill submit proposal form
	Then new proposal submitted to generic hackathon

@submitSolutionGenericHackathon
Scenario: As an user I want to submit solution to generic hackathon
	Given user access to generic hackathon to submit solution
	When user clicks submit solution button on generic hackathon
	And fill submit solution form
	Then new solution submitted to generic hackathon
	
@EvEvaluateProp
Scenario: As an evaluator I want to evaluate the proposal
	Given evaluator access to generic hackathon to evaluate proposal
	When evaluator clicks view proposal
	And click evaluate
	And fill submit evaluation form
	Then proposal has been evaluated by evaluator

@JdEvaluateProp
Scenario: As a Judge I want to evaluate the proposal
	Given Judge access to generic hackathon to evaluate proposal
	When Judge clicks view proposal
	And click evaluate proposal judge
	And fill submit evaluation form judge
	Then proposal has been evaluated by Judge
	 	 
