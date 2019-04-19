package SanityTests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestNG1 {
@Test
public void Aaa(){
		System.setProperty("webdriver.chrome.driver","C:/Users/pranay/Downloads/Compressed/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		String a=driver.getTitle();
		//Assert.assertEquals(actual, expected);
	}

}
