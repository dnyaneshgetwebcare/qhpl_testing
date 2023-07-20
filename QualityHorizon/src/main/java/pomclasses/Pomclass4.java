
package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass4 
{
	public WebDriver driver;
	
	@FindBy(xpath = "//li[@id='invoice']")
	private WebElement invoice;
	@FindBy(xpath = "(//li[text()='Customer Invoice'])[2]")
	private WebElement  wocinvoice;
	@FindBy(xpath = "//a[text()=' Accept                      ']")
	private WebElement  Accept;
	@FindBy(xpath = "//a[text()='Save as Draft                          ']")
	private WebElement  sadraft;
	@FindBy(xpath = "//a[text()='Save and Post                        ']")
	private WebElement  sapost;
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement  ok;
	
	
	@FindBy(xpath = "//a[text()=' Payment Received']")
	private WebElement paymentreceived;
	@FindBy(xpath = "//button[text()=' Save']")
	private WebElement save;
	@FindBy(xpath = "//li[text()='100% Advance']")
	private WebElement Advance;
	
	
	public Pomclass4(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void invoice() throws InterruptedException {
		invoice.click();
		Thread.sleep(2000);
		}
	
	public void wocinvoice() throws InterruptedException {
		wocinvoice.click();
		Thread.sleep(2000);
		}

	public void sadraft() throws InterruptedException {
		sadraft.click();
		Thread.sleep(2000);
		}

	public void sapost() throws InterruptedException {
		sapost.click();
		Thread.sleep(2000);
		}
	
	public void ok() throws InterruptedException {
		ok.click();
		Thread.sleep(2000);
		}
	
	
	public void paymentreceived() throws InterruptedException {
		paymentreceived.click();
		Thread.sleep(2000);
		}
	public void save() throws InterruptedException {
		save.click();
		Thread.sleep(2000);
		}
	
	
	
}
