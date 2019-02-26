package qedge1.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiplexpath {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
	WebDriver driver =new FirefoxDriver();
	driver.get("http:\\primusBank.qedgetech.com/siteMap.html");
	
	driver.findElement(By.xpath("//a[@href='home.aspx']")).click();
	
	//driver.get("http:\\facebook.com");
	//driver.findElement(By.xpath("//*[@id='email'  and @name='email']")).sendKeys("demo123");
	
	//driver.findElement(By.xpath("//*[@id='pass'  and @name='pass']")).sendKeys("demo");
	//driver.findElement(By.xpath("//*[@type+='submit']")).click();
}
}
