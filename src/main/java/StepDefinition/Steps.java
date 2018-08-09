package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.SignUpPage;
import cucumber.api.java.en.Then;

public class Steps {
 
  WebDriver driver;
  SignUpPage signUp;
  HomePage homePage;
  String path = "Downloads" + getSystemProperty("file.separator") + "chromedriver";
  String exePath = getSystemProperty("user.home") + getSystemProperty("file.separator").concat(path);
  
  @Given("^user is on Home Page$")
  public void given() throws Throwable {
	  System.setProperty("webdriver.chrome.driver", exePath);
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browserstack.local", "true");
	  driver = new ChromeDriver();
	  homePage = new HomePage(driver);
	  homePage.navigateTo_HomePage();
  }
  
  @When("^he navigates to sign up$")
	public void navigateToSignUp()  {
		homePage.navigateTo_SignUp();
	}

  @When("^you enter personal details to sign up$")
  public void signUp() throws Throwable {
	 signUp = new SignUpPage(driver);
	 signUp.fillPersonalDetails();
  }

  @Then("^you are in Then annotation$")
  public void then() throws Throwable {
	  System.out.println("This step click on the Reset button.");
  }
  
  static String getSystemProperty(String prop) {
		return System.getProperty(prop);
  }
 
}
