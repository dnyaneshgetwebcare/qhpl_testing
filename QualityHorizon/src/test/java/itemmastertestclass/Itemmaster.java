package itemmastertestclass;

import org.testng.annotations.BeforeClass;

import baseclass.Baseclass;
import pomclasses.Pom1;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pomitemmaster.Itemmasterpom;
import utilityclass.Utilityclass;


public class Itemmaster extends Baseclass {

	Pom1 pm1;
	Itemmasterpom item;
	
	@BeforeClass
	public void openbrowser() throws InterruptedException, IOException {
		initialize();

		 pm1 = new Pom1(driver);
		 item = new Itemmasterpom(driver);
	
	}
	
	@BeforeMethod
	public void login() throws InterruptedException, IOException {
		Thread.sleep(2000);
		pm1.name(Utilityclass.getDataFromPF("username1"));
		Thread.sleep(2000);
		pm1.psw(Utilityclass.getDataFromPF("password"));
		Thread.sleep(2000);
		pm1.b1();
		Thread.sleep(2000);
	    item.dashboard();
		Thread.sleep(5000);
		item.im();
	//	pm1.itemmaster();
	}
	
	@Test
	public void addgood() throws Exception{
            
		    Thread.sleep(2000);
			item.goods();
		    item.action();
	 
		
	}
	
	@AfterClass
	public void Logout() {
		
	}
	
	@AfterMethod
	public void teardown() {
		
	}
	
	
}
