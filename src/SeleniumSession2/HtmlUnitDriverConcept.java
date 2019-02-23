package SeleniumSession2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "c:\\auto\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// WebDriver driver = new HtmlUnitDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://classic.crmpro.com/login.cfm");

		System.out.println("Before login , title is:--" + driver.getTitle());
		// driver.findElement(By.xpath("//a[@href
		// =\"https://ui.cogmento.com\"]")).click();
		driver.findElement(By.name("username")).sendKeys("SitaTimalsina");
		driver.findElement(By.name("password")).sendKeys("5Timalsina");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Thread.sleep(3000);

		System.out.println("After login,title is :--" + driver.getTitle());

		driver.quit();
		driver.close();

	}

}
