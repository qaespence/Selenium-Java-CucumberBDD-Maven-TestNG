Feature: Login into account
	Existing user should be able to log into account using correct credentials
	
Scenario: Log into account with correct credentials
	Given User navigates to stackoverflow wbesite
	And User clicks on the login button on homepage
	And User enters a valid username
	And User enters a valid password
	When User clicks on the login button
	Then User should be taken to successful login page
	