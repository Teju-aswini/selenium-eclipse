import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.findElement(By.cssSelector("#username")).sendKeys("saurav");
	    
		driver.findElement(By.cssSelector("#password")).sendKeys("krishna");
		
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	}

}
