package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.xpath("(//a[@class='desktop-main'])[5]"));
		
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		//driver.findElement(By.linkText("Serum")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Serum']")).click();
		driver.close();
	}

}
