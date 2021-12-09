package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//input[@title='Search']"));
		String value = ele.getAttribute("role");
		System.out.println(value);
		driver.close();
	}

}
