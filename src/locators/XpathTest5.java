package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.findElement(By.name("username")).sendKeys("9730979721");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9730979721");
		driver.findElement(By.name("password")).sendKeys("1234");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(title.equals("Instagram")) {
			System.out.println("Pass: Homepage is loaded");
		}
		else {
			System.out.println("Failed : TestCase is FAiled");
		}
		driver.close();
	}

}
