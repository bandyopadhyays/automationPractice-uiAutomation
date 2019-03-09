package uiAutomation.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTests {
	
	@Test
	public void tc_001_LoginWithValidCredentials() {
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/driverServer/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		// test@automation.com Newuser1
		WebElement login=driver.findElement(By.xpath("//div/a[@class='login']"));
		login.click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@automation.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Newuser1");
		WebElement submit=driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		submit.click();
		driver.close();
	}

}
