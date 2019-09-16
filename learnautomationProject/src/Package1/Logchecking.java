package Package1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class Logchecking {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver","D:/Browser Driverss/chromedriver.exe");
			
			System.setProperty("webdriver.chrome.logFile","D:/Browser Driverss/LogFile.txt");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://login.wordpress.org/?locale=en_US");
			driver.findElement(By.id("user_login")).sendKeys("admin");
			driver.findElement(By.id("user_pass")).sendKeys("demo123");
			driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
		}

	}

	

