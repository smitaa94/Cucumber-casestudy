Feature: My validations of test me app
Scenario Outline: Registration validations for multiple users in testme app
Given Testme is launched by the user
When user clicks on signon the Registration form is displayed
Then user enters the username "<username>"
Then user enters the firstname "<fname>"
Then user enters the lastname "<lname>"
Then user enters password "<password>"
Then user confirms the password "<confirmpassword>"
Then user selects the gender
Then user enters the email "<email>"
Then user enters the mobilenumber "<mob>"
Then user enters date of birth "<birth>"
Then user enters address "<address>"
Then user selects security question
Then user answers the security question
Then user clicks on submit button
Examples:
|username|fname|lname|password|confirmpassword|email|mob|birth|address|
|kaju11|rutu|Roy|abcd1234|abcd1234|soe@gmail.com|8421879634|20/10/2010|nalasu|
|uima|riuu|KOy|abcd4567|abcd4567|det@yahoo.com|81493704578|12/11/2011|muluka|

@Regression
Scenario Outline: Login for testme App
Given Test me app is launched
Then user clicks on log in button
Then user enters valid username "<uname>"
Then user enters password "<pswrd>"
Examples:
|uname|pswrd|
|raju11|abcd1234|
|rima|abcd4567|

Scenario: search engine

