package qedge1.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Startwith {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.get("http:\\facebook.com");
		driver.findElement(By.xpath("(//*start-with(@name,'firstname']")).sendKeys("demo");
		driver.findElement(By.xpath("(//*start-with(@name,'lastname']")). sendKeys("demo123");
		
		
		

		
		
		
	}

}
