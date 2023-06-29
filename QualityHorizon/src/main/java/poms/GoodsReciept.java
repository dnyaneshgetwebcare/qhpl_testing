package poms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoodsReciept {

    public WebDriver driver;

    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[4]")
    private WebElement aaction;

    @FindBy(xpath = "//li[@onclick='createGoodsReceipt()']")
    private WebElement goodsdelivery;

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement chkbox;

    @FindBy(xpath = "//b[contains(text(),'Post Goods Receipt To Stock')]")
    private WebElement postgoodsdelivery;

    @FindBy(xpath = "//button[@onclick='submitFormPDF()']")
    private WebElement save;

    @FindBy(xpath = "(//img[@src='img/icons/back-arrow.png'])[2]")
    private WebElement backbutton;

    public GoodsReciept(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
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

        Actions actions = new Actions(driver);
        actions.click(backbutton).perform();
        Thread.sleep(2000);
        actions.click(backbutton).perform();
    }
}
