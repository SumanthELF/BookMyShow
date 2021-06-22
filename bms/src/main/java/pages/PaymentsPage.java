package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentsPage extends BasePage{

	public PaymentsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="//button[@onclick='pay.fnPayLastQuikPay();']") 
	private WebElement DonateQuikPay;
	
	@FindBy(id="dOffersHeadTitle") 
	private WebElement ClickOnApplyPromoCodes;
	
	@FindBy(id="offCode_disc-codes") 
	private WebElement EnterOfferCode;
	
	@FindBy(xpath="//button[@onclick=\"pay.fnApplyOffer('disc-codes'); ga('send', 'pageview', 'apply-offer');\"]")
	private WebElement ClickOnCheck;

	public WebElement getDonateQuikPay() {
		return DonateQuikPay;
	}

	public WebElement getClickOnApplyPromoCodes() {
		return ClickOnApplyPromoCodes;
	}

	public WebElement getEnterOfferCode() {
		return EnterOfferCode;
	}

	public WebElement getClickOnCheck() {
		return ClickOnCheck;
	}
	
	
}
