package qedge1.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Caluapp {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.get("http:\\calc.qedgetech.com/");
		driver.findElement(By.xpath("//body/tr[2]/td[3]/input")).click();
		driver.findElement(By.xpath("//body/tr[2]/td[4]/input")).click();
		
		
		

	}

}

