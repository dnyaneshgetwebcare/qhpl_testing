package baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public WebDriver driver;
//hello test commit
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_EXE");
		driver = new ChromeDriver();

		driver.get("");

		driver.manage().window().maximize(); 

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//commit from omkar 
	}
}