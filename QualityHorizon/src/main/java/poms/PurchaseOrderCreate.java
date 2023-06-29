package poms;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrderCreate {
	public WebDriver driver;

//  //Purchase Order
	@FindBy(xpath = "//span[contains(text(),'Purchase Order')]")
	private WebElement purchaseOrder;

	@FindBy(xpath = "//input[@id='leave']")
	private WebElement leave;

	@FindBy(xpath = "//a[contains(text(),' Action            ')]")
	private WebElement action;

	@FindBy(xpath = "//a[text()=' Purchase Order              ']")
	private WebElement porder;

	@FindBy(xpath = "//b[@id='cust_details']")
	private WebElement selectVendor;

	@FindBy(xpath = "//input[@id='auto_search_vendor_vw']")
	private WebElement searchVendor;

	@FindBy(xpath = "//li[text()='Dayanand45']")
	private WebElement selectname;

//    @FindBy(xpath ="(//i[@class='glyphicon glyphicon-menu-down'])[3]")
//    private WebElement selectItem;

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

	// Constructor
	public PurchaseOrderCreate(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Click on the "Purchase" element
	public void clickPurchase() {
		purchaseOrder.click();
	}

	// Enter leave information
	public void Leave() {
		leave.click();
	}

	// Click on the "Action" element
	public void clickAction() {
		action.click();
	}

	public void searchVendor() throws InterruptedException {
		porder.click();
		selectVendor.click();
		Thread.sleep(2000);
		searchVendor.sendKeys("Dayanand45");
		Thread.sleep(2000);
		searchVendor.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		selectname.click();

	}

	public void selectItem1() throws InterruptedException {
		Thread.sleep(2000);
		element1.click();
		Thread.sleep(2000);
		selectitem1.click();
		Thread.sleep(4000);
		selectitem1.sendKeys("500002426");
		Thread.sleep(4000);
		selectitem1.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		itemselection1.click();
		Thread.sleep(2000);
		add1.click();
		savesubmit.click();
	}

//	public void selectItem2() throws InterruptedException {
//		Thread.sleep(2000);
//		element2.click();
//		Thread.sleep(2000);
//		selectitem1.click();
//		Thread.sleep(4000);
//		selectitem1.sendKeys("500002258");
//		Thread.sleep(4000);
//		selectitem1.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		itemselection1.click();
//		Thread.sleep(2000);
//		add1.click();
//		Thread.sleep(2000);
//		discount2.click();
//		discount2.sendKeys("15");
//		dropdown2.click();
//		Select S1 = new Select(dropdown2);
//		Thread.sleep(2000);
//		S1.selectByVisibleText("%");
//		Thread.sleep(5000);
//		addnewitem.click();
//	}
//
//	public void selectItem3() throws InterruptedException {
//		Thread.sleep(2000);
//		element3.click();
//		Thread.sleep(2000);
//		selectitem1.click();
//		Thread.sleep(4000);
//		selectitem1.sendKeys("500002259");
//		Thread.sleep(4000);
//		selectitem1.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		itemselection1.click();
//		Thread.sleep(2000);
//		add1.click();
//		Thread.sleep(2000);
//		Discount3.click();
//		Discount3.sendKeys("25");
//		Dropdown3.click();
//		Select S1 = new Select(Dropdown3);
//		Thread.sleep(2000);
//		S1.selectByVisibleText("%");
//		Thread.sleep(5000);
//		addnewitem.click();
//	}
//
//	public void selectItem4() throws InterruptedException {
//		Thread.sleep(2000);
//		element4.click();
//		Thread.sleep(2000);
//		selectitem1.click();
//		Thread.sleep(4000);
//		selectitem1.sendKeys("500002260");
//		Thread.sleep(4000);
//		selectitem1.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		itemselection1.click();
//		Thread.sleep(2000);
//		add1.click();
//		Thread.sleep(2000);
//		discount4.click();
//		discount4.sendKeys("30");
//		dropdown4.click();
//		Select S1 = new Select(dropdown4);
//		Thread.sleep(2000);
//		S1.selectByVisibleText("%");
//		Thread.sleep(5000);

//		 savesubmit.click();

//	}

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
