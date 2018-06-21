package Testing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewTest {

	public static void main(String args[])
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		driver.findElement(By.cssSelector("#password .whsOnd.zHQkBf")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		driver.close();
		
	}
}
