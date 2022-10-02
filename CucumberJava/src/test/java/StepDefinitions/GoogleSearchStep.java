package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesUI.HomePage;

public class GoogleSearchStep {

	WebDriver driver=null;
	HomePage hpage;
	//HomePage_PF hpage;

	@Before
	public void browsersetup() {
		System.out.println("Before scenario");
		System.out.println("Inside browser is open");
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("browser is open")
	public void browser_is_open() {
		hpage=new HomePage(driver);
		//hpage=new HomePage_PF(driver);
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside user is on google search page");
		driver.navigate().to("https://google.com");
	}

	@When("User enter a text in search box")
	public void user_enter_a_text_in_search_box() {
		System.out.println("Inside user enter a text in search box");
		hpage.enterSearchText("Automation Step by Step");
	}

	@And("hit enter")
	public void hit_enter() {
		System.out.println("Inside hit enter");
		hpage.hitenterKey();
	}

	@When("User enter a {string} in search box")
	public void user_enter_a_in_search_box(String SearchText) {
		System.out.println("Inside user enter a in search_box");
		hpage.enterSearchText(SearchText);
	}

	@Then("user is navigate to search results")
	public void user_is_navigate_to_search_results() {
		System.out.println("Inside user is navigate to search results");
		hpage.check_search_result();
	}

	@After
	public void teardown() {
		System.out.println("After scenario");
		driver.close();
		driver.quit();
	}


}
