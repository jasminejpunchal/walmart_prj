
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC03 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/jasminejacob/Documents/workspace/wallmart/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.walmart.ca/en");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath(".//span[contains(text(),'TVs')]")).click();
		driver.findElement(By.xpath(".//div[@aria-label='Samsung  NU6900 Class 4K Ultra HD Smart LED TV.']")).click();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		((JavascriptExecutor)driver).executeScript("scrollTo(0,500)");
	}

}
