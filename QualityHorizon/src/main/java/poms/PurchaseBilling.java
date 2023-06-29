package poms;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseBilling {
	public WebDriver driver;

	// Vendor Invoice
		
	@FindBy(xpath = "//a[text()=' Vendor Invoice                        ']")
	private WebElement billing;
	
//	@FindBy(xpath = "//a[contains(text(),' Action            ')]")
//	private WebElement action;
	
	@FindBy(xpath = "(//a[contains(text(),' Action                  ')]")
	private WebElement selectpaymentterms;

	
	@FindBy(xpath = "//a[text()=' Vendor Invoice                      ']")
	private WebElement vendorInvoiceClick;
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	private WebElement search;
//	@FindBy(xpath = "//li[contains(@id,'select')]")
//	private WebElement selectpt;

	// common

	@FindBy(xpath = "//button[@onclick='submitFormPDF()']")
	private WebElement save;
	@FindBy(xpath = "(//img[@src='img/icons/back-arrow.png'])[2]")
	private WebElement backbutton;
	@FindBy(xpath = "(//a[@data-toggle='dropdown'])[4]")
	private WebElement aaction;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement searchfield;
	@FindBy(xpath = "//input[@id='billingheader-payment_due_date']")
	private WebElement paymentduedate;

	@FindBy(xpath = "(//a[@style='cursor:pointer'])[1]")
	private WebElement payment;
	@FindBy(xpath = "//a[@class='btn btn-warning dropdown-toggle pull-right hover-dropdown dropdown_action_open']")
	private WebElement dropdownactionopen;
	@FindBy(xpath = "(//li[@style='cursor: pointer;'])[9]")
	private WebElement popup3;
	@FindBy(xpath = "//td[@id='settlement_total']")
	private WebElement settlement;
	@FindBy(xpath = "//input[@id='customerpayment-amount_temp']")
	private WebElement amount;

	@FindBy(xpath = "((//tr[@style='background-color:#F9F908;font-size:15px;font-weight:bold'])//td)[2]")
	private WebElement finaltext;

	// Accept Quotation
	@FindBy(xpath = "//a[text()=' Accept']")
	private WebElement accept;

	public PurchaseBilling(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void aaction() throws InterruptedException {
		aaction.click();
		Thread.sleep(2000);
//		accept.click();
	}

	public void selectPaymentTerms() throws InterruptedException {

		aaction.click();
		Thread.sleep(2000);
		billing.click();
		Thread.sleep(2000);
		selectpaymentterms.click();
		Thread.sleep(2000);
		searchfield.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

	}

	public void vendorInvoiceClick() throws InterruptedException {

		vendorInvoiceClick.click();
		search.click();
		searchfield.sendKeys("100");
		Thread.sleep(2000);
//		selectpt.click();

		// selectpaymentterms.click();

//		searchfield.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);

	}

	public void paymentDueDate() throws InterruptedException {

		paymentduedate.click();
		paymentduedate.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		save.click();
		Thread.sleep(50000);
		backbutton.click();
		Thread.sleep(2000);
	}

	public void pDueDate() throws InterruptedException {

		paymentduedate.click();
		Thread.sleep(2000);
		paymentduedate.sendKeys(Keys.ENTER);
	}

	public void payment() throws InterruptedException {
		Thread.sleep(5000);
		aaction.click();
		Thread.sleep(2000);
		payment.click();
		Thread.sleep(4000);
		dropdownactionopen.click();
		Thread.sleep(2000);
		popup3.click();
		Thread.sleep(2000);

	}

	public void amount() throws InterruptedException {
		Thread.sleep(2000);
		String text = settlement.getText();
		Thread.sleep(2000);
		amount.click();
		amount.sendKeys(text);
		Thread.sleep(2000);
		save.click();
		Thread.sleep(15000);
	}

	public String finalText() {

		String finalamount = finaltext.getText();
		return finalamount;
	}
		public void saveButton() throws InterruptedException {
			save.click();

	}

}
