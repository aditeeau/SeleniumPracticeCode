package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zee5.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@title='Rashmi Rocket Movie']")).click();
		//Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(title.equals("Watch Rashmi Rocket Full HD Movie Online on ZEE5")) {
			System.out.println("Pass: Pageage is loaded");
		}
		else {
			System.out.println("Failed : TestCase is FAiled");
		}
		driver.close();
	}

}
