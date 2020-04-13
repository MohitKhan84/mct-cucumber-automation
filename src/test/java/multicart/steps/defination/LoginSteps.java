package multicart.steps.defination;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import multicart.page.object.HomePage;
import multicart.steps.hook.MctTestHelper;

public class LoginSteps {
	
	//Dependency injection
		MctTestHelper testHelper;
		
		//Constructor
		public LoginSteps(MctTestHelper testHelper){
			this.testHelper = testHelper;
		}
		


	@When("^I complite login for James valid credentials$")
	public void i_complite_login_for_James_valid_credentials() throws InterruptedException {
		System.out.println("Login Complited");
			
		testHelper.getHome().doLogin(testHelper.getJames().getID(), testHelper.getJames().getPassword());
					

		}
		
	@When("^I complite login for James No Password credentials$")
	public void i_complite_login_for_James_No_Password_credentials() throws InterruptedException {
			
		testHelper.getHome().doLogin(testHelper.getJames().getID(), "");
			
			
		}
		
	@When("^I complite login for James with No Id credentials$")
	public void i_complite_login_for_James_with_No_Id_credentials() {
		    
		testHelper.getHome().doLogin("", testHelper.getJames().getPassword());
			
		}
		
	@Then("^I expect to see password error text$")
	public void i_expect_to_see_password_error_text() {
			
			String expectedErrorText = "Enter password";
			String actualErrorText = testHelper.getHome().getErrorText();
			Assert.assertEquals("James not found", expectedErrorText, actualErrorText);
			
		}
		
	@Then("^I expect to see enter user name error text$")
	public void i_expect_to_see_enter_user_name_error_text() {
		    
			String expectedErrorText = "Enter username";
			String actualIdErrorText = testHelper.getHome().getIdErrorText();
			Assert.assertEquals("Text Not Found", expectedErrorText, actualIdErrorText);

		}
	
	@Then("^I expect to see profile name as James Williams$")
	public void i_expect_to_see_profile_name_as_James_Williams() {
			
			
			String expectedProfileName = testHelper.getJames().getprofileName();
			String actualProfileName = testHelper.getHome().getProfileName();
			Assert.assertEquals("James not found", expectedProfileName, actualProfileName);
			
		}
	
	/** Steps for My Account Features  */
	
	@When("^I navigate to order page$")
	public void i_navigate_to_order_page() {
		
		//MctTestHelper.myAccount = testHelper.getHome().navigateToMyAccountPage();
		//MctTestHelper.myOrder = MctTestHelper.myAccount.navigateToOrderPage();
		
		testHelper.getHome().navigateToMyAccountPage();
		testHelper.getMyAccount().navigateToOrderPage();
		
	}
		
			

}
