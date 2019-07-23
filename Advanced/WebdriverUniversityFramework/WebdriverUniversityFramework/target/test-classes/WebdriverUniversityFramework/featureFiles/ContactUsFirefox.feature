@ContactUs @firefox
Feature: Submit data to webdriveruniversity.com using contact us form
	A user should be able to submit information via the contact us form
	If a user clicks on the reset button then all information should be removed from the contact us form
	
Background:
	Given I access webdriveruniversity
	When I click on the contact us button

Scenario: Submit information using the contact us form
	And I enter first name
	And I enter last name
	And I enter an email address
	And I enter comments
	| example comment one | example comment two |
	When I click on the submit button
	Then the information should successfully be submitted via the contact us form

Scenario: Submit non-valid data using the contact us form
	And I enter a non-valid first name
	And I enter a non-valid last name
	And I enter a non-valid email address
	And I enter no comments
	When I click on the submit button
	Then the information should not be successfully submitted via the contact us form
	But the user should also be notified of the problem

Scenario: Enter information into the contact us form, when click on reset button then information should be removed
	And I enter first name
	And I enter last name
	And I enter an email address
	And I enter comments
	| example comment one | example comment two |
	When I click on the reset button
	Then the information should be removed from the contact us form
	