package qedge1.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Countlinks {

	public static void main(String[] args) throws InterruptedException
	{
		
		
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://apsrtconline.in/oprs-web/");
		List<WebElement> links=driver.findElements(By.xpath("html/body/div[3]/div/a"));
		System.out.println(links.size());
		for (int i = 0; i <links.size(); i++) 
		{
			String linkname=links.get(i).getText();
			links.get(i).click();
			String pgUrl=driver.getCurrentUrl();
			System.out.println(linkname+"       "+ pgUrl);
	            driver.navigate().back();
			Thread.sleep(5000);
			links=driver.findElements(By.xpath("html/body/div[3]/div/a"));
			
			
			
			
		}
		
		

	}

}
