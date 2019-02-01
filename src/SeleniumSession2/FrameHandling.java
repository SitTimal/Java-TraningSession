package SeleniumSession2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\auto\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/index.html");

		driver.findElement(By.name("username")).sendKeys("SitaTimalsina");
		driver.findElement(By.name("password")).sendKeys("5Timalsina");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);

		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();

		driver.quit();
		driver.close();

	}

}
