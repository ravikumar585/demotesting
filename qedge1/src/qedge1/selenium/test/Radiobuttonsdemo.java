package qedge1.selenium.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobuttonsdemo {

	public static void main(String[] args) 
	
	{
		
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http:\\cleartrip.com");
		//System.out.println(driver.findElement(By.id("RoundTrip")).isSelected());
		//driver.findElement(By.id("RoundTrip")).click();
	//	System.out.println(driver.findElement(By.id("RoundTrip")).isSelected());
		
		if (!driver.findElement(By.id("RoundTrip")).isSelected())
		{
			
			
			driver.findElement(By.id("RoundTrip")).click();
		}
	      
		
		
		
		
		

	}

}
