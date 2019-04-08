package seleniumStudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextVerify {
public static void main(String [] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.partialLinkText("Forgot")).click();
	boolean e = driver.findElement(By.className("uiHeaderTitle")).isDisplayed();
	if (e == true) {
		System.out.println("Passed");
	}
	else
	{
		System.out.println("Failed");
	}
	driver.close();
}
}
