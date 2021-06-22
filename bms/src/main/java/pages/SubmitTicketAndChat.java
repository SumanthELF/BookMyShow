package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubmitTicketAndChat extends BasePage {
	
	public SubmitTicketAndChat(WebDriver driver) {
		super(driver);
	}

	@FindBy(name="helpdesk_ticket[email]") 
	private WebElement EnterEmail;
	
	@FindBy(id="helpdesk_ticket_custom_field_contact_number_79003") 
	private WebElement EnterMobileNumber;
	
	@FindBy(name="helpdesk_ticket[subject]") 
	private WebElement EnterSubject;
	
	@FindBy(id="helpdesk_ticket_custom_field_query_79003") 
	private WebElement ClickOnQuery;
	
	@FindBy(xpath="//div[@class='recaptcha-checkbox-checkmark']")
	private WebElement ClickOnNotRobot;
	
	@FindBy(id="helpdesk_ticket_submit")
	private WebElement ClickOnSubmit;
	
	@FindBy(xpath="//i[@class='icon-ic_chat_icon']")
	private WebElement ClickOnChatIcon;
	
	@FindBy(xpath="//input[@id='chat-fc-name']")
	private WebElement EnterOnNameOption;
	
	@FindBy(xpath="//input[@id='chat-fc-email']")
	private WebElement EnteronEmailOption;
	
	@FindBy(xpath="//input[@id='chat-fc-phone']")
	private WebElement EnterPhoneNumber;
	
	@FindBy(xpath="//a[text()='Start Chat']")
	private WebElement ClickOnStartChat;
	
	@FindBy(xpath="//img[@alt='Logo']")
	private WebElement ClickOnHome;

	public WebElement getEnterEmail() {
		return EnterEmail;
	}

	public WebElement getEnterMobileNumber() {
		return EnterMobileNumber;
	}

	public WebElement getEnterSubject() {
		return EnterSubject;
	}

	public WebElement getClickOnQuery() {
		return ClickOnQuery;
	}

	public WebElement getClickOnNotRobot() {
		return ClickOnNotRobot;
	}

	public WebElement getClickOnSubmit() {
		return ClickOnSubmit;
	}

	public WebElement getClickOnChatIcon() {
		return ClickOnChatIcon;
	}

	public WebElement getEnterOnNameOption() {
		return EnterOnNameOption;
	}

	public WebElement getEnteronEmailOption() {
		return EnteronEmailOption;
	}

	public WebElement getEnterPhoneNumber() {
		return EnterPhoneNumber;
	}

	public WebElement getClickOnStartChat() {
		return ClickOnStartChat;
	}

	public WebElement getClickOnHome() {
		return ClickOnHome;
	}
	
	
	
}
