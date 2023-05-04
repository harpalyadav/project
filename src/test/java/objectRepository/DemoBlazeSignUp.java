package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoBlazeSignUp {
	WebDriver driver;

	public DemoBlazeSignUp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "signin2")
	WebElement signupBtn;

	@FindBy(id = "sign-username")
	WebElement userName;

	@FindBy(id = "sign-password")
	WebElement userPassword;
	@FindBy(xpath = "//button[text()='Sign up']")
	WebElement signup;

	public void signin() {
		signupBtn.click();
	}

	public void enterName(String uName) {
		userName.sendKeys(uName);
	}

	public void enterPass(String uPass) {
		userPassword.sendKeys(uPass);
	}

	public void clickBtn() {
		signup.click();
	}
}
