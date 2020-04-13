package multicart.steps.defination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import multicart.steps.hook.MctTestHelper;

public class MyCatalogSteps {
	
	
	MctTestHelper testHelper;
	
	
	public MyCatalogSteps(MctTestHelper testHelper){
		this.testHelper = testHelper;
	}
	
	@And("^I navigate to Catalog page$")
	public void i_navigate_to_Catalog_page() {
		
		testHelper.getMyProduct().navigateToMyCatalogPage();
	    
	}

	@Then("^I expect to see existing catagory table$")
	public void i_expect_to_see_existing_catagory_table() {
		
		boolean catalogTableExist = testHelper.getmyCatalog().isCatalogTableExist();
		Assert.assertEquals("Catalog Table Not Found", true, catalogTableExist);
	    
	}
	
	

}
