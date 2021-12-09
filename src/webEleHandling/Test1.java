package webEleHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		ele.sendKeys("dress");
		Thread.sleep(3000);
		List<WebElement> ele2 = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
		int size = ele2.size();
		System.out.println(size);
		for(WebElement ob:ele2) {
			System.out.println(ob.getText());
		}
		driver.close();
	}

}
