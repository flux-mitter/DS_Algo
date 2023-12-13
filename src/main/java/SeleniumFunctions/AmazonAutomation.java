package SeleniumFunctions;

import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AmazonAutomation {
	public static WebDriver driver;;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		
		options.addArguments("−−incognito");
		//options.merge(cap);
		driver = new ChromeDriver(options);

//			WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), cap);
//			driver.get("https://www.amazon.in/");
//			System.out.println("Titile = " + driver.getTitle());
//		driver = new RemoteWebDriver(new URL("http://localhost:4444"), cap);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setBrowserName("firefox");
			//WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), cap);
			driver.get("https://www.amazon.in/");
			System.out.println("Titile = " + driver.getTitle());

			driver.findElement(By.xpath("//div/input[@type='text' and @id='twotabsearchtextbox']"))
					.sendKeys("Iphone 14");
			driver.findElement(By.xpath("//span/input[@type='submit']")).click();
			List<WebElement> elements = driver.findElements(By.xpath("//h2/a/span"));
			System.out.println(elements.get(0).getText());
			String originalWindow = driver.getWindowHandle();
			elements.get(0).click();
			Set<String> allWindowHandles = driver.getWindowHandles();
			Iterator<String> itr = allWindowHandles.iterator();
			// allWindowHandles.forEach(window -> window.equals(originalWindow));
			// allWindowHandles.stream().filter(window ->)
			while (itr.hasNext()) {
				String window = itr.next();

				if (!originalWindow.equals(window)) {
					driver.switchTo().window(window);
					break;
				}
			}
			System.out.println(driver.findElement(By.xpath("//h1/span")).getText());
			// driver.findElement(By.xpath("//span/span[@id='submit.add-to-cart']")).click();
			javaExecutorClick("//span/input[@id='add-to-cart-button']");

			driver.findElement(By.xpath("//div/h4[contains(text(),'Added to Cart')]")).isDisplayed();
			Thread.sleep(3000);
			javaExecutorClick("//span/span[contains(text(),'Proceed to checkout')]");
			// driver.findElement(By.xpath("//span/span[contains(text(),'Proceed to
			// checkout')]")).click();
			System.out.println(driver.getTitle());
			System.out.println(driver.findElement(By.xpath("//div/h1")).getText());
			driver.quit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			// driver.quit();
		}

	}

	public static void javaExecutorClick(String xpath) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath(xpath)));
	}

}
