package CucumberFramework.stepfiles;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import CucumberFramework.driverClass.BroswerDriverFactory;
import CucumberFramework.runnerClass.MainRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.*;;


public class searchRestaurant {
	
	
	By title = By.xpath("//span[@class='is-visuallyHidden']");
	By input_box = By.xpath("//input[@name='postcode']");
	By search_button = By.xpath("//button[@data-test-id='find-restaurants-button']");
	By header_title = By.xpath("//h1[@class='c-contentHeader-title']");
	By sub_title = By.xpath("//span[@class='c-contentHeader-subTitle']");
	By all_rest_titles = By.xpath("//h3[@class='c-exp-listing-item-title']");
	By main_header_in_hotel_page = By.xpath("//h1[@class='name']");
	By help_button = By.xpath("//li[@class=\"supportLink\"]/a");
	By help_page_title = By.xpath("//div[@class='c-order-customisation--login']/h1");
	By login_button = By.xpath("//div[@class='actions-container']/a");
	By other_question_button = By.xpath("//a[@data-ft='other-questions-link']");
	java.util.List<WebElement> titles = new ArrayList<>();
	public static WebDriver driver;
	
	
	@Before("@first")
	public static void initializeDriver(){

		InputStream input = null;
		try {
			input = new FileInputStream("C:\\Worspace-Interview\\JustEatTesting\\src\\test\\java\\CucumberFramework\\Resources\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

            Properties prop = new Properties();
            try {
				prop.load(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println(prop.getProperty("browser"));
            String broswer_name = prop.getProperty("browser");
            String URL = prop.getProperty("url");
            
            BroswerDriverFactory factory = new BroswerDriverFactory(broswer_name);
            driver = factory.createDriver();
            driver.manage().window().maximize();
            driver.get(URL);
			
	
	}
	
	
	@Given("^I want food in \"([^\"]*)\"$")
	public void i_want_food_in(String postCode) throws InterruptedException {
		System.out.println("I would like to get restaurant list from this postal code : "+ postCode);
		
		String home_page_title = driver.findElement(title).getText();
		System.out.println(home_page_title);
		Assert.assertEquals(home_page_title, "Just Eat"); // checking if landed in just eat page with title
		Assert.assertEquals(true, driver.findElement(input_box).isDisplayed());
		
		driver.findElement(input_box).sendKeys(postCode);
		Thread.sleep(2000);
		
	   
	}

	@When("I search for restaurants")
	public void i_search_for_restaurants() throws InterruptedException {
		
		//clicking on search button
		driver.findElement(search_button).click();
		Thread.sleep(6000);
	    
	  
	} // \"([^\"]*)\"$"

	@Then("^I should see some restaurants in \"([^\"]*)\"$")
	public void i_should_see_some_restaurants_in(String postCode) {
		
		String sub_ttle = driver.findElement(sub_title).getText();	    
		System.out.println(postCode.toLowerCase());
		Assert.assertEquals(true, sub_ttle.contains(postCode));
		
		String Header = driver.findElement(header_title).getText().toLowerCase();
		Assert.assertEquals(true, Header.contains("open restaurants"));
		
	  
	}
	
	@Given("Restaurants lists are displayed")
	public void restaurants_lists_are_displayed() {
		
		titles = driver.findElements(all_rest_titles);
		
		int total_rest = titles.size();
		
		if(total_rest > 1)
		{
			System.out.println("restaurants are displayed");
			
		}
		else
		{
			System.out.println("no restaurants are displayed");
		}
		
	  
	}
	
	String first_title;

	@When("I click on the first restaurant title")
	public void i_click_on_the_first_restaurant_title() throws InterruptedException {
		
		first_title = titles.get(0).getText();
		
		titles.get(0).click();
		Thread.sleep(2000);
	    
	}

	@Then("I should redirect to the menu page for that restaurant")
	public void i_should_redirect_to_the_menu_page_for_that_restaurant() {
		String Rest_Header = driver.findElement(main_header_in_hotel_page).getText();
		
		Assert.assertEquals(first_title, Rest_Header); // verify is same title displayed in second page
		
	   
	  
	}
	
	
	@When("^user redirect to Help page$")
	public void menu_page_for_that_restaurant_displayed() throws Throwable {
		Assert.assertEquals(true, driver.findElement(help_button).isDisplayed());
		driver.findElement(help_button).click();
		Thread.sleep(2000);
		
	    
	}

	@Given("^help page is displayed$")
	public void verify_all_the_three_tabs_are_displayed() throws Throwable {
		String help_page_header = driver.findElement(help_page_title).getText();
		
		Assert.assertEquals(help_page_header, "Can we help with an order?");
	    
	}

	@Then("^verify buttons displayed in the help file$")
	public void verify_the_category_tab_displayed_or_not() throws Throwable {
		Assert.assertEquals(true, driver.findElement(login_button).isDisplayed());
		Assert.assertEquals(true, driver.findElement(other_question_button).isDisplayed());
	}
	
	@After("@third")
	public static void tearDown(){
		
		driver.quit();
		driver = null;
	

	}

}
