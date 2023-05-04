package testCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objectRepository.DemoBlazeLogin;
import objectRepository.DemoBlazeSignUp;

public class TestCase1{
	

	public static WebDriver driver;

	public static void main(String[] args) {
		// launch Chrome browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Open demoblaze website
		driver.get("https://www.demoblaze.com/");
		
		//creating object of DemoBlazeLogin Class
		DemoBlazeLogin dbl=new DemoBlazeLogin(driver);
		dbl.signin();
		dbl.enterName("harpalyadav");
		dbl.enterPass("Harry8888");
		dbl.clickBtn();
		
		DemoBlazeSignUp dbs=new DemoBlazeSignUp(driver);
		dbs.signin();
		dbs.enterName("");
		dbs.enterPass("");
		dbs.clickBtn();
		
	}

}
