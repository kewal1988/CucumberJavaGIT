package pagesPF;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
	
	WebDriver driver;
	
	@FindBy(name = "q")
	WebElement txt_searchBox;

	public HomePage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterSearchText(String searchText)
	{
		txt_searchBox.sendKeys(searchText);
	}
	
	public void hitenterKey()
	{
		txt_searchBox.sendKeys(Keys.ENTER);
	}
	
	public void check_search_result() {
		driver.getPageSource().contains("Online courses");
	}


}
