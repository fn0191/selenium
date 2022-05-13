# Author Fadhilatun Nisa
# Date 1/12/2020
# ALL test scenarios in APIX Project
@AllAPIXPlatform
Feature: As User creating a end-to-end (e2e) tests for testing APIX platform

@REgViaEmailFI
Scenario: As a user, I want to register via email for FI to APIX Platform 
	Given user is on apix page to reg via email FI
	When user clicks Get Started button to reg via email FI
	And register via EMAIL FI
	Then it navigated user to apix landing page FI
	
@OnboardOrgFI
Scenario: As a user, I want to Onboard Organization 
	Given user is on apix to login 
	When user clicks login button
	And login via email 
	And user completing steps onboard org
	Then it navigated user to complete page 
	
@OnboardOrgFT
Scenario: As a user, I want to Onboard Organization FT
	Given user access to APIX to onboard org FT
	And user completing steps onboard org FT
	Then it navigated user to complete2 page 



@OnboardAPI
Scenario: As a user, I want to Onboard API
	Given user access apix to onboard API
	When user click API link
	And user click Onboard API button
	And user completing steps onboard API
	Then it navigated user to API list page 	

	
@OnboardSolution
Scenario: As a user, I want to Onboard Solution
	Given user access apix to onboard Solution
	When user click Solution link
	And user click Onboard Solution button
	And user completing steps onboard Solution
	Then it navigated user to Solution list page 	

@OnboardProblem
Scenario: As a user, I want to Onboard Problem
	Given user access apix to onboard Problem
	When user click Problem link
	And user click Onboard Problem button
	And user completing steps onboard Problem
	Then it navigated user to Problem list page 	
	
	
@userManagement
Scenario: As an admin I want to invite user	
	Given admin access to user management page
	When admin invite user
	Then admin sent invitation to user
		
		
@REgViaEmailFT	
Scenario: As a user, I want to register via email for FT to APIX Platform 
	Given user is on apix page to reg via email FT
	When user clicks Get Started button to reg via email FT
	And register via EMAIL FT
	Then it navigated user to apix landing page FT
	
@RegViaGoogle	
Scenario: As a user, I want to register via GOOGLE to APIX Platform 
	Given user access to apix register page 
	When user click continue with Google button
	Then user registered to apix via google
	
@RegViaGithub	
Scenario: As a user, I want to register via GITHUB to APIX Platform
	Given user access to apix using github
	When user access GITHUB
	Then user registered to apix via github

@HostHackathonNonMember
Scenario: As non member APIX, I want to host hackathon
	Given user access to host member url
	When user fill the host hackathon form
	Then host hackathon has been created 
	
