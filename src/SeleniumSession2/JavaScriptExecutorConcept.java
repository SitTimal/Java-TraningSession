package SeleniumSession2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\auto\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://classic.crmpro.com/login.cfm");

		driver.findElement(By.name("username")).sendKeys("SitaTimalsina");
		driver.findElement(By.name("password")).sendKeys("5Timalsina");
		// driver.findElement(By.xpath("//input[@type='submit']")).click();

		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));

		flash(loginBtn, driver);

	}

	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 100; i++) {
			changeColor("rgb(139,0,0)", element, driver);
			changeColor(bgcolor, element, driver);
		}
	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor='" + color + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {

		}
	}
}