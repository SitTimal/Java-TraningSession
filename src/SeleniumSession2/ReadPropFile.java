package SeleniumSession2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFile {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();

		FileInputStream ip = new FileInputStream(
				"C:\\Users\\SitaTimalsina\\eclipse-workspace\\JavaTraningSession\\src\\SeleniumSession2\\config.properties");

		prop.load(ip);

		System.out.println(prop.getProperty("Name"));

		System.out.println(prop.getProperty("Age"));

		String url = prop.getProperty("URL");
		System.out.println(url);

		String browserName = prop.getProperty("Browser");
		System.out.println(browserName);

		System.setProperty("webdriver.chrome.driver", "c:\\auto\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.findElement(By.xpath(prop.getProperty("firstName_xpath"))).sendKeys(prop.getProperty("firstName"));
		driver.findElement(By.xpath(prop.getProperty("lastName_xpath"))).sendKeys(prop.getProperty("lastName"));
		driver.findElement(By.xpath(prop.getProperty("Password_xpath"))).sendKeys(prop.getProperty("Password"));

		driver.quit();
		driver.close();

	}

}
