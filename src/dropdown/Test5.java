package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("searchDropdownBox"));
		
		Select s = new Select(ele);
		s.selectByIndex(4);
		s.selectByValue("search-alias=digital-music");
		s.selectByVisibleText("Kindle Store");
		
		List<WebElement> allOptions = s.getOptions();
		System.out.println(allOptions.size());
		for(WebElement ob: allOptions) {
			System.out.println(ob.getText());
		}
		driver.close();
	}

}
