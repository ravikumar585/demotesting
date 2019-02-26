package qedge1.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class Handlingsugglist {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.get("http:\\cleartrip.com");
		driver.findElement(By.id("FromTag")).sendKeys("Hyd");
		Thread.sleep(5000);
		driver.findElement(By.id("FromTag")).click();
		 List  <WebElement>  citylist;
		boolean cityexit = false;
		 citylist= driver.findElements(By.xpath("html/body/ul[1]/li/a"));
		 System.out.println(citylist.size());
		 for (int i = 0; i <citylist.size();i++) 
		 {
			    String cityname=citylist.get(i).getText();
			    System.out.println(cityname);
			   
		}	
		 String expcity,actcity;
		 expcity="Pune";
	
		boolean cityexit1 = false;
		 
		 for (int i = 0; i<citylist.size(); i++) 
		 {
			actcity=citylist.get(i).getText();
			if (actcity.toLowerCase().contains(expcity.toLowerCase()))
			{
				cityexit1=true;
				break;
			}
			
		}
		
	if (cityexit1) 
	{
		System.out.println(expcity+" is present testpass");
	}
	else
	{
		System.out.println(expcity+ " is not present test fail");
	}
		
		
	}

}

