package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		WebElement block1 = driver.findElement(By.id("block-1"));
		WebElement block3 = driver.findElement(By.id("block-3"));
		Thread.sleep(4000);
		Actions a = new Actions(driver);
		a.dragAndDrop(block1, block3).perform();
		Thread.sleep(9000);
		driver.close();
	}

}
