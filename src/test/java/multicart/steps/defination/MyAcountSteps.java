package multicart.steps.defination;

import static org.junit.Assert.assertThat;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import multicart.steps.hook.MctTestHelper;

public class MyAcountSteps {
	
	///Dependency injection
		MctTestHelper testHelper;
		
		//Constructor
		public MyAcountSteps(MctTestHelper testHelper){
			this.testHelper = testHelper;
		}
	
	@When("^I navigate to my Account page$")
	public void i_navigate_to_my_Account_page(){
		testHelper.getHome().navigateToMyAccountPage();
	    
	}
//	@Then("^I see options My Orders available$")
//	public void i_see_options_My_Orders_available() {
//	    
//	}
//
//	@Then("^I see options Profile available$")
//	public void i_see_options_Profile_available() {
//	    
//	}
//
//	@Then("^I see options Return Requests available$")
//	public void i_see_options_Return_Requests_available() {
//	    
//	}
//
//	@Then("^I see options Change Password available$")
//	public void i_see_options_Change_Password_available() {
//	    
//	}
	
	@Then("^I see all aviable options below$")
	public void i_see_all_aviable_options_below(DataTable dataTable)  {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<String> expectedOptionsNames = dataTable.asList(String.class);
		List<String> actualOptionsNames = testHelper.getMyAccount().getAllOptionText();
		
		for (int i = 0; i < actualOptionsNames.size(); i++) {
			System.out.println("Actual [" + i + "] :" + actualOptionsNames.get(i));

			Assert.assertEquals("Expectd Option Not matched with Actual !!", expectedOptionsNames.get(i),
					actualOptionsNames.get(i));
		}

		// ==== We will Check in Next Class
		
		//assertThat(expectedOptionsNames, equalTo(actualOptionsNames));

		//assertThat(expectedOptionsNames, equals(actualOptionsNames));
		//assertThat(expectedOptionsNames, equals(actualOptionsNames));

		// Validating One List Object With Another List Object
		Assert.assertEquals("Expectd Option Table Not Matched !!", true,
				expectedOptionsNames.equals(actualOptionsNames));

	}
	    
	}






