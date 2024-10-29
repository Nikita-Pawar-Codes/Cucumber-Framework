package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefinition {
	static WebDriver driver;
	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/");
	   
	}

	@When("User enters valid username and valid password.")
	public void user_enters_valid_username_and_valid_password() {
	   driver.findElement(By.id("user-name")).sendKeys("standard_user");
	   driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@And("User clicks on login button.")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
	    
	}

	@Then("user should be navigated to home page.")
	public void user_should_be_navigated_to_home_page() {
	    String title=driver.findElement(By.xpath("//span[text()='Products']")).getText();
	    Assert.assertEquals(title, "Products");
		System.out.println("User navigated to home page");
	}

	@And("Close the browser.")
	public void close_the_browser() {
	   driver.close();
	}
}
