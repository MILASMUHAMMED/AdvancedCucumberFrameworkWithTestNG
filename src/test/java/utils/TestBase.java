package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws Exception {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl");
		
		if(driver == null)
		{
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//test//resources//Chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				//firefox browser opening code
			}
			else{
				throw new Exception("invalid browser specified.");
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(url);
			driver.manage().window().maximize();
		}
		return driver;
	}
}
