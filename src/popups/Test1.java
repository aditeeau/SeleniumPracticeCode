package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		Alert a = driver.switchTo().alert();
		a.dismiss();
		Thread.sleep(2000);
		driver.close();
		
	}

}
