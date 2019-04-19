package SanityTests;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/pranay/Downloads/Compressed/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier");
		driver.findElement(By.name("identifier")).sendKeys("ppranaybhaskar");
		driver.findElement(By.className("CwaK9")).click();
		driver.findElement(By.name("password")).sendKeys("abcdd");
		
		/*//DROP DOWN
		
		Select adrop= new Select(driver.findElement(By.name("country")));
		adrop.selectByVisibleText("India");
		List<WebElement> droplist= adrop.getOptions();
		for (WebElement e:droplist)
		{
			System.out.println(e.getText());
		}*/
		
		//HTML TABLE
		
		/*driver.get("https://en.wikipedia.org/wiki/Chiranjeevi_filmography");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath(".//*[@id='mw-content-text']/table[2]/tbody/tr[2]/td[3]/i/a")).getText());
		
		WebElement a=driver.findElement(By.xpath(".//*[@id='mw-content-text']/table[5]"));
		
		List<WebElement> rows=a.findElements(By.tagName("tr"));
		
		//System.out.println(b.size());
		
		for(WebElement e : rows) {
			
			List<WebElement> cols=e.findElements(By.tagName("td"));
			
			for(WebElement f : cols) {
				
			  System.out.println(f.getText());
			  
			}
		
			}	*/
				
			//Mouse Over
//		Actions build= new Actions(driver);
//		WebElement a=driver.findElement(By.xpath(".//*[@id='mw-content-text']/table[5]"));
//		build.moveToElement(a).build().perform();
		
			
	}

}
