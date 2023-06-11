
package test;




import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.AddTogglePage;
import util.BrowserFactory;

public class AddToggleTest {
	
	WebDriver driver;
	
	//Test/Mock Data
	
	String catagory = "Ruby";
	String oneCatagory = "Ruby Techfios QADec2022";
	String addcatagory = "Ruby Kwatra";
	
	
	@Before
	public void initBrowserFactory() {
		driver = BrowserFactory.init();
	}
	
	@Test
	
	public void validateAddTogglePage() throws InterruptedException{
		AddTogglePage addTogglePage = PageFactory.initElements(driver, AddTogglePage.class);
		
		addTogglePage.userShouldBeAbleToAddCatagoryItem(catagory);
		addTogglePage.userClickOnAddCatagoryButton();
		addTogglePage.userShouldBeAbleToAddCatagoryItem(oneCatagory);
		addTogglePage.userClickOnAddCatagoryButton();
		
		addTogglePage.userShouldBeAbleToAddCatagoryItem(addcatagory);
		addTogglePage.userClickOnAddCatagoryButton();
		addTogglePage.validateAddTogglePage();
		addTogglePage.OneBox();
		addTogglePage.AllItemsRemoved();

	}
     @Test
	  public void validateOneItemRemoved()throws InterruptedException{
		AddTogglePage addTogglePage = PageFactory.initElements(driver, AddTogglePage.class);
		
		addTogglePage.clickToselectName();
		addTogglePage.clickonRemoved();
			
	}
		@Test
		  public void validateAllItemsRemoved()throws InterruptedException{
			AddTogglePage addTogglePage = PageFactory.initElements(driver, AddTogglePage.class);
			
			addTogglePage.AllItemsRemoved();
			addTogglePage.validateAllCheckBox();
			addTogglePage.clickonRemoved();
			
			BrowserFactory.tearDown();
		}
}	
		
		
		
		
	



