package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("aditee.belhekar");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("abcd");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("Url - " + driver.getCurrentUrl());
		if(title.equals("Facebook")) {
			System.out.println("pass: home page loaded");
		}
		else {
			System.out.println("fail: testcase failed");
		}
		driver.close();
	}

}
