package SanityTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Test333 {
	public WebDriver driver;
@BeforeClass
public void launch(){
	System.setProperty("webdriver.chrome.driver","C:/Users/pranay/Downloads/Compressed/chromedriver.exe");
		driver = new ChromeDriver();
	System.out.println("launch");
}	
@Test
public void search1()
{
	driver.get("http://www.gmail.com");
	System.out.println("search");
}
	@Test
	public void search2()
	{
		driver.get("http://www.yahoo.com");
		System.out.println("search");	
	}
@AfterClass
public void closeb()
{
	driver.close();
	System.out.println("close");
	
	
	}
	
}
