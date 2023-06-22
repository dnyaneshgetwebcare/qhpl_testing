package baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public WebDriver driver;

	public void initialize() {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome exe\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://192.168.20.254/gccvatpro_test_new/index.php?r=site%2Flogin");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
}