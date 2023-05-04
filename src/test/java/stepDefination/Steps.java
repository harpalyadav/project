package stepDefination;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	public static WebDriver driver;

	@Given("I am on google browser")
	public void i_am_on_google_browser() {
		// initialization of ChromeBrowser
		driver = new ChromeDriver();
		// Maximize the browser window
		driver.manage().window().maximize();
		// Proving some implicit wait to load all elements on Website
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@When("I am using demoblaze URL")
	public void i_am_using_demoblaze_url() {
		// Open DemoBlaze Website
		driver.get("https://www.demoblaze.com/");
	}

	@Then("Check correct wenbsite is opened")
	public void Check_correct_wenbsite_is_opened() {
		String expectedUrl = "https://www.demoblaze.com/";
		String actualUrl = driver.getCurrentUrl();
		// Validating the URL
		if (actualUrl.equalsIgnoreCase(expectedUrl)) {
			System.out.println("Verification Successful: You are on demoblaze Website");
		} else {
			System.out.println("Verification Failed:you are on wrong website");

		}

	}

	@Given("I am on demblaze website")
	public void i_am_on_demblaze_website() {
		// Click on login button
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();

	}

	@When("I am using credential for login")
	public void i_am_using_credential_for_login() {
		// enter user name
		driver.findElement(By.id("loginusername")).sendKeys("harpalyadav");
		// enter password
		driver.findElement(By.id("loginpassword")).sendKeys("Harry8888");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	}

	@Then("Check greeting message is visible")
	public void check_greeting_message_is_visible() {
		try {
			String expectedGreeting = "Welcome harpalyadav";
			Thread.sleep(5000);
			String actualGreeting = driver.findElement(By.id("nameofuser")).getText();
			// Verifying Greeting message
			if (actualGreeting.equals(expectedGreeting)) {
				System.out.println("Welcome Greeting is displayed");
			} else {
				System.out.println("Welcome Greeting is not displayed");
			}
			Thread.sleep(5000);
			// logout
			driver.findElement(By.id("logout2")).click();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	@Given("I am on demblaze web")
	public void I_am_on_demblaze_web() {
		// Navigation to Signup URL
		driver.findElement(By.id("signin2")).click();
	}

	@When("click on signup option")
	public void click_on_signup_option() {
		// enter user name
		driver.findElement(By.id("sign-username")).sendKeys("harpal");
		// enter password
		driver.findElement(By.id("sign-password")).sendKeys("har1234");
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
	}

	@Then("Check signup window should show")
	public void check_signup_window_should_show() {
		try {
			Thread.sleep(3000);
			Alert alt = driver.switchTo().alert();
			System.out.println(alt.getText());
			alt.accept();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Given("I am on demblaze")
	public void I_am_on_demblaze() {
		// refreshing URL demoblaze
		driver.navigate().refresh();
	}

	@When("if I am using correct credential for login")
	public void if_i_am_using_correct_credential_for_login() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
			driver.findElement(By.id("loginusername")).sendKeys("harpal");
			driver.findElement(By.id("loginpassword")).sendKeys("har1234");
			driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("i should able to login")
	public void i_should_able_to_login() {
		try {
			String expectedGreeting = "Welcome harpal";
			Thread.sleep(5000);
			String actualGreeting = driver.findElement(By.id("nameofuser")).getText();
			// Verifying user Name
			if (actualGreeting.equals(expectedGreeting)) {
				System.out.println("User Name is Matching");
			} else {
				System.out.println("User Name not Matching");
			}
			// closing the browser window
			driver.quit();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}
