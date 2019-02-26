package qedge1.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Empcountcols {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.get("http:\\primusBank.qedgetech.com/");
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();;
		driver.findElement(By.xpath("//*[@src='images/emp_btn.jpg']")).click();
		WebElement empltable=driver.findElement(By.id("DGBanker"));		
		List<WebElement> rows=empltable.findElements(By.tagName("tr"));
		int rowscount= rows.size()-1;
		System.out.println(rowscount);
		List<WebElement> cols;
		rows=empltable.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++)
		{
			cols=rows.get(i).findElements(By.tagName("td"));
			System.out.println("Row No:"+(i+1)     +        "No of cols:"+ cols.size());
		}		
			
			
		}
		
		
		
		

}
