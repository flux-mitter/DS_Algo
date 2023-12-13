package SeleniumFunctions;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Durations;

public class SeleniumTest {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://semantic-ui.com/modules/dropdown.html");
//		driver.manage().window().maximize();
//		driver.navigate().to("How many ways you can refresh a webpage");
//		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//li/a[text()='Frames']")).click();
		//driver.findElement(By.xpath("//li/a[text()='iFrame']")).click();
		driver.findElement(By.xpath("//li/a[text()='Multiple Windows']")).click();
		//List<WebElement> f = driver.findElements(By.tagName("frame"));
		//List<WebElement> frame=driver.findElements(By.xpath("//frame"));
		
//		frame.forEach(fr ->
//				{
//					//int count =1;
//					driver.switchTo().frame(count);
//					String name=driver.findElement(By.xpath("//body")).getText();
//					System.out.println(name);
//					//count ++;
//				}
//				);
//		for(int i=1;i<=frame.size();i++)
//		{
//			driver.switchTo().frame(i);
//			String name=driver.findElement(By.xpath("//body")).getText();
//			System.out.println(name);
//		}
//		driver.switchTo().frame(f.get(0));
//		String name=driver.findElement(By.xpath("//body")).getText();
//		System.out.println(name);
//		driver.switchTo().frame(1);
//		int x=driver.findElements(By.xpath("//body")).size();
//		System.out.println(x);
		
	      //By finding list of the web elements using frame or iframe tag
//	      List<WebElement> f = driver.findElements(By.tagName("frame"));
//	      System.out.println("Total number " + f.size());
//	      driver.quit();
//		WebElement el=driver.findElement(By.xpath("//iframe"));
//		driver.switchTo().frame(el);
//		String s=driver.findElement(By.xpath("//body[@id='tinymce']/p")).getText();
//		driver.findElement(By.xpath("//body[@id='tinymce']/p")).click();
//		driver.findElement(By.xpath("//body[@id='tinymce']/p")).sendKeys("Hello Darling");
//		System.out.println(s);
		String originalWindow = driver.getWindowHandle();
		assert driver.getWindowHandles().size() == 1;
		//wait.until(numberOfWindowsToBe(2));
		driver.findElement(By.xpath("//div/a[text()='Click Here']")).click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		//allWindowHandles.stream().filter(handle-> driver.switchTo().window(handle))
//		allWindowHandles.forEach( hanlde ->{
//			driver.switchTo().window(hanlde);
//			
//		});
		//allWindowHandles.stream().filter(handle ->driver.switchTo().window(handle))
		Iterator<String> itr = allWindowHandles.iterator();
		
		while(itr.hasNext())
		{
			String window= itr.next();
			
			if(!originalWindow.equals(window))
			{
				driver.switchTo().window(window);
				String s=driver.findElement(By.xpath("//h3")).getText();
				System.out.println(s);
				break;
			}
		}
		
		
	}

}
