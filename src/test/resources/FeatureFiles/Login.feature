@check  
Feature: Validate the login functionality of diyproject
Background:
Given User should launch the browser and load the url

@Smoke
Scenario Outline: Validate the login functionality with valid username and valid password
When User should enter valid username "<Username>" and valid password "<Password>"
And User should print the title of your page
And User should click the login button
And User should click the product of the page
Then User should navigate to incorrect credential page

Examples:

|Username|Password |
|Altaf   |Altaf@123|


@Smoke @Sanity          
Scenario: Validate the login functionality with valid username and valid password
When User should enter vaid username and valid password
          #2D MAP
          |Fruits|Veg    |FstFood  |Starters|
          |Orange|Carrot |Maggi    |Soup    |
          |Apple |LFinger|Samosa   |Icecream|
          |Pine  |Ash    |Noodles  |Masala  |
          
And User should click the login button
Then User should navigate to incorrect credential page
|
