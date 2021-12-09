package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {

	@Test(invocationCount=2)
	public void settings() {
		Reporter.log("sett",true);
	}
	
	@Test(enabled=false)
	public void chat() {
		Reporter.log("chat",true);
	}
}
