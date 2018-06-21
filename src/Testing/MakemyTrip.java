package Testing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class MakemyTrip {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\\\chromedriver.exe");
		//Create prefs map to store all preferences 
		Map<String, Object> prefs = new HashMap<String, Object>();

		//Put this into prefs map to switch off browser notification
		prefs.put("profile.default_content_setting_values.notifications", 2);

		//Create chrome options to set this prefs
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		//Now initialize chrome driver with chrome options which will switch off this browser notification on the chrome browser
		WebDriver driver = new ChromeDriver(options);
		
		
//		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.id("hp-widget__sfrom")).click();
		//Select sfrom = new Select(driver.findElement(By.id("hp-widget__sfrom")));
		//sfrom.selectByVisibleText("Mumbai, India");
		//sfrom.selectByIndex(1);
		//driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content hp-widget__sfrom']/li//span[text()='Goa, India ']")).click();
		driver.findElement(By.id("hp-widget__sTo")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@id='ui-id-2']//span[contains(text(),'Kolkata')]")).click();
		
		Actions action = new Actions(driver);
		driver.findElement(By.id("hp-widget__depart")).click();
		action.moveToElement(driver.findElement(By.xpath("(//a[@class='ui-state-default' and text()='11'])[1]"))).click().build().perform();
		action.moveToElement(driver.findElement(By.xpath("(//a[@class='ui-state-default ui-state-hover' and text()='11'])[1]"))).click().build().perform();

	//	driver.findElement(By.id("hp-widget__depart")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@class='ui-state-default'and text()='17'] /following-sibling::span[@class='calendarPrice low' and text()='4594']")).click();
		driver.findElement(By.id("hp-widget__return")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ui-state-default' and text()='18'] / following-sibling::span[@class='calendarPrice low' and text()='4866']")).click();
		driver.findElement(By.id("hp-widget__paxCounter_pot")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='adult_counter']/li [text()='4'] ")).click();
		driver.findElement(By.xpath("//ul[@class='child_counter'] / li[text()='1']")).click();
		driver.findElement(By.xpath("//ul[@class='infant_counter'] / li[text()='2']")).click();
		
		
		
		
		//driver.close();
	}
	
	

}
