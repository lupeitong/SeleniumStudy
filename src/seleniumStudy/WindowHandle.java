package seleniumStudy;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "\\C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.southwest.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,800)");
		driver.findElement(By.linkText("Terms and Conditions")).click();;
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> ite = window.iterator();
		String parentWindow =ite.next();
		String childWindow =ite.next();
		driver.switchTo().window(childWindow);
	
		System.out.println(driver.getTitle());
		driver.findElement(By.id("accountNumber")).sendKeys("Jack");
		driver.findElement(By.id("accountPassword")).sendKeys("Jack626202");
		Thread.sleep(5000);
		driver.switchTo().window(parentWindow);
		
		driver.quit();
		
	}

}
