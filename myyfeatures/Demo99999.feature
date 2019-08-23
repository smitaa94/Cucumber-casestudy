Feature: zzmy test on cucucmbercasestudies


Scenario Outline: zzLogin for testme App
Given zzTest me app is launched
Then zzuser clicks on log in button
Then zzuser enters valid username "<uname>"
Then zzuser enters pssword "<pswrd>"
Examples:
		|uname|pswrd|
		|Lalitha|Password123|

@Smoke
Scenario: zzSearch Validation in test me appp
Given zzuser logged in into test me app
Then zzuser search the products
Then zzuser selects the product
Then zzadd the product to cart
Then zzuser purchases the product