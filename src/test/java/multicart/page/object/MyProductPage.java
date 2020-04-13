package multicart.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class MyProductPage extends MasterPage{
	
	String productTableLink = "{xpath://*[@id=\"layout\"]/div[2]/div[2]/div[4]/table/tbody";
	String myCatalogLink = "{xpath://*[@id=\"layout\"]/div[2]/div[2]/div[3]/form/table/tbody/tr/td[2]/a";
	
	//String myCatalogLink = "{xpath://*[@id=\"layout\"]/div[2]/div[2]/div[3]/form/table/tbody/tr/td[2]/a"; 
	
	//WebDriver driver;

	public MyProductPage(WebDriver driver) {
		super(driver);
	}

	public boolean isProductTableExist() {
		
		return isElementExist(getWebElementBy(productTableLink));
	
		
		//return driver.findElement(By.xpath("//*[@id=\"layout\"]/div[2]/div[2]/div[4]/table/tbody")).isDisplayed();
	}

	
	public MyCatalogPage navigateToMyCatalogPage() {
		
		clickElement(getWebElementBy(myCatalogLink));
		
		
		return new MyCatalogPage(driver);
	}

	

	
	

}
