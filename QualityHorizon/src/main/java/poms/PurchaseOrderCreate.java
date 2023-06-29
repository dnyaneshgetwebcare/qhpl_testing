package poms;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrderCreate {
    public WebDriver driver;

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
    private WebElement searchCustomer;

    @FindBy(xpath = "//li[text()='Dayanand45']")
    private WebElement Dayanand45;
    
    @FindBy(xpath ="(//i[@class='glyphicon glyphicon-menu-down'])[3]")
    private WebElement selectItem;

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

    // Click on the "Purchase Order" element
    public void clickPurchaseOrder() {
        porder.click();
    }

    // Click on the "Select Vendor" element
    public void selectVendor() {
        selectVendor.click();
    }

    // Enter search customer criteria and select name
    public void searchCustomer() throws InterruptedException {
        searchCustomer.sendKeys("Dayanand45");   
        searchCustomer.sendKeys(Keys.ENTER);
    }

	public void nameSelected() {
		Dayanand45.click();
	}

	public void selectItem1() {
		selectItem.click();		
	}	
}
