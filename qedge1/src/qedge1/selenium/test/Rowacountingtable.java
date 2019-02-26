package qedge1.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rowacountingtable {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https:\\money.rediff.com/tools/forex");
		WebElement curtable=driver.findElement(By.className("dataTable"));
		List<WebElement> rows=curtable.findElements(By.tagName("tr"));
		System.out.println(rows.size()-1);
		
		
		
		
		
	
	
	
	}

}
