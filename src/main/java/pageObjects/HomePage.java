package pageObjects;

import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateTo_HomePage() {
		driver.get("https://fearofgod.com/");
	}
	
	public void navigateTo_SignUp() {
		driver.navigate().to("https://fearofgod.com/account/register");
	}
}
