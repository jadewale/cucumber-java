import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int c=0; c < 40; c++) {
			runT();
			
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void runT() {
		
		 String path = "Downloads" + getSystemProperty("file.separator") + "chromedriver";
		 String exePath = getSystemProperty("user.home") + getSystemProperty("file.separator").concat(path);
		 
		 System.setProperty("webdriver.chrome.driver", exePath);
			 
	
		 DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	        ChromeOptions options = new ChromeOptions(); 
	        options.addArguments("incognito");
	        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	   	 driver = new ChromeDriver();
		 driver.get("https://premiercoolturfwars.com/vote.php");
		
		 
		 WebElement element = driver.findElement(By.cssSelector("button[data-id='30']"));
		 element.click();
		driver.quit();

		
		
	}
	
	 static String getSystemProperty(String prop) {
			return System.getProperty(prop);
	  }

}
