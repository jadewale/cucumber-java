package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(how = How.ID, using="CustomerEmail")
	private WebElement email;
	
	@FindBy(how = How.ID, using="CustomerPassword")
	private WebElement password;
	
	@FindBy(how = How.XPATH, using="//input[@value='SIGN IN']")
	private WebElement signInButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void navigateTo_SignIn() {
		driver.navigate().to("https://fearofgod.com/account/login");
	}
	
	public void enterEmail(String emailText) {
		email.sendKeys(emailText);
	}
	
	public void enterPassword (String passwordText) {
		password.sendKeys(passwordText);
	}
	
	public void signIn() {
		signInButton.click();
	}
	
	public void login() {
		navigateTo_SignIn();
		enterEmail("jbadewale@yahoo.com");
		enterPassword("abcdefg");
		signIn();
	}
}
