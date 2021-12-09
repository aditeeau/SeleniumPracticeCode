package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.accuweather.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.findElement(By.name("query")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@name='query']")).sendKeys("pune");
		//Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(title.equals("Local, National, & Global Daily Weather Forecast | AccuWeather")) {
			System.out.println("Pass: Pageage is loaded");
		}
		else {
			System.out.println("Failed : TestCase is FAiled");
		}
		driver.close();
	}

}
