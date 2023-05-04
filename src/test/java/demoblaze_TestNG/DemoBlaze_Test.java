package demoblaze_TestNG;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoBlaze_Test {
	WebDriver driver;

	@Test(priority = 0)
	public void invokeBrowser() {
		// initialization of ChromeBrowser
		driver = new ChromeDriver();
		// Maximize the browser window
		driver.manage().window().maximize();
		// Proving some implicit wait to load all elements on Website
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String expectedUrl = "https://www.demoblaze.com/";
		// Open DemoBlaze Website
		driver.get(expectedUrl);
		String actualUrl = driver.getCurrentUrl();
		// Validating the URL
		if (actualUrl.equalsIgnoreCase(expectedUrl)) {
			System.out.println("Verification Successful: You are on demoblaze Website");
		} else {
			System.out.println("Verification Failed:you are on wrong website");

		}

	}

	@Test(priority = 1)
	public void greetingUser() {
		try {
			//Click on login button
			driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
			//enter user name
			driver.findElement(By.id("loginusername")).sendKeys("harpalyadav");
			//enter password
			driver.findElement(By.id("loginpassword")).sendKeys("Harry8888");
			driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
			String expectedGreeting = "Welcome harpalyadav";
			Thread.sleep(5000);
			String actualGreeting = driver.findElement(By.id("nameofuser")).getText();
			//Verifying Greeting message
			if (actualGreeting.equals(expectedGreeting)) {
				System.out.println("Welcome Greeting is displayed");
			} else {
				System.out.println("Welcome Greeting is not displayed");
			}
			Thread.sleep(5000);
			//logout
			driver.findElement(By.id("logout2")).click();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public void signUp() {
		try {
			//Navigation to Signup URL
			driver.findElement(By.id("signin2")).click();
			//enter user name
			driver.findElement(By.id("sign-username")).sendKeys("harpal");
			//enter password
			driver.findElement(By.id("sign-password")).sendKeys("har1234");
			driver.findElement(By.xpath("//button[text()='Sign up']")).click();
			Thread.sleep(2000);
			//handling pop-up
			Alert alt = driver.switchTo().alert();
			System.out.println(alt.getText());
			alt.accept();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 3)
	public void verifyName() {
		try {
			//refreshing URL
			driver.navigate().refresh();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
			driver.findElement(By.id("loginusername")).sendKeys("harpal");
			driver.findElement(By.id("loginpassword")).sendKeys("har1234");
			driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
			String expectedGreeting = "Welcome harpal";
			Thread.sleep(5000);
			String actualGreeting = driver.findElement(By.id("nameofuser")).getText();
			//Verifying user Name
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
