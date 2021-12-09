package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("(//a[@role='button'])[4]")).click();
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement ele = driver.findElement(By.xpath("//select[@title='Month']"));
		
		Select s = new Select(ele);
		List<WebElement> allOptions = s.getOptions();
		System.out.println(allOptions.size());
		ArrayList a = new ArrayList<>();
		
		for(WebElement ob: allOptions) {
			System.out.println(ob.getText());
			a.add(ob.getText());
		}
		Collections.sort(a);
		System.out.println("After sorting");
		for(Object op:a) {
			System.out.println(op);
		}
		
		driver.close();
	}

}
