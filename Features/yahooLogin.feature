Feature: To verify users can login

//Background: users must have a yahoo account

Scenario: users should login with a valid username and password

	Given the user is on the correct login page
	When enter username
	And the user inputs a valid password
	Then the user should be logged in