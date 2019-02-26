package qedge1.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe" );
	    
		WebDriver driver =new FirefoxDriver();
		driver.get("http:\\orangehrm.qedgetech.com");
	
		//driver.get("http://gmail.com");		
		//driver.navigate().to("http://irctc.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		//String title=driver.getTitle();
		//System.out.println(title);
		//String Url=driver.getCurrentUrl();
		//System.out.println(Url);
		
		
		
		

	}
	

}
