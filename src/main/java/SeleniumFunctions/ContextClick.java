package SeleniumFunctions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//li/a[text()='Frames']")).click();
		//driver.findElement(By.xpath("//li/a[text()='iFrame']")).click();
		driver.findElement(By.xpath("//li/a[text()='Context Menu']")).click();
		
		//div[@class='example']/div
//		int x1= driver.findElement(By.xpath("//div[@class='example']/././h3")).getLocation().x;
//		int y1= driver.findElement(By.xpath("//div[@class='example']/././h3")).getLocation().y;
//		
//		
//		int x= driver.findElement(By.xpath("//div[@class='example']/div")).getLocation().x;
//		int y= driver.findElement(By.xpath("//div[@class='example']/div")).getLocation().y;
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='example']/div"))).moveByOffset(0,20).contextClick().build().perform();
		
		String text=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(text);
		
//		System.out.println(x1 +","+y1);
//		System.out.println(x +","+y);
		
//		235,37
//		235,179

	}

}
