Feature: Login scenarios
Scenario: Login with valid credentials.
Given User is on login page
When User enters valid username and valid password.
And User clicks on login button.
Then user should be navigated to home page.
And Close the browser.


