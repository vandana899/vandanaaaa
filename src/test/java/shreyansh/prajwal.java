package shreyansh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class prajwal {
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	WebDriver driver;
	
	@BeforeTest
	public void bt() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
@Test 
public void tc1() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Admin")).click();
	Actions act=new Actions(driver);
	WebElement ele= driver.findElement(By.xpath("(//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
	act.sendKeys(ele,Keys.ARROW_DOWN).build().perform();
	act.sendKeys(ele,Keys.ARROW_DOWN).build().perform();
}

}
