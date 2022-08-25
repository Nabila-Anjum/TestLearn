Feature: Validate BestBuy Search 

Scenario Outline: Validate BestBuy Search 

Given User visit BestBuy Homepage
When User Type "<Product Name>" product name and click search icon 
Then User should be able to see the expected product
 
Examples: 
|Product Name|
|Refrigerator|