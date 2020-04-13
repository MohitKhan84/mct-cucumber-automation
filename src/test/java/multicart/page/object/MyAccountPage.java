package multicart.page.object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends MasterPage{
	
	
	String myOrderLink = "{xpath://*[@id=\"item_details\"]/div[3]/div[1]/div/div[1]/a";
	//String optionNameLink = "{xpath://*[@id=\"item_details\"]/div[3]/div[1]/div/div[1]/a";
	String allOptionLink = "{xpath://div[@class='myaccount_list']//div[@class='col-sm-12 col-lg-3 col-md-3']/a";
	
	public MyAccountPage(WebDriver driver) {
		
		super(driver);
		
	}

	public OrderPage navigateToOrderPage() {
		
		clickElement(getWebElementBy(myOrderLink));
		
		return new OrderPage(driver);
		
	}
	
//	public boolean isOptionExist(String optionName) {
//		return isElementExist(getWebElementBy(allOptionLink));
//		
//	}
	
	public List<String> getAllOptionText() {
		
		return getElementsTextAsList(getWebElements(allOptionLink));
	}
	
	

}
