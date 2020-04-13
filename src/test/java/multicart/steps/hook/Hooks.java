package multicart.steps.hook;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import multicart.test.data.User;

public class Hooks {
	
	//Dependency injection
	MctTestHelper testHelper;
	
	//Constructor
	public Hooks(MctTestHelper testHelper){
		this.testHelper = testHelper;
	}
 

	@Before 
	
	public void beforeScenarioStarts() {
		System.out.println("Scenario Started");
		
		testHelper.getJames().setID("user");
		testHelper.getJames().setPassword("pass");
		testHelper.getJames().setprofileName("JAMES WILLIAMS");
		
		testHelper.getSeller().setID("seller");
		testHelper.getSeller().setPassword("seller");
		testHelper.getSeller().setprofileName("Seller");
		
		
		
	}
	
	@After 
	
	public void AfterScenarioEnds() {
		System.out.println("Scenario Ends");
		
		testHelper.getDriver().close();
	}	

	
	

}
