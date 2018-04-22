Feature: Free CRM Create Contacts

Scenario Outline: Free CRM create a new conacts

Given user is already on login page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user moves to new Contact page
Then user enters contacts details "<firstname>" and "<lastname>" and "<position>"

Then Close the browser

Examples:
| username 	   | password   | firstname | lastname | position |
| chandradasti | Chikki@123 | test111	    | test222     | hod111     |
| chandradasti | Chikki@123 | shreshta	| das  	   | Student  |