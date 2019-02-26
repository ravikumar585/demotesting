package qedge1.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handleofsinlge {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.get("http:\\facebook.com/");
		String windowid=driver.getWindowHandle();
		System.out.println(windowid);
		
		
		
	}

}
