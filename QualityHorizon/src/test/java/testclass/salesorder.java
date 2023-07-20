package testclass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
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

public class Verifyamount extends Baseclass {
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
//		pm1.itemmaster();
		pm1.sales();
		pm2.salesOrder();
		pm2.action();
		pm2.sorder();
		pm2.searchCustomer();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,700)");
		pm2.selectItem1();
		// pm2.netprice();
//		pm2.selectItem2();
//		pm2.selectItem3();
//		pm2.selectItem4();
//		Thread.sleep(25000);
		Thread.sleep(5000);
		pm2.savesubmit();
		Thread.sleep(45000);
		pm3.goodsDelivery();
		Thread.sleep(2000);
		pm3.selectPaymentTerms();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)");
		pm3.paymentDueDate();
		pm3.payment();
		Thread.sleep(15000);
		Set<String> AllIds = driver.getWindowHandles(); // MainPageID WindowPopID
		ArrayList<String> ar = new ArrayList<String>(AllIds); // MainPageID WindowPopID
		String MainPageID = ar.get(0);
		System.out.println(MainPageID);
		String WindowpopupID = ar.get(1);
		System.out.println(WindowpopupID);
		driver.switchTo().window(WindowpopupID);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		pm3.paymentmethod();
		Thread.sleep(2000);
		pm3.selectaccount();
		Thread.sleep(2000);
		pm3.amount();
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
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
