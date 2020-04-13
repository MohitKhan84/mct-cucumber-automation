package multicart.steps.defination;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import multicart.steps.hook.MctTestHelper;

public class OrderSteps {
	
	//Dependency injection
			MctTestHelper testHelper;
			
			//Constructor
			public OrderSteps(MctTestHelper testHelper){
				this.testHelper = testHelper;
			}

	@Then("^I expect order table is available$")
	public void i_expect_order_table_is_available() {
		
		boolean orderTableExist = testHelper.getMyOrder().isOrderTableExist();
		Assert.assertEquals("Order Table Not Found", true, orderTableExist);

	}
	
	@Then("^I expect order page Header is available$")
	public void i_expect_order_page_header_is_available() {
		
		boolean orderPageHeaderExist = testHelper.getMyOrder().isOrderPageHeaderExist();
		Assert.assertEquals("Order Page Header Not Found", true, orderPageHeaderExist);

	}
	
	

	
			

}
