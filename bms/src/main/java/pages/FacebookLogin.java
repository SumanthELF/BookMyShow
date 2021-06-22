package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLogin extends BasePage{  
	
	public FacebookLogin(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="email") 
	private WebElement EmailTextBox;
	
	@FindBy(id="pass")
	private WebElement PassTextBox;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement LoginButton;

	public WebElement getEmailTextBox() {
		return EmailTextBox;
	}

	public WebElement getPassTextBox() {
		return PassTextBox;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
    
}
