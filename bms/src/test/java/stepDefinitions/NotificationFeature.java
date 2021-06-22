package stepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.FacebookLogin;
import pages.ProfileHome;

public class NotificationFeature {

	public WebDriver driver;
	public ProfileHome profilehome;
	public WebDriverWait wait;
	public String parentWindowId;
	@Given("open the browser")
	public void open_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@And("enter the url")
	public void enter_the_url() {
		driver.get("https://in.bookmyshow.com/");
		profilehome=new ProfileHome(driver);
		profilehome.getClickOnNotNow().click();
		profilehome.getClickOnCity().click();
	}

	@Then("home page will be dispalyed")
	public void home_page_will_be_dispalyed() {
		String expectedHomePageTitle="Movie Tickets, Plays, Sports, Events & Cinemas near Bengaluru - BookMyShow";
		if(driver.getTitle().equals(expectedHomePageTitle)) {
			System.out.println("title is displayed succesfully");
		}else {
			System.out.println("title is not displayed");
		}
	}

	@When("click on signin")
	public void click_on_signin() {
//		parentWindowId = driver.getWindowHandle();
		profilehome.getSignInButtonText().click();
	}

	@And("click on continue with facebook")
	public void click_on_continue_with_facebook() {		
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(profilehome.getContinueWithFacebook()));
//		driver.findElement(By.xpath("//div[text()='Continue with Facebook']/..")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('mobileNo').value='8248850360;"); 
		
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			
		}
//		profilehome.getContinueWithFacebook().click();
	}

	@When("enetr credentials and click on login")
	public void enetr_credentials_and_click_on_login() {
		/*
		 * Set<String> allWindowIds = driver.getWindowHandles();
		 * allWindowIds.remove(parentWindowId); for(String wid : allWindowIds) {
		 * driver.switchTo().window(wid); }
		 */
//		FacebookLogin facebooklogin=new FacebookLogin(driver);
//		facebooklogin.getEmailTextBox().sendKeys("ciripireddy1999@gmail.com");
//		facebooklogin.getPassTextBox().sendKeys("Admin123");
//		facebooklogin.getLoginButton().click();
	}

	@When("click on profile module")
	public void click_on_profile_module() {
//		profilehome.getClickOnProfile().click();
	}

	@And("click on notifications")
	public void click_on_notifications() {
//		profilehome.getClickOnNotifications().click();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		profilehome.getClickOnBack().click();
	}
}
