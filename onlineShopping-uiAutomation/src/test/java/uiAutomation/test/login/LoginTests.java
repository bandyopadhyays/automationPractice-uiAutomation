package uiAutomation.test.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTests {
	
	@Test
	public void tc_001_LoginWithValidCredentials() {
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/driverServer/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.close();
	}

}
