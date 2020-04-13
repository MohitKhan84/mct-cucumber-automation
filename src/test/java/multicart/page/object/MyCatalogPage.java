package multicart.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyCatalogPage extends MasterPage{
	
	//String catalogTableLink = "{xpath:/html/body/div[2]/div[3]/div[2]/div/div[2]/form/div[3]/table";
	
	String catalogTableLink = "{xpath:/html/body/div[2]/div[3]/div[2]/div/div[2]/form/div[3]/table/tbody";
	
	public MyCatalogPage(WebDriver driver) {
		super(driver);
	}

	public boolean isCatalogTableExist() {
			
			return isElementExist(getWebElementBy(catalogTableLink));
			
	}
	

}
