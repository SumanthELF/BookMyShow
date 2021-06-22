package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuikPay extends BasePage {

	public QuikPay(WebDriver driver) {
		super(driver);
	}

	//@FindBy(xpath="//a[@onclick='quikpay.fnShowModal(\"add-card-modal\");']") 
	//private WebElement AddDebitCard;
	
	@FindBy(xpath="//a[@onclick=\"upi.openModal('UPI');\"]") 
	private WebElement AddNewUpi;
	
	@FindBy(id="txtUpiId") 
	private WebElement EnterUpiId;
	
	@FindBy(id="txtUpiVpa") 
	private WebElement EnterVpaAddress;
	
	@FindBy(id="btnUpiSave") 
	private WebElement ClickOnSave;
	
	@FindBy(xpath="//a[@onclick=\"tpwallets.openModal('RPO');\"]")
	private WebElement AddPayBack;
	
	@FindBy(id="paybackNumber") 
	private WebElement EnterMobileNumber;
	
	@FindBy(xpath="txtCheckPaybackPin") 
	private WebElement EnterPin;
	
	@FindBy(xpath="(//button[text()='Register'])[2]") //insufficient balance error displaying
	private WebElement ClickOnRegister;
	
	@FindBy(xpath="//span[text()='Online Tickets']")
	private WebElement ClickOnlineTickets;
	
	@FindBy(xpath="//span[@class='sc-fZwumE bOtlNt']")
	private WebElement ClickOnProfile;

	public WebElement getAddNewUpi() {
		return AddNewUpi;
	}

	public WebElement getEnterUpiId() {
		return EnterUpiId;
	}

	public WebElement getEnterVpaAddress() {
		return EnterVpaAddress;
	}

	public WebElement getClickOnSave() {
		return ClickOnSave;
	}

	public WebElement getAddPayBack() {
		return AddPayBack;
	}

	public WebElement getEnterMobileNumber() {
		return EnterMobileNumber;
	}

	public WebElement getEnterPin() {
		return EnterPin;
	}

	public WebElement getClickOnRegister() {
		return ClickOnRegister;
	}

	public WebElement getClickOnlineTickets() {
		return ClickOnlineTickets;
	}

	
	
}
