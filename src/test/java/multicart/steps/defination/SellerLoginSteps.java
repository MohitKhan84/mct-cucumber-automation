package multicart.steps.defination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import multicart.steps.hook.MctTestHelper;

public class SellerLoginSteps {
	
	
			MctTestHelper testHelper;
			
			
			public SellerLoginSteps(MctTestHelper testHelper){
				this.testHelper = testHelper;
			}
			
	
	@When("^I complite login for Seller valid credentials$")
	public void i_complite_login_for_Seller_valid_credentials() {
		
		testHelper.getSellerHome().doLogin(testHelper.getSeller().getID(), testHelper.getSeller().getPassword());
	    
	}

	@Then("^I expect to see profile name as Seller$")
	public void i_expect_to_see_profile_name_as_Seller() {
		
		String expectedSellerProfileName = testHelper.getSeller().getprofileName();
		String actualSellerProfileName = testHelper.getSellerHome().getProfileName();
		Assert.assertEquals("James not found", expectedSellerProfileName, actualSellerProfileName);
	    
	}


}
