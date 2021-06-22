package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookMySmile extends BasePage{

	public BookMySmile(WebDriver driver) {
		super(driver);
	}

	@FindBy(name="don-amount") 
	private WebElement ClickOnAnyAmount;
	
	@FindBy(xpath="//span[text()='Re. 1']") 
	private WebElement ClickOnOne;
	
	@FindBy(id="btnAddCash") 
	private WebElement ClickOnDonate;
	
	@FindBy(xpath="//img[@alt='Youtube']") 
	private WebElement ClickOnYoutube;
	
	@FindBy(name="//li[text()='2018 ']") 
	private WebElement ClickOnYear;

	public WebElement getClickOnAnyAmount() {
		return ClickOnAnyAmount;
	}

	public WebElement getClickOnOne() {
		return ClickOnOne;
	}

	public WebElement getClickOnDonate() {
		return ClickOnDonate;
	}

	public WebElement getClickOnYoutube() {
		return ClickOnYoutube;
	}

	public WebElement getClickOnYear() {
		return ClickOnYear;
	}
	
	
	
}
