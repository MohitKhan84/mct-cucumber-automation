package multicart.page.object;

import org.openqa.selenium.WebDriver;

public class SellerHomePage extends MasterPage{
	
	String sellerProfileNameLink = "{xpath://*[@id=\"layout\"]/div[1]/div[2]/b";
	
	String sellerNameBox = "{xpath://*[@id=\"txtUserName\"]";
	String sellerPasswordBox = "{xpath://*[@id=\"txtPassword\"]";
	String sellerLoginButton = "{xpath://*[@id=\"item_details\"]/div[2]/div[3]/div/form/div/div[4]/div/input[1]";
	
	String myProductsLinks = "{xpath://*[@id=\"layout\"]/div[2]/div[1]/div[9]/a";
	//String myCatalogLinks = "{xpath://*[@id=\"layout\"]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/a/span";
	
	public SellerHomePage(WebDriver driver) {
		super(driver);
	}
	
	public void gotoSellerHomePage() {
		
		driver.get("https://www.demo.iscripts.com/multicart/demo/sellers/login.php?from=logout");

	}

	public void doLogin(String id, String password) {
		
		typeText(getWebElementBy(sellerNameBox), id);
		typeText(getWebElementBy(sellerPasswordBox), password);
		clickElement(getWebElementBy(sellerLoginButton));
		
		uglyWaitFor(2000);


		
	}

	public String getProfileName() {
		
		return getElementText(getWebElementBy(sellerProfileNameLink));
	}

	public MyProductPage navigateToMyProductsPage() {
		
		clickElement(getWebElementBy(myProductsLinks));
		
		
		return new MyProductPage(driver);
		
	}

//	public MyCatalogPage navigateToMyCatalogPage() {
//		
//		clickElement(getWebElementBy(myCatalogLinks));
//		
//		
//		return new MyCatalogPage(driver);
//		
//		
//	}

	

}
