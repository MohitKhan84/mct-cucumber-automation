Feature: User My Account Activities
    As an User I want to see all my account related options
    So I can perform all activities

  Background: Landing on MCT Home Page
    Given I open browser chrome
    And I land on multicart landing page
    And I complite login for James valid credentials

  #@wip
  #Scenario: User sees all Acount Options
  #	When I navigate to my Account page
  #	Then I see options My Orders available
  #		#Then I see options Profile available
  #Then I see options Return Requests available
  #Then I see options Change Password available
  
  Scenario: User Sees all Account Options
    When I navigate to my Account page
    Then I see all aviable options below
      | My Orders            |
      | Profile              |
      | My Return Requests   |
      | Change Password      |
      | My Favorite Products |
      | My Favorite Sellers  |
      | Seller Dashboard     |
