Feature: Search and place the order for the products

Scenario: Search experience for product search in both Home page and Offers page
Given User is on GreenCart landing page
When user searched with Shortname "Tom" and extracted actual name of product
Then user searched for same shortname in offers page to check if product exists
