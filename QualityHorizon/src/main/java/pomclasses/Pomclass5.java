package pomclasses;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pomclass5
{
	public WebDriver driver;

	
	@FindBy(xpath = "(//div[@class=\"modal-header\"])[1]//button")
	private WebElement cancelPaymentpopup;

	@FindBy(xpath = "//a[@onclick='checkBillingStatus()']")
	private WebElement cancelbilling;
	
	
	public Pomclass5(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void cancelPaymentpopup() throws InterruptedException {
		cancelPaymentpopup.click();
		Thread.sleep(2000);

	}
	
	public void cancelbilling() throws InterruptedException {
		cancelbilling.click();
		Thread.sleep(2000);

	}
	
	
	
	
}
