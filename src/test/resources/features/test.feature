Feature: BestBuy Verify added item in Cart

Background: Verify the browser is launched
Given i should navigate to the home page
|url|https://www.bestbuy.com/|
Then verify the page is launched
|url|https://www.bestbuy.com/|


Scenario: Search and Select Product and Verify the Product is added to cart
Given User Launches the Application and Clicks On PopUp
When User Enters text in the SearchBox
|productName|iphone 12 pro|
And User Clicks on Search button
#Then User Should be able to Select the Product
And User Choose Options
|Type|iPhone 12 Pro Max|
|Carrier|Verizon|
|Model|Apple iPhone 12 Pro Max|
|Memory|512GB|
|Color|Pacific Blue|
|Options|for 30 months|
#And User Should be able to Select the Carrier
#And User Should be able to Select the Model
#And User Should be able to Select the Memory
#And User Should be able to Select the Color
#And User Should be able to Select the Options
And User Should be able to add item to Cart
And User Should be able to select the plan
|selectRadio|radio-1|
And User Should be able to see the item in the cart
When User Clicks on Cart
Then user Should verify that the product is added to cart
|model|iPhone 12 Pro Max|
|displayMessage|Apple - iPhone 12 Pro Max 5G 512GB - Pacific Blue (Verizon)|
