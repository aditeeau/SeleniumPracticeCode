package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("core java for selenium");
		driver.findElement(By.xpath("(//input[@value='go'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Core Java For Selenium Training']")).click();
		
		//driver.findElement(By.xpath("//a[text()=' Core Java For Selenium Trainin']")).click();
		//driver.findElement(By.xpath("(//p[@class='descrip'])[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@aria-label=\"Play\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@aria-label=\"Pause\"]")).click();
		driver.switchTo().defaultContent();
		
		driver.close();
	}

}
