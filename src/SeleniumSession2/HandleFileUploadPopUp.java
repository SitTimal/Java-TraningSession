package SeleniumSession2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\auto\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://html.com/input-type-file/");

		driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\SitaTimalsina\\Desktop\\class it");

	}

}
