package SeleniumFunctions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TypeFromKeyboard {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
//		ChromeOptions options = new ChromeOptions();
//		options.setCapability("singin.allowed", false);
//		options.setCapability("singin.allowed_on_next_startup", false);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://semantic-ui.com/modules/dropdown.html");
//		driver.manage().window().maximize();
//		driver.navigate().to("How many ways you can refresh a webpage");
//		driver.navigate().refresh();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//div/button[@aria-label='No thanks']")).click();
//		
//		WebElement m=driver.findElement(By.xpath("//div/button[@aria-label='No thanks']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", m);
		
		driver.findElement(By.xpath("//textarea[@name='q']")).click();
		Actions action = new Actions(driver);
		//action.keyDown(Keys.SHIFT);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.SHIFT+"preetam");
		//action.keyUp(Keys.SHIFT);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@name='q']")).click();
		//Robot robot = new Robot();
		 //action.keyDown(Keys.CONTROL).sendKeys("A").build().perform();
		//action.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		//robot.keyPress(KeyEvent.VK_CONTROL+KeyEvent.VK_A);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.COMMAND+"A");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.DELETE);
		

	}

}
