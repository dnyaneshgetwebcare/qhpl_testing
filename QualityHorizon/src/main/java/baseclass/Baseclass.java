package baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public WebDriver driver;
//hello test commit
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome exe\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://erphorizon.com/company/projectmanagement612/index.php?r=dashboard-profile%2Findex");

		driver.manage().window().maximize(); //tect commit 

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// commit 2 

	}
}