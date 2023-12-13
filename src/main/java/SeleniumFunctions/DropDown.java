package SeleniumFunctions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		Select sel = new Select(driver.findElement(By.xpath("//select")));
//		sel.selectByValue("IND");
		
		//Gender
		 ChromeOptions o= new ChromeOptions();
	      // add Incognito parameter
	      o.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(o);
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Select sel = new Select(driver.findElement(By.xpath("//div/code[text()='select']/../following-sibling::div[@class='ui selection dropdown']")));
		//sel.selectByValue("0");
		driver.findElement(By.xpath("//div/code[text()='select']/../following-sibling::div[@class='ui selection dropdown']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[contains(@class,'menu transition')]/div[@class='item' and text()='Male']")).click();
	}

}
