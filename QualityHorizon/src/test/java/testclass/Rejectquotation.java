
package testclass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import pomclasses.Pom1;
import pomclasses.Pomclass2;
import pomclasses.Pomclass3;
import utilityclass.Utilityclass;

public class Rejectquotation extends Baseclass {
	Pom1 pm1;
	Pomclass2 pm2;
	Pomclass3 pm3;
	int Testid;

	@BeforeClass
	public void openBrowser() throws InterruptedException, IOException {
		initialize();

		pm1 = new Pom1(driver);
		pm2 = new Pomclass2(driver);
		pm3 = new Pomclass3(driver);

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
		pm1.sales();
		pm2.quotation();
		pm2.action();
		pm2.salesquotation();
		Thread.sleep(2000);
		pm2.searchCustomer();
		Thread.sleep(2000);

		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,600)");
		pm2.selectItem1();
		pm2.savesubmitq();
		// pm2.selectItem2();
		// pm2.selectItem3();
		// pm2.selectItem4();
		Thread.sleep(30000);
		pm3.raaction();
		Alert Alt = driver.switchTo().alert();
		Alt.accept();
		Thread.sleep(2000);
		pm3.update();

	}

	@Test(priority = 1)
	public void Rejected() throws EncryptedDocumentException, IOException, InterruptedException {
		 String rejectedText = pm2.rejected();
		 // Print the text
	        System.out.println("Rejected text: " + rejectedText);
	}

	@AfterMethod
	public void logout(ITestResult Result) throws InterruptedException, IOException {
		if (Result.getStatus() == ITestResult.FAILURE) {
			Utilityclass.takeScreenShot(driver, Testid);
		}

	}

	@AfterClass
	public void closeBrowser() {

	}

}
