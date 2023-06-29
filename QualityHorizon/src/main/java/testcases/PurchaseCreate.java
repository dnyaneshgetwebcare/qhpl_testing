package testcases;

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
import poms.PurchaseBilling;
import poms.PurchaseOrderCreate;
import poms.GoodsReciept;
import utilityclass.Utilityclass;

public class PurchaseCreate extends Baseclass {
	Pom1 pm1;
	PurchaseOrderCreate pm2;
	GoodsReciept pm3;
	PurchaseBilling pm4;
	int Testid;
//gghgh
	@BeforeClass
	public void openBrowser() throws InterruptedException, IOException {
		initialize();

		pm1 = new Pom1(driver);
		pm2 = new PurchaseOrderCreate(driver);
		pm3 = new GoodsReciept(driver);
		pm4 = new PurchaseBilling(driver);
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
		pm1.purchase();
		Thread.sleep(2000);
		pm2.clickPurchase();
		pm2.Leave();
		pm2.clickAction();
		pm2.searchVendor();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");
		pm2.selectItem1();
		Thread.sleep(25000);
		Thread.sleep(2000);
		pm4.aaction();
		pm4.vendorInvoiceClick();
		pm4.saveButton();

		pm4.paymentDueDate();
		pm4.payment();
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

		pm4.amount();
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
	}

	@Test(priority = 1)
	public void verifyAmount() throws EncryptedDocumentException, IOException, InterruptedException {

		String actual = pm4.finalText();
		String excepted = Utilityclass.getDataFromExcel(1, 35);
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
