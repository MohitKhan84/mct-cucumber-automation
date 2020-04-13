
Feature: As a Seller I want to perform all products related activities
    So I can see my products, and can add product

  
  Background: Landing on MCT Seller Home Page
  	Given I open browser chrome
    And I land on multicart seller page
    When I complite login for Seller valid credentials
  
  
  Scenario: Product Table
    And I navigate to product page
    Then I expect to see product table
   @wip 
	Scenario: Add Product Table
		And I navigate to product page
    Then I navigate to Catalog page
    Then I expect to see existing catagory table
  