Feature: Deals data creation

@P1
Scenario: Free CRM Create a new Deal Scenario

Given user is already on login page
When title of login page is Free CRM
Then user enters the username and password
|chandradasti|Chikki@123|
Then user clicks on login button
Then user is on home page 
Then user moves to new deal page
Then user enters deal details
|test deal000 | 10000 | 50 | 10 |
Then Close the browser
