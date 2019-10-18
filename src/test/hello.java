package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class hello {

	public WebDriver driver = null;

	@Test
	public void Demo() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\boyko\\Documents\\eclipse-workspace\\TestNG_TUT\\src\\test\\datadriven.properties");

		prop.load(fis);

		System.out.println("Hello " + prop.getProperty("username"));

		////// Check for driver Chrome of Firebox
		if (prop.getProperty("browser").equals("firefox")) {
			WebDriver driver = new FirefoxDriver();
		} else if (prop.getProperty("browser").equals("chrome")) {
			WebDriver driver = new ChromeDriver();
		}

		WebDriver driver = new FirefoxDriver();
		driver.get(prop.getProperty("url"));

	}

	@Test
	public void SecondTest() {
		System.out.println("Second Test is passing");
	}

}
