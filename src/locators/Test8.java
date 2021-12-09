package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zee5.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Login")).click();
		//Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(title.equals("Login to ZEE5 & watch the Best Shows, Movies, News and More")) {
			System.out.println("Pass: Pageage is loaded");
		}
		else {
			System.out.println("Failed : TestCase is FAiled");
		}
		driver.close();
	}

}
