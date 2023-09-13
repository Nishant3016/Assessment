Feature: iPhone

Scenario: Search iPhone by Model and Add to Cart
Given User Launch Chrome browser
When User opens URL "https://www.bestbuy.com/"
And User select country as United State
And User select search Menu and Enter item as "iPhone13"
And Click on search button
And Find an item with a description as Apple - Pre-Owned iPhone 13 Pro 5G 128GB (Unlocked) - Graphite model - A2483-GRY price - $879.99
And Click on Add to Cart
Then Verify that a popup appears with the text The item you added to cart
When click on cart page
Then User should be found on Cart page
Then Verify that iphone14 is not present in the cart items

 