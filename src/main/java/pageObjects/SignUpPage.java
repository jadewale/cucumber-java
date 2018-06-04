package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	@FindBy(how = How.ID, using="FirstName")
	private WebElement firstName;
	
	@FindBy(how = How.ID, using="LastName")
	private WebElement lastName;
	
	@FindBy(how = How.ID, using="Email")
	private WebElement email;
	
	@FindBy(how = How.ID, using="CreatePassword")
	private WebElement password;
	
	@FindBy(how = How.XPATH, using="//input[@value='Create']")
	private WebElement createButton;
	
	public SignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterFirstName(String firstNameText) {
		firstName.sendKeys(firstNameText);
	}
	
	public void enterLastName(String lastNameText) {
		lastName.sendKeys(lastNameText);
	}
	
	public void enterEmail(String emailText) {
		email.sendKeys(emailText);
	}
	
	public void enterPassword(String passwordText) {
		password.sendKeys(passwordText);
	}
	
	public void createAccount() {
		createButton.click();
	}
	
	public void fillPersonalDetails() {
		enterFirstName("Jolaade");
		enterLastName("Adewale");
		enterEmail("jbadewale@yahoo.com");
		enterPassword("abcdefg");
		createAccount();
	}
}
