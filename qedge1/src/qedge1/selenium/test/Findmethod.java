package qedge1.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Findmethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		//driver.get("http:\\orangehrm.qedgetech.com");
		driver.get("http:\\primusBank.qedgetech.com/");

		
		driver.findElement(By.linkText("Site Map")).click();
	      
      	//String Url=driver.getCurrentUrl();
		//System.out.println(Url);
	    //	String title=driver.getTitle();
		//System.out.println(title);
	

		
		
				
				
				
	}

}
