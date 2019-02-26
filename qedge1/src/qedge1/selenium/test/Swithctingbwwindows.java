package qedge1.selenium.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swithctingbwwindows {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.get("http:\\gmail.com/");
		String currwindowid= driver.getWindowHandle();
		System.out.println(currwindowid);
		driver.findElement(By.linkText("Help")).click();
		System.out.println(driver.getWindowHandle());
		Set<String> allwindowsid=driver.getWindowHandles();
		System.out.println(allwindowsid);
		
		Object[] windows=allwindowsid.toArray();
		String window1=windows[0].toString();
		String window2=windows[1].toString();
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(window2);
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(window1);

		
		System.out.println(driver.getTitle());
		
		
		
		

	}

}
