
package pomclasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pomclass2 {
	public WebDriver driver;

//Inquiry
	@FindBy(xpath = "//input[@id='salesitems-1-net_price_value']")
	private WebElement netprice;

	@FindBy(xpath = "//li[@id='enquiry_document']")
	private WebElement inquiry;
	@FindBy(xpath = "//a[text()=' Inquiry Document              ']")
	private WebElement idocument;
	@FindBy(xpath = "//input[@id='salesheader-cash_cust_name']")
	private WebElement cname;
	@FindBy(xpath = "//a[text()=' Sales Quotation                    ']")
	private WebElement squotation;
	@FindBy(xpath = "//a[text()=' Add Sales Quotation']")
	private WebElement asquotation;
	@FindBy(xpath = "//a[text()='Save']")
	private WebElement Save;
	@FindBy(xpath = "//a[text()='Save                      ']")
	private WebElement save1;

//quotation

	@FindBy(xpath = "//li[@id='quotation']")
	private WebElement quotation;
	@FindBy(xpath = "//a[contains(text(),' Sales Quotation  ')] ")
	private WebElement salesquotation;
	@FindBy(xpath = "//a[text()=' Sales Order']")
	private WebElement Order;
	@FindBy(xpath = "//a[text()=' Add Sales Order']")
	private WebElement addsales;
	@FindBy(xpath = "(//a[@data-toggle='dropdown'])[4]")
	private WebElement aaction;
	@FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
	private WebElement qsavesubmit;
	@FindBy(xpath = "(//button[contains(text(),'Save')])[2]")
	private WebElement savesubmitq;

	@FindBy(xpath = "//b[contains(text(),'Rejected')] ")
	private WebElement rejected;
//salesorder

	@FindBy(xpath = "(//li[@id='sales_order'])//a")
	private WebElement salesorder;
	@FindBy(xpath = "//input[@value='Leave this page']")
	private WebElement leave;
	@FindBy(xpath = "//a[@class='btn btn-warning dropdown-toggle pull-right hover-dropdown action-so']")
	private WebElement action;
	@FindBy(xpath = "//li[@onclick='order_create(1000)']")
	private WebElement sorder;
	@FindBy(xpath = "//b[@id='cust_details']")
	private WebElement popup1;
	@FindBy(xpath = "//input[@id='auto_search_customer_vw'] ")
	private WebElement searchcustomer;
	@FindBy(xpath = "//li[text()='omkar']")
	private WebElement selectname;

// selectitem1

	@FindBy(xpath = "(//b[text()='Select Item'])[2]")
	private WebElement element1;
	@FindBy(xpath = "//input[@id='itemselection-description']")
	private WebElement selectitem1;
	@FindBy(xpath = "//li[contains(@onclick,'selectgoodservitem')]")
	private WebElement itemselection1;
	@FindBy(xpath = "//a[@class='btn btn-info pull-right']")
	private WebElement add1;
	@FindBy(xpath = "//input[@id='salesitems-1-temp_discount_change']")
	private WebElement discount1;
	@FindBy(xpath = "//select[@id='salesitems-1-dropselect']")
	private WebElement dropdown1;
	@FindBy(xpath = "//button[text()=' Add New Item']")
	private WebElement addnewitem;

// selectitem2
	@FindBy(xpath = "(//b[text()='Select Item'])[3]")
	private WebElement element2;
	@FindBy(xpath = "//input[@id='salesitems-2-temp_discount_change']")
	private WebElement discount2;
	@FindBy(xpath = "//select[@id='salesitems-2-dropselect']")
	private WebElement dropdown2;

// selectitem3
	@FindBy(xpath = "(//b[text()='Select Item'])[4]")
	private WebElement element3;
	@FindBy(xpath = "//input[@id='salesitems-3-temp_discount_change']")
	private WebElement Discount3;
	@FindBy(xpath = "//select[@id='salesitems-3-dropselect']")
	private WebElement Dropdown3;

// selectitem4
	@FindBy(xpath = "(//b[text()='Select Item'])[5]")
	private WebElement element4;
	@FindBy(xpath = "//input[@id='salesitems-4-temp_discount_change']")
	private WebElement discount4;
	@FindBy(xpath = "//select[@id='salesitems-4-dropselect']")
	private WebElement dropdown4;

	@FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
	private WebElement savesubmit;

	@FindBy(xpath = "((//tr[@style='background-color:#F9F908;font-size:15px;font-weight:bold'])//td)[2]")
	private WebElement finaltext1;

	@FindBy(xpath = "//span[contains(text(),'Customer Payment')]")
	private WebElement customerpayment;
	@FindBy(xpath = "(//span[contains(text(),'Payments Receiv')])[1]")
	private WebElement paymentreceived;

	public Pomclass2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void customerpayment() throws InterruptedException {
		customerpayment.click();
		Thread.sleep(2000);

	}

	public void paymentreceived() throws InterruptedException {
		paymentreceived.click();
		Thread.sleep(2000);
		leave.click();
		Thread.sleep(2000);

	}

	public String rejected() {
		String Reejected = rejected.getText();

		return Reejected;
	}

	public void inquiry() throws InterruptedException {
		inquiry.click();
		Thread.sleep(2000);

	}

	public void netprice() throws InterruptedException {
		netprice.click();
		netprice.sendKeys("1000");
		Thread.sleep(2000);

	}

	public void idocument() throws InterruptedException {
		idocument.click();
		Thread.sleep(2000);

	}

	public void squotation() throws InterruptedException {
		squotation.click();
		Thread.sleep(2000);

	}

	public void asquotation() throws InterruptedException {
		asquotation.click();
		Thread.sleep(2000);

	}

	public void Save() throws InterruptedException {
		Save.click();
		Thread.sleep(2000);

	}

	public void save1() throws InterruptedException {
		save1.click();
		Thread.sleep(2000);

	}

	public void salesOrder() throws InterruptedException {
		salesorder.click();
		Thread.sleep(2000);
		leave.click();
		Thread.sleep(2000);
	}

	public void leave() throws InterruptedException {

		leave.click();
		Thread.sleep(2000);
	}

	public void quotation() throws InterruptedException {
		quotation.click();
		Thread.sleep(2000);
		leave.click();
		Thread.sleep(2000);
	}

	public void Order() throws InterruptedException {
		Order.click();
		Thread.sleep(2000);

	}

	public void addsales() throws InterruptedException {
		addsales.click();
		Thread.sleep(2000);

	}

	public void aaction() throws InterruptedException {
		aaction.click();
		Thread.sleep(2000);

	}

	public void action() throws InterruptedException {
		action.click();
		Thread.sleep(2000);

	}

	public void sorder() throws InterruptedException {
		sorder.click();
		Thread.sleep(2000);

	}

	public void salesquotation() throws InterruptedException {
		salesquotation.click();
		Thread.sleep(2000);

	}

	public void qsavesubmit() throws InterruptedException {
		qsavesubmit.click();
		Thread.sleep(2000);

	}

	public void searchCustomer() throws InterruptedException {
		popup1.click();
		searchcustomer.click();
		Thread.sleep(2000);
		searchcustomer.sendKeys("omkar");
		Thread.sleep(2000);
		searchcustomer.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		selectname.click();

	}

	public void savesubmit() throws InterruptedException {
		Thread.sleep(2000);
		savesubmit.click();
	}

	public void savesubmitq() throws InterruptedException {
		Thread.sleep(2000);
		savesubmitq.click();
	}

	public void selectItem1() throws InterruptedException {
		Thread.sleep(2000);
		element1.click();
		Thread.sleep(2000);
		selectitem1.click();
		Thread.sleep(4000);
		selectitem1.sendKeys("500000893");
		Thread.sleep(4000);
		selectitem1.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		itemselection1.click();
		Thread.sleep(2000);
		add1.click();
		// Thread.sleep(2000);
//		discount1.click();
//		discount1.sendKeys("10");
//		dropdown1.click();
//		Select S1 = new Select(dropdown1);
//		Thread.sleep(2000);
//		S1.selectByVisibleText("%");
		// Thread.sleep(5000);
		// addnewitem.click();
		// savesubmit.click();

	}

	public void selectItem2() throws InterruptedException {
		Thread.sleep(2000);
		element2.click();
		Thread.sleep(2000);
		selectitem1.click();
		Thread.sleep(4000);
		selectitem1.sendKeys("500002258");
		Thread.sleep(4000);
		selectitem1.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		itemselection1.click();
		Thread.sleep(2000);
		add1.click();
		Thread.sleep(2000);
		discount2.click();
		discount2.sendKeys("15");
		dropdown2.click();
		Select S1 = new Select(dropdown2);
		Thread.sleep(2000);
		S1.selectByVisibleText("%");
		Thread.sleep(5000);
		addnewitem.click();
	}

	public void selectItem3() throws InterruptedException {
		Thread.sleep(2000);
		element3.click();
		Thread.sleep(2000);
		selectitem1.click();
		Thread.sleep(4000);
		selectitem1.sendKeys("500002259");
		Thread.sleep(4000);
		selectitem1.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		itemselection1.click();
		Thread.sleep(2000);
		add1.click();
		Thread.sleep(2000);
		Discount3.click();
		Discount3.sendKeys("25");
		Dropdown3.click();
		Select S1 = new Select(Dropdown3);
		Thread.sleep(2000);
		S1.selectByVisibleText("%");
		Thread.sleep(5000);
		addnewitem.click();
	}

	public void selectItem4() throws InterruptedException {
		Thread.sleep(2000);
		element4.click();
		Thread.sleep(2000);
		selectitem1.click();
		Thread.sleep(4000);
		selectitem1.sendKeys("500002260");
		Thread.sleep(4000);
		selectitem1.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		itemselection1.click();
		Thread.sleep(2000);
		add1.click();
		Thread.sleep(2000);
		discount4.click();
		discount4.sendKeys("30");
		dropdown4.click();
		Select S1 = new Select(dropdown4);
		Thread.sleep(2000);
		S1.selectByVisibleText("%");
		Thread.sleep(5000);

		// savesubmit.click();

	}

	public String finalText1() {

		String finalamount = finaltext1.getText();
		return finalamount;

	}

//	public String getTextAfterClicking() throws InterruptedException {
//	    for (int i = 0; i < 3; i++) {
//	        text.click();
//	        Thread.sleep(1000); // wait for the page to load after clicking
//	    }
//	    return text.getText();
//	}

}