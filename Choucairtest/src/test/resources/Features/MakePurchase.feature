
Feature: Make a Purchase

	Background: 
    Given user enter the portal web
  
  @Purchase @RegressionTest
  Scenario: User Make a puchase online 
    When user do login 
    Then user confirm the steps 
    And user buy items 