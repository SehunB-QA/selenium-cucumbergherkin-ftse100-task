#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Find the highest riser and faller on FTSE100
 

  @tag1
  Scenario: I would like to find the highest riser and faller on the FTSE100
    Given I can access "www.hl.co.uk/shares/stock-market-summary/ftse-100"
    And I navigate to the risers page
    And I should see "International Consolidated Airlines Group SA" on the page as the highest riser
    And then I navigate to the fallers page
    Then I should see "Rio Tinto plc" on the page as the top faller
 

