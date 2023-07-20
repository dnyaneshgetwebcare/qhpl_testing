
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
public class Customerpayment extends   salesorder
{

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
//				pm1.itemmaster();
				pm1.sales();
				pm2.customerpayment();
				pm2.paymentreceived();
			pm3.paymentmethod();
				pm3.selectaccount();
			}

			@Test(priority = 1)
			public void verifyAmount() throws EncryptedDocumentException, IOException, InterruptedException {

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
