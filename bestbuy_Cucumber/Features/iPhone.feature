Feature: iPhone

Scenario: Search iPhone by Model and Add to Cart
Given User Launch Chrome browser
When User opens URL "https://www.bestbuy.com/"
And User select country as United State
And User select search Menu and Enter item as "iPhone13" and click on search
And select filter in condition for pre-owned
And Find an item with a description, model and price
And Click on Add to Cart and Verify that a popup
And User select search Menu and Enter item as "iPhone12" and click on search
And Find an item with a description, model and price
And Click on Add to Cart and Verify that a popup
When click on cart page
Then User should be found on Cart page
Then Verify that "iphone14" is not present in the cart items

 