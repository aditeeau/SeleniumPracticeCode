package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.name("login"));
		Point position = ele.getLocation();
		int x = position.getX();
		int y = position.getY();
		System.out.println("x co-ordinates " +x);
		System.out.println("y co-ordinates " +y);
		driver.close();
	}

}
