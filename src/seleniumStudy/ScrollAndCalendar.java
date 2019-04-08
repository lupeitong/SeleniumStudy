package seleniumStudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollAndCalendar {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.southwest.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		driver.findElement(By.id("LandingPageAirSearchForm_originationAirportCode")).sendKeys("DAL");
		driver.findElement(By.id("LandingPageAirSearchForm_destinationAirportCode")).sendKeys("LAX");
		JavascriptExecutor date = (JavascriptExecutor) driver;
		date.executeScript("document.getElementById('LandingPageAirSearchForm_departureDate').value='03/31/2019'");
		date.executeScript("document.getElementById('LandingPageAirSearchForm_returnDate').value='04/03/2019'");
		driver.findElement(By.id("LandingPageAirSearchForm_submit-button")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
