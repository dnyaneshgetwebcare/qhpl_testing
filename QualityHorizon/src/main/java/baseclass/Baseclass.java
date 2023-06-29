package baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Baseclass {
	public WebDriver driver;
//hello test commit
	public void initialize() {
		
		
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\chrome exe\\chromedriver.exe");
		driver = new ChromeDriver(ops);

		driver.get("http://192.168.20.254/gccvatpro_test_new/index.php?r=site%2Flogin");

		driver.manage().window().maximize(); //tect commit

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//commit from omkar 
	}
}