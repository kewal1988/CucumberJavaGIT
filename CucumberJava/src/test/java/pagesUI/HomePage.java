package pagesUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	By txt_searchBox=By.name("q");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void enterSearchText(String searchText)
	{
		driver.findElement(txt_searchBox).sendKeys(searchText);
	}
	
	public void hitenterKey()
	{
		driver.findElement(txt_searchBox).sendKeys(Keys.ENTER);
	}
	
	public void check_search_result() {
		driver.getPageSource().contains("Online courses");
	}

}
