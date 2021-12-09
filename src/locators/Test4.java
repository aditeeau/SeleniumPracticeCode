package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("aditee.belhekar");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("123");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		driver.close();
	}

}
