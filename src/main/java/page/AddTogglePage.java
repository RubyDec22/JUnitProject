package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;




public class AddTogglePage extends BasePage {

	WebDriver driver;
	
	
	
	public AddTogglePage(WebDriver driver) {
		this.driver = driver;
	
	}
	
	@FindBy(xpath ="//input[@name='data']")WebElement ADD_NEW_CATAGORY;
	@FindBy(xpath ="//input[@value ='Add']")WebElement ADD_NEW_CATAGORY_BUTTON;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[3]")
	WebElement ALL_CHECK_BOXES_LIST_ITEM_CHECKED_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[7]/span")
	WebElement ONE_BOX_IS_SELECTED_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/a[1]")
	WebElement ALL_LIST_ITEMS_REMOVED_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[3]")
	WebElement CLICK_TO_SELECT_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[1]")
	WebElement ONE_LIST_ITEMS_REMOVED_ELEMENT;
	
	public void userShouldBeAbleToAddCatagoryItem(String catagory) {
		String insertCatagory = catagory + generateRandomNum(999);
		ADD_NEW_CATAGORY.sendKeys(insertCatagory);
	}

	public void userClickOnAddCatagoryButton() {
		ADD_NEW_CATAGORY_BUTTON.click();
	
	}
	public void validateAddTogglePage()throws InterruptedException  {
		waitForElement(driver, 5, ALL_CHECK_BOXES_LIST_ITEM_CHECKED_ELEMENT);
		Assert.assertEquals(ALL_CHECK_BOXES_LIST_ITEM_CHECKED_ELEMENT.getText(),"All list items are checked");
		
		
}

	public void OneBox() {
		ONE_BOX_IS_SELECTED_ELEMENT.click();
		Assert.assertEquals( ONE_BOX_IS_SELECTED_ELEMENT.getText(),"One List item not found");
		
	}

	public void AllItemsRemoved() {
		ALL_LIST_ITEMS_REMOVED_ELEMENT.click();
		Assert.assertEquals(ALL_LIST_ITEMS_REMOVED_ELEMENT.getText(),"All List items not found");
		
		
	}

	public void clickToselectName() {
		CLICK_TO_SELECT_NAME_ELEMENT.click();
		
	}

	public void clickonRemoved() {
		ONE_LIST_ITEMS_REMOVED_ELEMENT.click();	
	}

	public void validateAllCheckBox() {
		waitForElement(driver, 5, ALL_CHECK_BOXES_LIST_ITEM_CHECKED_ELEMENT);
	Assert.assertEquals(ALL_CHECK_BOXES_LIST_ITEM_CHECKED_ELEMENT.getText(), "List items not found");
		
		
	}

}