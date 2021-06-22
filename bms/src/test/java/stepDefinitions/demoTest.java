package stepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoTest {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://in.bookmyshow.com/");
		driver.findElement(By.id("wzrk-cancel")).click();
		driver.findElement(By.xpath("//span[text()='Bengaluru']")).click();
		driver.findElement(By.xpath("//div[text()='Sign in']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement cfb = driver.findElement(By.xpath("//div[text()='Continue with Facebook']"));
//		driver.findElement(By.id("mobileNo")).sendKeys("asdfafa");
//		js.executeScript("arguments[0].click()", cfb);
		js.executeScript("document.getElementById('mobileNo').value='8765432987'");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
