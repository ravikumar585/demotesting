package qedge1.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Buttonpres {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.get("http:\\google.com");
		String g= driver.findElement(By.name("btnK")).getAttribute("value");
		String x= driver.findElement(By.name("btnI")).getAttribute("value");
		System.out.println(g);
		System.out.println(x);
		
	


	}

}
