package shreyansh;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class guru {
	public static String url="https://demo.guru99.com/test/newtours/";
	WebDriver driver;
	
	@BeforeTest
	public void bt() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		

	}
	@Test
	public void rr() throws InterruptedException {
		driver.findElement(By.linkText("REGISTER")).click();
		//Actions act=new Actions(driver);
//		WebElement ele= driver.findElement(By.name("country"));
//		act.click(ele).build().perform();
//		Thread.sleep(4000);
//		
//		act.sendKeys(ele, Keys.ARROW_DOWN).click().build().perform();
//		//act.sendKeys(ele,key)
//		
//		
		
		//
//		Select s=new Select(driver.findElement(By.name("country")));
//		Thread.sleep(4000);
//		s.selectByIndex(5);
		Actions act=new Actions(driver);
		WebElement ele= driver.findElement(By.name("city"));
		act.contextClick(ele).click().build().perform();
		
		
		
		
	}
}
