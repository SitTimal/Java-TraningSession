package SeleniumSession2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatoroncept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\auto\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");

		// driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("John");
		// driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Peter");

		driver.findElement(By.id("firstname")).sendKeys("Jina");
		driver.findElement(By.id("lastname")).sendKeys("Smith");

		driver.quit();
		driver.close();
	}

}
