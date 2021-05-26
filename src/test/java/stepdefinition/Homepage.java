package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Homepage 
{
	WebDriver driver;
		@Given("open the browser")
		public void open_the_browser() {
		    // Write code here that turns the phrase above into concrete actions
			Reporter.log("enter url");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
			 driver = new ChromeDriver();
			
		}

			@When("enter the URL")
			public void enter_the_url() {
			    // Write code here that turns the phrase above into concrete actions
			    Reporter.log("enter url");
			}


}
