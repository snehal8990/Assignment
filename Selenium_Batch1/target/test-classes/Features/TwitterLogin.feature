Feature: Check For Twitter login 
#https://twitter.com/i/flow/login
Scenario Outline: Launch Twitter URL 
Given Launch Browser and enter url
When Enter user id as "<useriD>" 
And User click on next button
Then Enter passowrd as "<password>"
And Close browser
Examples:
|useriD|password|
|asdasda|sdasd|