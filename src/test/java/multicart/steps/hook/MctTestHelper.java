package multicart.steps.hook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import multicart.page.object.HomePage;
import multicart.page.object.MyAccountPage;
import multicart.page.object.MyCatalogPage;
import multicart.page.object.MyProductPage;
import multicart.page.object.OrderPage;
import multicart.page.object.SellerHomePage;
import multicart.test.data.Seller;
import multicart.test.data.User;



public class MctTestHelper {
	
	WebDriver driver;
	User James;
	HomePage home;
	MyAccountPage myAccount;
	OrderPage myOrder;
	
	Seller seller;
	MyProductPage myProduct;
	MyCatalogPage myCatalog;
	SellerHomePage SellerHome;
	
	
	public WebDriver getDriver() {
		
		if(driver==null) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		return driver;
		
	}
	public User getJames() {
		
		if(James==null) {
			
			James = new User();
		}
		
		return James;
	}
	public HomePage getHome() {
		
		if(home==null) {
			
			home = new HomePage(getDriver());
		}
		return home;
		
	}
	
	public MyAccountPage getMyAccount() {
		
		if(myAccount==null) {
			
			myAccount = new MyAccountPage(getDriver());
		}
		return myAccount;
	}
	
	
	public OrderPage getMyOrder() {
		
		if(myOrder==null) {
			
			myOrder = new OrderPage(getDriver());
		}
		return myOrder;
	}
	
	
	//Seller
	
	public Seller getSeller() {
		
		if(seller==null) {
			
			seller = new Seller();
		}
		
		return seller;
	}
	
	
	public SellerHomePage getSellerHome() {
		
		if(SellerHome==null) {
			
			SellerHome = new SellerHomePage(getDriver());
		}
		return SellerHome;
		
	}
	
	public MyProductPage getMyProduct() {
		
		if(myProduct==null) {
			
			myProduct = new MyProductPage(getDriver());
		}
		return myProduct;
	}
	
	
	public MyCatalogPage getmyCatalog() {
		
		if(myCatalog==null) {
			
			myCatalog = new MyCatalogPage(getDriver());
		}
		return myCatalog;
	}
	
	
	
	
	
	
	

	

	
	
	

	

	
	
	
	

}
