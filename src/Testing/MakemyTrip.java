package Testing;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class MakemyTrip {
	public static void main(String args[]) throws InterruptedException
	{
		//Create prefs map to store all preferences 
		Map<String, Object> prefs = new HashMap<String, Object>();

		//Put this into prefs map to switch off browser notification
		prefs.put("profile.default_content_setting_values.notifications", 2);

		//Create chrome options to set this prefs
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		//Now initialize chrome driver with chrome options which will switch off this browser notification on the chrome browser
		WebDriver driver = new ChromeDriver(options);
		
		System.setProperty("webdriver.chrome.driver","E:\\\\chromedriver.exe");
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
		driver.findElement(By.id("hp-widget__depart")).click();
		
		
		
		
		
		
		
		//		driver.close();
	}
	
	

}
