package pomclasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pomclass3 {
	public WebDriver driver;

	@FindBy(xpath = "(//a[@data-toggle='dropdown'])[4]")
	private WebElement aaction;
	@FindBy(xpath = "//li[@onclick='goods_redirection()']")
	private WebElement goodsdelivery;
	@FindBy(xpath = "//input[@class='chk_box_main']")
	private WebElement chkbox;
	@FindBy(xpath = "//b[text()='Post Goods Delivery']")
	private WebElement postgoodsdelivery;
	@FindBy(xpath = "//button[@class='btn btn-info']")
	private WebElement save;
	@FindBy(xpath = "//img[@id='back_button']")
	private WebElement backbutton;

	@FindBy(xpath = "//b[text()='OPEN']")
	private WebElement billing;
	@FindBy(xpath = "(//span[@class='select2-selection__placeholder'])[2]")
	private WebElement selectpaymentterms;
	@FindBy(xpath = "//span[@id='select2-billingheader-payment_terms-container']")
	private WebElement OselectPaymentTerms;
	@FindBy(xpath = "//input[@type='search']")
	private WebElement search;
	@FindBy(xpath = "//li[contains(@id,'select')]")
	private WebElement selectpt;

	
	
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

	public Pomclass3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void aaction() throws InterruptedException {
		aaction.click();
		Thread.sleep(2000);
		accept.click();
	}

	public void goodsDelivery() throws InterruptedException {
		aaction.click();
		Thread.sleep(2000);
		goodsdelivery.click();
		Thread.sleep(2000);
		chkbox.click();
		Thread.sleep(2000);
		postgoodsdelivery.click();
		Thread.sleep(2000);
		save.click();
		Thread.sleep(50000);
		backbutton.click();
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

	public void OselectPaymentTerms() throws InterruptedException {
		
		
		OselectPaymentTerms.click();
		search.click();
		searchfield.sendKeys("100");
		Thread.sleep(2000);
		selectpt.click();
		
		//selectpaymentterms.click();

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

}
