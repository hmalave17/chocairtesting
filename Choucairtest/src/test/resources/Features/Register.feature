Feature: Register

  Background: 
    Given user enter the portal web

	@Register @RegressionTest
  Scenario: Register New User
    When user enter their data and follow steps
    Then user is registered
 

