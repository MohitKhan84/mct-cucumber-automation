package multicart.steps.defination;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import multicart.page.object.HomePage;
import multicart.steps.hook.MctTestHelper;

public class CommonSteps {
	
	
	///Dependency injection
	MctTestHelper testHelper;
	
	//Constructor
	public CommonSteps(MctTestHelper testHelper){
		this.testHelper = testHelper;
	}
	
	@Given("^I open browser chrome$")
	public void i_open_browser_chrome() {
	    
	    testHelper.getDriver();    
	    
	}

	@Given("^I land on multicart landing page$")
	public void i_land_on_multicart_landing_page() {
		
		testHelper.getHome().gotoHomePage();
	}
	
	//Seller
	
	@Given("^I land on multicart seller page$")
	public void i_land_on_multicart_seller_page() {
		testHelper.getSellerHome().gotoSellerHomePage();
	    
	}
	

}
