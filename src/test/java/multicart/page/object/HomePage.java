package multicart.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends MasterPage{
	
	//WebDriver driver;
	
	String profileNameLink = "{xpath://*[@id=\"dLabel\"]/span";
	String myAccountLink = "{xpath://*[@id=\"drp_div\"]/ul/li/div/div[1]/a";
	String errorText = "{xpath://*[@id=\"password_error\"]";
	String idErrorText = "{xpath://*[@id=\"name_error\"]";
	
	String loginLink = "{xpath://*[@id=\"dLabellogin\"]";
	String userNameTextBox = "{xpath://*[@id=\"username\"]";
	String passwordTextBox = "{xpath://*[@id=\"password\"]";
	String loginButton = "{xpath://*[@id=\"jqLogin\"]";
	

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void gotoHomePage() {
		
		driver.get("https://www.demo.iscripts.com/multicart/demo/index.php");

	}

	public void doLogin(String id, String password) {
		
		clickElement(getWebElementBy(loginLink));
		typeText(getWebElementBy(userNameTextBox), id);
		typeText(getWebElementBy(passwordTextBox), password);
		clickElement(getWebElementBy(loginButton));
		
		uglyWaitFor(2000);


		
	}
	

	public String getProfileName() {
		
		return getElementText(getWebElementBy(profileNameLink));
		
	}
	
	public String getErrorText() {
		
		return getElementText(getWebElementBy(errorText));
	}
	
	public String getIdErrorText() {
		
		return getElementText(getWebElementBy(idErrorText));
	}
	

	public MyAccountPage navigateToMyAccountPage() {
		
		clickElement(getWebElementBy(profileNameLink));
		clickElement(getWebElementBy(myAccountLink));
		
		return new MyAccountPage(driver);

		
	}

	

}
