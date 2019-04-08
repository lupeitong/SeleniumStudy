package seleniumStudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetInputData {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("firstname")).sendKeys("Chengchao");
		driver.findElement(By.name("lastname")).sendKeys("Lu");
		String Firstname = driver.findElement(By.name("firstname")).getAttribute("value");
		String Lastname = driver.findElement(By.name("lastname")).getAttribute("value");
		
		System.out.println("Your firstname is: "+Firstname+" and "+"Your lastname is: "+Lastname);
		driver.quit();
	}

}
