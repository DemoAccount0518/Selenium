#Each feature contains one feature
#Feature files use gherkin language- business language
Feature: Test the login functionality on whiteboxqa

#A feature may have given different scenarios
#Scenario use Given-When-Then structure
Scenario: the user should be able to login with correct username and correct password
Given user is on the login page
When user enters correct username and correct password
Then user gets confirmation