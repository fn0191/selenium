# Author Fadhilatun Nisa
# Date 23/04/2020
# ALL test scenarios in Admin APIX Project
@AllAdminAPIXPlatform
Feature: As an Admin creating end-to-end (e2e) tests for testing Admin APIX Site

@CMSNews
Scenario: As an admin I want to create news in admin apix site
	Given admin is on apix platform to login to CMS news
	When user clicks member log in btn to CMS news
	And click apix admin button on usermenu to go to CMS news
	And select CMS menu to go to news tab
	And click add news button
	And fill the news form
	Then news has been created