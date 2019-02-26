package qedge1.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linksdemo {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.get("http:\\google.com");
		String linkname="Gmail";
		try {
			
			driver.findElement(By.linkText(linkname));
			System.out.println(linkname+" is present ,test pass");
		} 
		catch (Exception e) 
		{
		   System.out.println(linkname+" is not present ,test fail");
		}

		
		

	}

}
