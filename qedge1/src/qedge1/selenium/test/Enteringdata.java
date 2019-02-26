package qedge1.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Enteringdata {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.get("http:\\facebook.com");
	    driver.findElement(By.id("email")).sendKeys("demo");
	    Thread.sleep(5000);
	    driver.findElement(By.id("email")).clear();
	  
	 
	  
	    
}
}