Feature: my test on cucucmbercasestudies


Scenario Outline: Login for testme App
Given Test me app is launched
Then user clicks on log in button
Then user enters valid username "<uname>"
Then user enters pssword "<pswrd>"
Examples:
		|uname|pswrd|
		|Lalitha|Password123|

@Smoke
Scenario: Search Validation in test me appp
Given user logged in into test me app
Then user search the products
Then user selects the product
Then add the product to cart
Then user purchases the product