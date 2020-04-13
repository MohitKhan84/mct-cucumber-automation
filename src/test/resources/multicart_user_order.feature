Feature: User Order Mechanism
    As an User I want to perform all orders related activities
    So I can see my orders, History, All those stuff

Background: Landing on MCT Home Page
		Given I open browser chrome
    And I land on multicart landing page
    And I complite login for James valid credentials

  Scenario: Order list table
    When I navigate to order page
    Then I expect order table is available

    
  Scenario: Order Page Header Exists
    When I navigate to order page
    Then I expect order page Header is available
  