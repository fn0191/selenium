# Author Fadhilatun Nisa
# Date 1/12/2020
# ALL test scenarios in APIX Project
@allPrud
Feature: As User creating a end-to-end (e2e) tests for testing Prudential hackathon 

@UserRegPrud
Scenario: As a user, I want to register to Prudential hackathon 
	Given User Prud access to Prudential hackathon 
	And User Prud click register button 
	When User Prud register to prud hackathon 
	Then user_Prud created_new_account 
	
@UserCompleteRegPrud
Scenario: As a user, I want to continue to complete register to Prudential hackathon 
	Given User Prud login with new register account 
	When user Prud clicks register button to continue register 
	And user Prud clicks all steps register 
	Then user Prud completed register
	
@UserSubmitPropPrud 
Scenario: As a user, I want to submit proposal for Prudential hackathon 
	Given User access to prudential hackathon to submit proposal 
	And User Prud login to Prudential hackathon 
	When User Prud click submit proposal button 
	Then User Prud has been created new proposal 


@AdminInviteEvPrud
Scenario: As an admin, I want to invite evaluator Prud
	Given User login as an admin Prud
	When admin fill invite user Prud
	And admin Prud clicks invite user button
	Then new evaluator Prud invited by admin
	
@EvaluatorEvaluatePropPrud
Scenario: As an evaluator Prud, I want to evaluate proposal
	Given evaluator Prud, login to evaluate proposal
	When evaluator Prud,click any proposal with status in review
	And evaluator Prud click evaluate button
	And fill feedback Prud
	Then evaluator Prud submit evaluate proposal
	
	
@AdminInviteJudgePrud
Scenario: As an admin, I want to invite judge Prud
	Given User login as an admin to invite judge Prud
	When admin Prud click hackathon list
	And view Prud hackathon detail
	And invite judge Prud
	Then admin fill invite judge Prud
	And new judge Prud created
	
@JudgeEvaluatePropPrud
Scenario: As a judge, I want to evaluate proposal Prud
	Given User login as a Judge Prud to evaluate proposal 
	When judge Prud click any proposal with status in shortlisted
	And judge Prud click evaluate button
	And fillCriteria Prud
	Then judge Prud submit evaluate proposal
	
@UserSubmitSolPrud
Scenario: As a user, I want to submit solution Prud
	Given User login to Prud Hackathon to submit solution
	When user Prud clicks my proposals in usermenu
	And user Prud submit solution
	And fill solution Prud
	Then solution Prud has been submitted
	
@JudgeEvaluateSolPrud
Scenario: As a judge Prud, I want to evaluate solution
	Given user login as a Judge Prud to evaluate solution
	When judge Prud click solution evaluation
	And click any solution Prud with status in review
	And Solution Prud fillCriteria
	Then judge Prud submit evaluate solution
	 
	
	
	