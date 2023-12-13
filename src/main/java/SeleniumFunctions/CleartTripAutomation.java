package SeleniumFunctions;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CleartTripAutomation {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		//options.addArguments("−−incognito");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a/div[contains(text(),'Flights')]")).click();
		driver.findElement(By.xpath("//div/div[contains(text(),'Regular fare')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("ccu");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div/div[contains(text(),'CCU')]"))));
		//driver.findElement(By.xpath("//div/div[contains(text(),'CCU')]")).click();
		Thread.sleep(2000);
		click("//div/div[contains(text(),'CCU')]");
		
		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("del");
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div/div[contains(text(),'DEL')]"))));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/div[contains(text(),'DEL')]")).click();
		click("//div/button/div/preceding-sibling::*");//date
		click("//div[contains(text(),'"+monthDay(20).get(0)+" ')]/../following-sibling::div[contains(@class,'DayPicker-Body')]//div[text()='"+monthDay(20).get(1)+"']");
		
		click("//div/span[contains(text(),'Search flights')]");
		//div[contains(text(),'September ')]/../following-sibling::div[contains(@class,'DayPicker-Body')]//div[text()='1']
		String firstPrice=driver.findElement(By.xpath("(//button[text()='Book']/../../../div[3]//div/p)[1]")).getText();
		System.out.println(firstPrice);
	

	}

	public static void click(String Xpath)
	{
		driver.findElement(By.xpath(Xpath)).click();
	}

	public static List<String> monthDay(int dayDifference) {
		List<String> dayMonth = new ArrayList<String>();
		LocalDate currentdate = LocalDate.now().plusDays(dayDifference);
		Month currentMonth = currentdate.getMonth();
		int currentYear = currentdate.getYear();

		int day = currentdate.getDayOfMonth();
		//System.out.println(currentMonth);
		//System.out.println(day);
		String month=String.valueOf(currentMonth);
		dayMonth.add(month.charAt(0)+month.substring(1, month.length()).toLowerCase());
		dayMonth.add(String.valueOf(day));
		return dayMonth;

	}

}
