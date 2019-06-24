package CucumberFramework.driverClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroswerDriverFactory {
	
	private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	private String browser;
	
	
	public BroswerDriverFactory(String browser)
	{
		this.browser = browser.toLowerCase();
	}
	
	public WebDriver createDriver()
	{
		System.out.println("create driver "+ browser);
		
		switch(browser)
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver\\chromedriver.exe");
			driver.set(new ChromeDriver());
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver.exe");
			driver.set(new ChromeDriver());
			break;
			
		default:
			System.out.println("default browser " + browser);
			System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver\\chromedriver.exe");
			driver.set(new ChromeDriver());
			break;
		}
		
		return driver.get();
		
		
		
	}

}
