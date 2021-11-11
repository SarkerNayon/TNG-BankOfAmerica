
Feature: Geico user account login

Scenario: Verifying account login atempt.

Given user on Geico.com home page
When user click on login
And user enter invalid username
And user enter invalid password
And user click on login button
Then display invalid information.
