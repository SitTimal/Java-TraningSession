package SeleniumSession2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\auto\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals("google")) {
			System.out.println("correct title");
		} else {
			System.out.println("in- correct tittle");
		}

		System.out.println(driver.getCurrentUrl());

		driver.quit();
		driver.close();
	}

}
