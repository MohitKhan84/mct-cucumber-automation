package multicart.steps.defination;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import multicart.steps.hook.MctTestHelper;

public class MyProductSteps {
	
	
			MctTestHelper testHelper;
			
			
			public MyProductSteps(MctTestHelper testHelper){
				this.testHelper = testHelper;
			}

	
	
	@When("^I navigate to product page$")
	public void i_navigate_to_product_page() {
		
		testHelper.getSellerHome().navigateToMyProductsPage();
	    
	}

	@Then("^I expect to see product table$")
	public void i_expect_to_see_product_table() {
		
		boolean productTableExist = testHelper.getMyProduct().isProductTableExist();
		Assert.assertEquals("Product Table Not Found", true, productTableExist);
	   
	}

}
