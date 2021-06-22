package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Rewards extends BasePage {


	public Rewards(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//button[text()='My Reward']") 
	private WebElement ClickOnMyReward;
	
	@FindBy(xpath="//span[text()='Online Tickets']")
	private WebElement ClickOnlineTickets;
	
	@FindBy(xpath="//span[@class='sc-fZwumE bOtlNt']")
	private WebElement ClickOnProfile;

	public WebElement getClickOnMyReward() {
		return ClickOnMyReward;
	}

	public WebElement getClickOnlineTickets() {
		return ClickOnlineTickets;
	}

	public WebElement getClickOnProfile() {
		return ClickOnProfile;
	}
	
	
}
