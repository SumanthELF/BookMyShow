package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerSupport extends BasePage {


	public CustomerSupport(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//span[text()=' New support ticket ']") 
	private WebElement ClickOnNewTicket;
	
	@FindBy(xpath="//input[@placeholder='Enter your search term here...']") 
	private WebElement ClickOnText;
	
	@FindBy(xpath="//span[@class='hide-in-mobile']") 
	private WebElement ClickOnSearch;

	public WebElement getClickOnNewTicket() {
		return ClickOnNewTicket;
	}

	public WebElement getClickOnText() {
		return ClickOnText;
	}

	public WebElement getClickOnSearch() {
		return ClickOnSearch;
	}
	
	
}
