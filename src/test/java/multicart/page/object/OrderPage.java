package multicart.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage extends MasterPage{
	
	
	String orderTableLink = "{xpath:/html/body/div[2]/div[1]/div[1]/div/form/div[2]/div[1]/div[2]/table";
	
	String orderPageHeaderLabel = "{xpath:/html/body/div[2]/div[1]/div[1]/div/h1";
	
	public OrderPage(WebDriver driver) {
		super(driver);
	}

	public boolean isOrderTableExist() {
		
		return isElementExist(getWebElementBy(orderTableLink));
	}

	public boolean isOrderPageHeaderExist() {
		
		return isElementExist(getWebElementBy(orderPageHeaderLabel));
	}
	

}
