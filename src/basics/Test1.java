package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String s = driver.getTitle();
		System.out.println(s);
		String u = driver.getCurrentUrl();
		System.out.println(u);
		driver.close();
	}

}
