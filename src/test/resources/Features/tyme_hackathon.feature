@all 
Feature: As User creating a end-to-end (e2e) tests for testing tyme hackathon 

@UserRegister 
Scenario: As a user, I want to register to tyme hackathon 
	Given User access to tyme hackathon 
	And User click register button 
	When User register to tyme hackathon 
	Then user_created_new_account 
	And logout after registered 
	
@UserCompleteRegister 
Scenario: As a user, I want to continue to complete register to tyme hackathon 
	Given User login with new register account 
	When user clicks register button to continue register 
	And user clicks all steps register 
	Then user completed register
	
@UserSubmitProposal 
Scenario: As a user, I want to submit proposal for tyme hackathon 
	Given User access to tyme hackathon to submit proposal 
	And User login to tyme hackathon 
	When User click submit proposal button 
	Then User has been created new proposal 


@AdminInviteEvaluator
Scenario: As an admin, I want to invite evaluator
	Given User login as an admin
	When admin fill invite user
	And clicks invite user button
	Then new evaluator invited by admin
	
@EvaluatorEvaluateProposal
Scenario: As an evaluator, I want to evaluate proposal
	Given evaluator login to evaluate proposal
	When evaluator click any proposal with status in review
	And click evaluate button
	And fill feedback
	Then submit evaluate proposal
	
	
@AdminInviteJudge
Scenario: As an admin, I want to invite judge
	Given User login as an admin to invite judge
	When admin click hackathon list
	And view hackathon detail
	And invite judge
	Then admin fill invite judge
	And new judge created
	
@JudgeEvaluateProposal
Scenario: As a judge, I want to evaluate proposal
	Given User login as a Judge to evaluate proposal
	When judge click any proposal with status in shortlisted
	And judge click evaluate button
	And fillCriteria
	Then judge submit evaluate proposal
	
@UserSubmitSolution
Scenario: As a user, I want to submit solution
	Given User login to tyme Hackathon to submit solution
	When user clicks my proposals in usermenu
	And user submit solution
	And fill solution
	Then solution has been submitted
	
@JudgeEvaluateSolution
Scenario: As a judge, I want to evaluate solution
	Given user login as a Judge to evaluate solution
	When judge click solution evaluation
	And click any solution with status in review
	And Solution fillCriteria
	Then judge submit evaluate solution
	
	
@SetNewPass
Scenario: As an Evaluator I want to set new password 
	Given evaluator access gmail
	When login gmail
	And click reset button in gmail
	Then click reset password button in set new password page evaluator set new password
	 
	
	
	