Feature: User Login Mechanism
    In order to get all membership benifit from multicart e-commerce
    As an user I want to perform an online login

	Background: Landing on MCT Home Page
	 	Given I open browser chrome
    And I land on multicart landing page

	
  Scenario: Successfull login
    When I complite login for James valid credentials
    Then I expect to see profile name as James Williams
    
  @negative   
  Scenario: Login with blanc password
    When I complite login for James No Password credentials
    Then I expect to see password error text
     
     
   Scenario: Login with blanc id
    When I complite login for James with No Id credentials
    Then I expect to see enter user name error text 