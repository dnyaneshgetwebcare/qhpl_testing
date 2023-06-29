package pomitemmaster;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itemmasterpom {
	
	@FindBy(xpath="//span[contains(text(),'Item Master')]")   //.click
	private WebElement im;
	
	
	@FindBy(xpath="//li[@id='goods']")   //.click
     WebElement goods;
	
	@FindBy(xpath="//input[@id='leave']")   //.click
	WebElement leavepage;
	
	@FindBy(xpath="//b[text()='Open Payment']")  //Dash Board verify  //.click
	WebElement dashboard;
	
	
//Item Master Goods Page Element	
	
	@FindBy(xpath="//input[@name='MaterialMasterMainSearch[MATERIAL_NO]']")   //Item no Filter //sendkeys
	WebElement itemfilter;
	
	@FindBy(xpath="//input[@name='MaterialMasterMainSearch[NAME]']")  //Name Filter  sendkeys
	WebElement namefilter;

	@FindBy(xpath=" (//a[contains (text(), 'Action')])[2]")  //Action button  //.click
	WebElement action;
	
//Action Button Element
	
	@FindBy(xpath="//a[@href='index.php?r=material-goods/create']")  // New Goods ADD //.click
	WebElement goodsadd;
		
	@FindBy(xpath="//a[@href='index.php?r=upload-system/material-master-upload-with-stock']") //Master Upload
	WebElement masterupload;
	
//Item Master Create Goods Page	
	@FindBy(xpath="//input[@id='materialmastermain-name']")  //Item Name .Send Keys
	WebElement name;
	
	
	@FindBy(xpath="//span[@id='select2-materialmastermain-base_unit-container']")   //SKU click
	WebElement sku;
	
	@FindBy(xpath="//input[@type='search']")    //Search sku .Sendkeys-->EA Enter
	WebElement skusearch;

	@FindBy(xpath="//input[@id='materialmastermain-non_stockable_item']")   
	WebElement nonstock;
	

	@FindBy(xpath="//input[@id='materialmastermain-batch_management_active']")  //Batch checkbox
	WebElement batchmgnt;
	
	
	@FindBy(xpath="//input[@id='materialmastermain-serial_no_active']") //Serial Checkbox
	WebElement serialmgnt;
	
	
	
	//sales tab
	@FindBy(xpath="//a[@href='#pos-pills']") //.click
	WebElement sales;
	
	
	
	@FindBy(xpath="//input[@id='materialmastermain-sales_price-disp']") //if not filled
	WebElement salesprice;
	
	
	//purchase tab
	@FindBy(xpath=" //a[@href='#supplier-pills']") //click
	WebElement purchase ;
	
	
	
	@FindBy(xpath="//input[@id='materialmastermain-purchase_price-disp']") //if req. or not filled
	WebElement purchaseprice;  
	
	
	///initial stock
	@FindBy(xpath="//li[@id='initial_stock_details']") //click
	WebElement initalstock;
	
	
	
	@FindBy(xpath="//select[@id=\"goodsmovementitemsinitialstockupload-0-plant\"]") //click //warehous dropdown
	WebElement selectwh;
	
	

	@FindBy(xpath="//option[text()='Main Warehouse']") //wh -warehouse  if not find element select this use keboardkey
	WebElement mainwh;
	
	@FindBy(xpath="//input[@id='goodsmovementitemsinitialstockupload-0-quantity']") //quantity click and sendkeys
	WebElement qty;
	
	@FindBy(xpath="//input[@id='goodsmovementitemsinitialstockupload-0-temp_net_price']") //unitcost click and senkkeys
	WebElement unitcost;
	
	
	
	//if batch management tick
	@FindBy(xpath=" //input[@id='goodsmovementitemsinitialstockupload-0-batch_serial_no']") //batch serial textbox click sendkeys
	WebElement batchserial;
	
	
	@FindBy(xpath="(//button[contains(text(), 'Save')])[1]")  //save button
	WebElement save;
	
	
	
	@FindBy(xpath="(//button[contains(text(), 'cancle')])[1]")  //Cancel button
	WebElement cancle;
	

	//All methods 
	public Itemmasterpom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void im() throws InterruptedException {
		im.click();
	  
	}
	
	public void goods() throws InterruptedException {
	    goods.click();
	    Thread.sleep(1000);
	    leavepage.click();
	    System.out.println("Item Master page");
	}
	
	public void dashboard(){
		dashboard.getText();
		System.out.println("Login Successfully");
		
	}
	
	public void itemfilter() {
		itemfilter.click();
		itemfilter.sendKeys("XYZ");  //Changeable
	}
	
	public void namefilter() {
		namefilter.click();
		namefilter.sendKeys("xyz"); //changeable
	}
	
	public void action() {
		action.click();
		
	}
	
	public void goodsadd() {
		goodsadd.click();
	}
	
	public void name() {
		name.click();
		name.sendKeys("Soop");  //changeble
		name.getText();
		
		sku.click();
		skusearch.sendKeys("EA");  
		skusearch.sendKeys(Keys.ENTER);
		
		
	}
	
	public void nonstock() {
		nonstock.click();
	}
	
	public void batch() {
		batchmgnt.click();
	}
	
	public void serial() {
		serialmgnt.click();
	}
	
	public void salestab() {
		sales.click();
	}
	
	public void salesprice() {
		salesprice.sendKeys("100");
	}
	
	public void purchaseprice() {
		purchaseprice.click();
	}
	
	public void puchasetab() {
		purchase.click();
	}
	
	public void initalstock() {
		initalstock.click();
	}
	
	public void selectwh() {
		selectwh.click();
		mainwh.click();
	}
	
	public void qty() {
		qty.click();
		qty.sendKeys("50");  //Changeable
	}
	
	public void unitcost() {
		unitcost.click();
		unitcost.sendKeys("50"); //Changeable
	}
	
	public void batchno() {
		batchserial.click();
		batchserial.sendKeys("1");  //Changeable
	}
	
	public void save() {
		save.click();
	}
	
	public void cancle() {
		cancle.click();
	}
	
	//Action Methods
	/*	public void itemMaster() {
		im.click();
		
	}
	
	public void goods() {
		goods.click();
}*/
	
	
	

}
