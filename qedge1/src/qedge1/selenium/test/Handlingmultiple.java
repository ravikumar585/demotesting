package qedge1.selenium.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlingmultiple {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.get("http:\\gmail.com/");
		driver.findElement(By.linkText("Help")).click();
	Set  <String>	allwindows=driver.getWindowHandles();
		System.out.println(allwindows);
	
	
	}

}