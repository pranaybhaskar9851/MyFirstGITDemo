package SanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLogin {

public static void main(String [] args)
{
	System.setProperty("webdriver.chrome.driver", "C:/Users/pranay/Downloads/Compressed/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	//WebDriver driver= new FirefoxDriver();
	driver.get("http://www.gcrit.com/build3/admin/login.php?osCAdminID=qrae2aki0cv29ehjd47nprqgp2");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin@123");
	driver.findElement(By.id("tdb1")).click();
	
	String url1= driver.getCurrentUrl();
	if(url1=="http://www.gcrit.com/build3/admin/index.php?osCAdminID=qrae2aki0cv29ehjd47nprqgp2")
	{
		System.out.println("Login Successfull");
	}
	else
	{
		System.out.println("Login UnSuccessfull");
		
	}
	
	driver.close();
}
}

