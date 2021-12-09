package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("cars"));
		Select s = new Select(ele);
		s.selectByIndex(4);
		s.selectByValue("99");
		
		System.out.println(s.isMultiple());
		if(s.isMultiple())
		{
			s.deselectAll();
		}
		driver.close();
	}

}
