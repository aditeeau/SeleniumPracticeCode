package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("course"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("(//a[contains(text(),'Selenium')])[1]")).click();
		
		WebElement ele2 = driver.findElement(By.id("add"));
		a.doubleClick(ele2).perform();
		Thread.sleep(2000);
		driver.close();
		
	}

}
