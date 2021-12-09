package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Test2 {
public WebDriver driver;

@Parameter name="browserName"
@Test
public void demo(String browser) {
	if(browser.equals("chrome")) {
		driver = new ChromeDriver();
	}
	else {
		driver = new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	WebElement username = driver.findElement(By.id("email"));
	
	//WebElement createNewAccButton = driver.findElement(By.xpath("(//a[@role='button'])[5]"));
	WebElement createNewAccButton = driver.findElement(By.linkText("Create New Account"));
	
}
}
