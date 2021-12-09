package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.id("email"));
		if(username.isDisplayed()) {
			System.out.println("pass: username is displayed");
			username.sendKeys("dsdd");
		}
		else {
			System.out.println("Failed: username not displayed");
		}
		//WebElement createNewAccButton = driver.findElement(By.xpath("(//a[@role='button'])[5]"));
		WebElement createNewAccButton = driver.findElement(By.linkText("Create New Account"));
		if(createNewAccButton.isEnabled()) {
			System.out.println("pass: Button is enabled");
			createNewAccButton.click();
		}
		else {
			System.out.println("Failed : Button is not enabled");
		}
		WebElement sexRadioButton = driver.findElement(By.xpath("//input[@name='sex']"));
		if(sexRadioButton.isSelected()) {
			System.out.println("pass: Button is selected");
		}
		else {
			System.out.println("Failed : radio button is not selected");
		}
	}

}
