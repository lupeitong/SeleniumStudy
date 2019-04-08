package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		String ActualTitle = driver.getTitle();
		System.out.println("The page title is: "+ActualTitle);
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.name("login")).sendKeys("hello");
		String input1 = driver.findElement(By.name("login")).getAttribute("value");
		System.out.println("usename is: "+input1);
		driver.findElement(By.name("passwd")).sendKeys("123");
		String input2 =driver.findElement(By.name("passwd")).getAttribute("value");
		System.out.println("password is: "+input2);
		driver.findElement(By.name("proceed")).click();
		driver.close();
		
		
	}

}
