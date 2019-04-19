package SanityTests;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/pranay/Downloads/Compressed/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		//driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");
		WebElement uname=driver.findElement(By.id("usernameId"));
		uname.sendKeys("pranay_161");
		driver.findElement(By.name("j_password")).sendKeys("Neeraja@33");
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter Capta");
		String cap=sc.nextLine();
		driver.findElement(By.id("nlpAnswer")).sendKeys(cap);
		driver.findElement(By.id("loginbutton")).click();
		
		String URL=driver.getCurrentUrl();
		if (URL.contains("https://www.irctc.co.in/eticketing/home"))
		{
			System.out.println("Login Successfull");
		}
		
		driver.close();
	}

}
