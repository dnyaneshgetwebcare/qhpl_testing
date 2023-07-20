
package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	@FindBy(xpath = "//input[@name='LoginForm[username]']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='LoginForm[password]']")
	private WebElement password;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement btn;

	@FindBy(xpath = "(//span[contains(text(),'Sales')])[3]")
	private WebElement sales;

	
	@FindBy(xpath = "//span[contains(text(),'Item Master')]")
	private WebElement itemmaster;
	
	@FindBy(xpath = "(//span[contains(text(),'Purchase')])[3]")
    private WebElement purchaseOrder; // Added WebElement declaration for purchaseOrder

	public Pom1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void name(String un) {
		username.sendKeys(un);
	}

	public void psw(String pass) {
		password.sendKeys(pass);
	}

	public void b1() {
		btn.click();
	}

	public void sales() throws InterruptedException {
		sales.click();
		Thread.sleep(4000);
	}

	public void itemmaster() throws InterruptedException {
		itemmaster.click();
		Thread.sleep(4000);
	}
	 public void purchase() throws InterruptedException {
	        purchaseOrder.click(); // Updated to interact with purchaseOrder WebElement
	        Thread.sleep(4000);
	    }
	
}