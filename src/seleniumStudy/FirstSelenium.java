package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FirstSelenium {

	public static void main(String[] args) throws Exception {
		
	   System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.objectspy.com/register/signup.php");
	   driver.findElement(By.name("email")).sendKeys("luchengchao0126@gmail.com");
	   driver.findElement(By.name("password")).sendKeys("Jack6262026644");
	   driver.findElement(By.name("login")).click();
	   Thread.sleep(10000);
	   driver.close();
	}

}
