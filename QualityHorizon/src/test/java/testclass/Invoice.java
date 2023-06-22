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
import pomclasses.Pomclass4;
import utilityclass.Utilityclass;

public class Invoice extends Baseclass {
	Pom1 pm1;
	Pomclass2 pm2;
	Pomclass3 pm3;
	Pomclass4 pm4;
	int Testid;

	@BeforeClass
	public void openBrowser() throws InterruptedException, IOException {
		initialize();

		pm1 = new Pom1(driver);
		pm2 = new Pomclass2(driver);
		pm3 = new Pomclass3(driver);
		pm4 = new Pomclass4(driver);
	}

	@BeforeMethod
	public void login() throws InterruptedException, IOException {
		Thread.sleep(2000);
		pm1.name(Utilityclass.getDataFromPF("username1"));
		Thread.sleep(2000);
		pm1.psw(Utilityclass.getDataFromPF("password"));
		Thread.sleep(2000);
		pm1.b1();
		pm1.sales();
		pm4.invoice();
		pm2.leave();
		Thread.sleep(2000);
		pm2.aaction();
		pm4.wocinvoice();
		pm2.searchCustomer();
		Thread.sleep(2000);
		pm3.pDueDate();

		pm3.OselectPaymentTerms();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,700)");
		pm2.selectItem1();
		// pm2.savesubmit();
		Thread.sleep(2000);
		pm2.Save();
		pm4.sadraft();
		Thread.sleep(2000);
		pm2.Save();

		pm4.sapost();
		pm4.ok();
		Thread.sleep(25000);
		pm4.paymentreceived();
		pm4.save();

	}

	@Test(priority = 1)
	public void verifyAmount() throws EncryptedDocumentException, IOException, InterruptedException {

		String actual = pm3.finalText();
		String excepted = Utilityclass.getDataFromExcel(5, 35);
		Reporter.log(excepted, true);
		Assert.assertEquals(actual, excepted);
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
