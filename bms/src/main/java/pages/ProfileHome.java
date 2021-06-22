package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileHome extends BasePage {

	public ProfileHome(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="wzrk-cancel")
	private WebElement ClickOnNotNow;
	
	@FindBy(xpath="//span[text()='Bengaluru']")
	private WebElement ClickOnCity;
	
	@FindBy(xpath="//div[text()='Sign in']") 
	private WebElement SignInButtonText;
	
	@FindBy(xpath="//div[text()='Continue with Facebook']/..")
	private WebElement ContinueWithFacebook;
	
	@FindBy(xpath="//span[@class='sc-fZwumE bOtlNt']")
	private WebElement ClickOnProfile;
	
	@FindBy(xpath="//div[text()='Edit Profile']")
	private WebElement ClickOnEditProfile;
	
	@FindBy(xpath="//div[text()='Notifications']")
	private WebElement ClickOnNotifications;
	
	@FindBy(xpath="//span[text()='Back']")
	private WebElement ClickOnBack;
	
	@FindBy(xpath="//div[text()='Booking History']")
	private WebElement ClickOnBookingHistory;
	
	@FindBy(id="allBookings")
	private WebElement ClickOnViewAllBookings;
	
	@FindBy(xpath="//span[text()='Online Tickets']")
	private WebElement ClickOnlineTickets;
	
	@FindBy(xpath="//div[text()='Stream Library']")
	private WebElement ClickOnStreamLibrary;
	
	@FindBy(xpath="//div[text()='Rewards']")
	private WebElement ClickOnRewards;
	
	@FindBy(xpath="//div[text()='BookASmile']")
	private WebElement ClickOnBookMySmile;
	
	@FindBy(xpath="//div[text()='Help & Support']")
	private WebElement ClickOnHelpAndSupport;
	
	@FindBy(xpath="//div[text()='Settings']")
	private WebElement ClickOnSettings;
	
	@FindBy(xpath="//button[text()='Sign out']")
	private WebElement ClickOnSignOut;
	
	@FindBy(xpath="//div[text()='QuikPay']")
	private WebElement ClickOnQuikPay;

	public WebElement getClickOnQuikPay() {
		return ClickOnQuikPay;
	}

	public WebElement getClickOnNotNow() {
		return ClickOnNotNow;
	}

	public WebElement getClickOnCity() {
		return ClickOnCity;
	}

	
	public WebElement getContinueWithFacebook() {
		return ContinueWithFacebook;
	}

	public WebElement getSignInButtonText() {
		return SignInButtonText;
	}

	public WebElement getClickOnProfile() {
		return ClickOnProfile;
	}

	public WebElement getClickOnEditProfile() {
		return ClickOnEditProfile;
	}

	public WebElement getClickOnNotifications() {
		return ClickOnNotifications;
	}

	public WebElement getClickOnBack() {
		return ClickOnBack;
	}

	public WebElement getClickOnBookingHistory() {
		return ClickOnBookingHistory;
	}

	public WebElement getClickOnViewAllBookings() {
		return ClickOnViewAllBookings;
	}

	public WebElement getClickOnlineTickets() {
		return ClickOnlineTickets;
	}

	public WebElement getClickOnStreamLibrary() {
		return ClickOnStreamLibrary;
	}

	public WebElement getClickOnRewards() {
		return ClickOnRewards;
	}

	public WebElement getClickOnBookMySmile() {
		return ClickOnBookMySmile;
	}

	public WebElement getClickOnHelpAndSupport() {
		return ClickOnHelpAndSupport;
	}

	public WebElement getClickOnSettings() {
		return ClickOnSettings;
	}

	public WebElement getClickOnSignOut() {
		return ClickOnSignOut;
	}
	
	
}
