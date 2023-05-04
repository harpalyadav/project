package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoBlazeLogin {
	WebDriver driver;

	public DemoBlazeLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Log in')]")
	WebElement loginBtn;

	@FindBy(id = "loginusername")
	WebElement userName1;

	@FindBy(id = "loginpassword")
	WebElement userPassword;
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	WebElement login;

	public void signin() {
		loginBtn.click();
	}

	public void enterName(String uName) {
		userName1.sendKeys(uName);
	}

	public void enterPass(String uPass) {
		userPassword.sendKeys(uPass);
	}

	public void clickBtn() {
		login.click();
	}
}