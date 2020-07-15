package browser;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	private static ChromeDriver browser;
	
	public static ChromeDriver getBrowser() {
		 if (browser == null) {
			 System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\lazov\\.m2\\repository\\webdriver\\chromedriver\\win32\\83.0.4103.39");
			 WebDriverManager.chromedriver().setup();
			 browser = new ChromeDriver();
			}
			return browser;
	}

}