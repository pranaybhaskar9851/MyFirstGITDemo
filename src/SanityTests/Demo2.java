package SanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo2 {

	private static final String s1 = "pp";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/Users/pranay/Downloads/Compressed/geckodriver.exe");
		//C:/Users/pranay/Downloads/Compressed/chromedriver.exe
		WebDriver driver= new FirefoxDriver();
		driver.get("http://hackerrank.com/login");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		 
		//driver.findElement(By.xpath("//*[@id='login']")).sendKeys("asad");
		 ;
		
		//*[@id="password"]

	}

}
