package Sample.Trail2;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Sample1 {

	static WebDriver driver = null;
		@Test
		public void ruser()
		{
			System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
			driver = new ChromeDriver();
			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().window().maximize();
			driver.get("https://www.linkedin.com/");
		}
		
		

	

}
